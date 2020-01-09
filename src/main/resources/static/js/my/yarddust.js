$(function () {

    // 定义Vue对象，与页面中元素绑定
    //使用Vue控制页面元素：用于编辑和删除功能
    var app = new Vue({
        el: '#exfDom',  //绑定DOM根节点（最外层标签）的id
        data: {
            yarddust: {},
            updateyarddust: [],
            updatewinddust: []
        },
        methods:{
            delyardDust:function (e) {
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                bootbox.confirm({
                    message : "<p style='font-size: 16px;'>如堆场扬尘源信息有误可点击编辑按钮进行修改。。。</p>" +
                    "<p style='font-size: 16px;'>请确认是否删除该堆场扬尘源？？？</p>",
                    buttons: {
                        confirm: {
                            label: "确认删除"
                        },
                        cancel: {
                            label: "不删了，谢谢"
                        }
                    },
                    callback : function(result) {
                        //Callback function here
                        if (result){
                            //确认后
                            $.ajax({
                                type:"post",
                                dataType : "json",
                                url : "/yardDust/delyardDust", //要访问的后台地址
                                data : {
                                    yardDustID : curID
                                }, //要发送的数据，采用josn格式

                                success : function(data) { //data为返回的数据
                                    if (data.isDel=="success"){
                                        layer.msg('删除成功', {
                                            icon: 1,
                                            anim: 6,
                                            time: 2000 //2秒关闭（如果不配置，默认是3秒）
                                        }, function(index){
                                            layer.close(index);
                                            window.location.href="/Client/auxiliaryyarddust?page=1";
                                        });
                                    }else {
                                        layer.alert('删除失败！！！请重新登录系统并重试！',{icon: 5});
                                    }
                                },

                                error : function(XMLResponse) {
                                    alert("出了点问题。");

                                }
                            });
                        }else {
                            //取消后，什么也不做
                        }
                    }
                });
            },
            edityardDust:function(e) {
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                // ajax请求。
                $.ajax({
                    type:"get",
                    dataType : "json",
                    async: false,
                    url : "/yardDust/getYardDust", //要访问的后台地址
                    data : {
                        yardID : curID
                    }, //要发送的数据，采用josn格式

                    success : function(data) { //data为返回的数据
                        app.yarddust=data;
                        app.updateyarddust=data.controlMeasures1.split(",");
                        app.updatewinddust=data.controlMeasures.split(",");
                        $("#updatendmaterialType").val(data.materialType);
                    },
                    error : function(XMLResponse) {
                        alert("没有");
                    }
                });
                layui.use(['form','layer'], function(){
                    var layer = layui.layer;
                    var form = layui.form;
                    form.render('select');

                    /*layer.msg('hello');*/
                    layer.open({
                        title :'修改堆场扬尘源',
                        type: 1,
                        skin: 'layui-layer-molv',
                        area: ['1100px', '520px'],
                        content: $('#updatePanel') //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
                    });
                });

            }

        }

    });


    $("#addBtn").click(function () {
        layui.use('layer', function(){
            var layer = layui.layer;
            layer.open({
                title :'添加堆场扬尘源',
                type: 1,
                skin: 'layui-layer-molv',
                area: ['1100px', '520px'],
                content: $('#addPanel') //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
            });
        });
    });


    //修改堆场扬尘源信息
    $("#updateyardDust").click(function () {
        var bootstrapValidator = $("#updatePanel").data('bootstrapValidator');
        bootstrapValidator.validate();
        if(bootstrapValidator.isValid()){
            //可以提交
            var yards=app.updateyarddust;
            var controlMeasures1="";
            for (var i=0;i<yards.length;i++)
            {
                controlMeasures1+=yards[i]+",";
            }
            if(controlMeasures1==""){
                controlMeasures1="无";
            }else {
                controlMeasures1 = controlMeasures1.substr(0, controlMeasures1.length - 1);
            }
            var winds=app.updatewinddust;
            var controlMeasures="";
            for (var i=0;i<winds.length;i++)
            {
                controlMeasures+=winds[i]+",";
            }
            if(controlMeasures==""){
                controlMeasures="";
            }else {
                controlMeasures = controlMeasures.substr(0, controlMeasures.length - 1);
            }
            app.yarddust.controlMeasures = controlMeasures;
            app.yarddust.controlMeasures1 = controlMeasures1;
            app.yarddust.loadingStart = document.getElementById("updatendloadingStart").value;
            app.yarddust.loadingTime = document.getElementById("updatendloadingTime").value;
            // ajax请求。
            $.ajax({
                type:"post",
                dataType : "json",
                url : "/yardDust/updateYardDust", //要访问的后台地址
                contentType:"application/json",
                data : JSON.stringify(app.yarddust), //直接传递对象给controller，
                // 需将json对象转化成字符流,必须声明dataType和contentType
                // 同时controller中注解requestbody

                success : function(reponseData) { //reponseData为返回的数据
                    if (reponseData.isUpdate){
                        app.yarddust=reponseData.yarddust;
                        layer.msg('修改成功', {
                            icon: 1,
                            anim: 6,
                            time: 2000 //2秒关闭（如果不配置，默认是3秒）
                        }, function(index){
                            layer.close(index);
                            window.location.reload();
                        });
                    }else {
                        layer.alert('请重新填写信息并提交修改。',{icon: 5});
                    }

                },

                error : function(XMLResponse) {
                    alert("失败");

                }
            });
        }else {
            layer.alert('所填数据不符合要求，请按提示修改。',{icon: 5});
        }
    });

    //数据校验
    $('#addPanel').bootstrapValidator({
        message: '这是必填项',
        /*feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },*/
        fields: {
            ndmaterialType:{
                validators: {
                    notEmpty: {}
                }
            },
            ndmoistureMateria:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            ndmaterialCapacity:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            ndloadingCount:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            ndloadingCapacity:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            ndheapCovered:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            ndheapArea:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            ndheapHeigh:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            yarddust:{
                validators: {
                    choice: {
                        min: 1
                    }
                }
            },
            winddust:{
                validators: {
                    choice: {
                        min: 1
                    }
                }
            }
        }
    });

    //数据校验
    $('#updatePanel').bootstrapValidator({
        message: '这是必填项',
        /*feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },*/
        fields: {
            updatendmaterialType:{
                validators: {
                    notEmpty: {}
                }
            },
            updatendmoistureMateria:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            updatendmaterialCapacity:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            updatendloadingCount:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            updatendloadingCapacity:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            updatendheapCovered:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            updatendheapArea:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            updatendheapHeigh:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            updateyarddust:{
                validators: {
                    choice: {
                        min: 1
                    }
                }
            },
            updatewinddust:{
                validators: {
                    choice: {
                        min: 1
                    }
                }
            }
        }

    });

});


//自定义函数：增加堆场扬尘源
function updatedata() {
    var bootstrapValidator = $("#addPanel").data('bootstrapValidator');
    bootstrapValidator.validate();
    if(bootstrapValidator.isValid()){
        //必填项不为空，可以提交
        var materialType = document.getElementById("ndmaterialType").value;

        var materialCapacity = document.getElementById("ndmaterialCapacity").value;
        var loadingCount = document.getElementById("ndloadingCount").value;
        var loadingStart = document.getElementById("ndloadingStart").value;
        var loadingTime = document.getElementById("ndloadingTime").value;

        var loadingCapacity = document.getElementById("ndloadingCapacity").value;

        var str=document.getElementsByName("winddust");
        var objarray=str.length;
        var controlMeasures="";
        for (var i=0;i<objarray;i++)
        {
            if(str[i].checked == true)
            {
                controlMeasures+=str[i].value+",";
            }
        }
        if(controlMeasures==""){
            controlMeasures="";
        }else
            controlMeasures = controlMeasures.substr(0, controlMeasures.length - 1);

        var moistureMateria = document.getElementById("ndmoistureMateria").value;

        var heapArea = document.getElementById("ndheapArea").value;
        var heapHeigh = document.getElementById("ndheapHeigh").value;
        var heapCovered = document.getElementById("ndheapCovered").value;

        //var controlMeasures1 = document.getElementById("ndcontrolMeasures1").value;
        var str=document.getElementsByName("yarddust");
        var objarray=str.length;
        var controlMeasures1="";
        for (var i=0;i<objarray;i++)
        {
            if(str[i].checked == true)
            {
                controlMeasures1+=str[i].value+",";
            }
        }
        if(controlMeasures1==""){
            controlMeasures1="";
        }else
            controlMeasures1 = controlMeasures1.substr(0, controlMeasures1.length - 1);

        // ajax请求。
        $.ajax({
            type:"post",
            dataType : "json",
            url : "/yardDust/addyardDust", //要访问的后台地址
            data : {
                materialType : materialType,
                materialCapacity : materialCapacity,
                loadingCount : loadingCount,
                loadingStart:loadingStart,
                loadingTime : loadingTime,
                loadingCapacity : loadingCapacity,
                controlMeasures : controlMeasures,
                moistureMateria : moistureMateria,
                heapArea : heapArea,
                heapHeigh : heapHeigh,
                heapCovered : heapCovered,
                controlMeasures1 : controlMeasures1

            }, //要发送的数据，采用josn格式

            success : function(data) { //data为返回的数据
                if(data.isAdd){
                    layer.msg('添加成功', {
                        icon: 1,
                        anim: 6,
                        time: 2000 //2秒关闭（如果不配置，默认是3秒）
                    }, function(index){
                        layer.close(index);
                        window.location.reload();
                    });
                }else {
                    layer.alert('添加失败。请再次尝试。',{icon: 5});
                }
            },

            error : function(XMLResponse) {
                alert("出了点问题！！！");

            }
        });
    }else {
        layer.alert('所填数据不符合要求，请按提示修改。',{icon: 5});
    }

}
