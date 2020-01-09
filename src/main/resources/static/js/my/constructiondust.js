$(function () {

    // 定义Vue对象，与页面中元素绑定
    //使用Vue控制页面元素：用于编辑和删除功能
    var app = new Vue({
        el: '#exfDom',  //绑定DOM根节点（最外层标签）的id
        data: {
            consdust: {},
            updateMonth: [],
            updatecontrol: []
        },
        methods:{
            delconsDust:function (e) {
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                bootbox.confirm({
                    message : "<p style='font-size: 16px;'>如施工扬尘源信息有误可点击编辑按钮进行修改。。。</p>" +
                    "<p style='font-size: 16px;'>请确认是否删除该施工扬尘源？？？</p>",
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
                                url : "/constructionDust/delConDust", //要访问的后台地址
                                data : {
                                    conDustID : curID
                                }, //要发送的数据，采用josn格式

                                success : function(data) { //data为返回的数据
                                    if (data.isDel=="success"){
                                        layer.msg('删除成功', {
                                            icon: 1,
                                            anim: 6,
                                            time: 2000 //2秒关闭（如果不配置，默认是3秒）
                                        }, function(index){
                                            layer.close(index);
                                            window.location.href="/Client/auxiliaryconstructiondust?page=1";
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
            editconsDust:function(e) {
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                // ajax请求。
                $.ajax({
                    type:"get",
                    dataType : "json",
                    async: false,
                    url : "/constructionDust/getConDust", //要访问的后台地址
                    data : {
                        conDustID : curID
                    }, //要发送的数据，采用josn格式

                    success : function(data) { //data为返回的数据
                        app.consdust=data;
                        app.updateMonth=data.constructMonths.split(",");
                        app.updatecontrol=data.controlMeasures.split(",");
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
                        title :'修改施工扬尘源',
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
                title :'添加施工扬尘源',
                type: 1,
                skin: 'layui-layer-molv',
                area: ['1100px', '520px'],
                content: $('#addPanel') //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
            });
        });
    });


    //修改施工扬尘源信息
    $("#updateconDust").click(function () {
        var bootstrapValidator = $("#updatePanel").data('bootstrapValidator');
        bootstrapValidator.validate();
        if(bootstrapValidator.isValid()){
            //可以提交
            var Months=app.updateMonth;
            var chestrMonth="";
            for (var i=0;i<Months.length;i++)
            {
                chestrMonth+=Months[i]+",";
            }
            if(chestrMonth==""){
                chestrMonth="无";
            }else {
                chestrMonth = chestrMonth.substr(0, chestrMonth.length - 1);
            }
            var Controls=app.updatecontrol;
            var controlMeasures="";
            for (var i=0;i<Controls.length;i++)
            {
                controlMeasures+=Controls[i]+",";
            }
            if(controlMeasures==""){
                controlMeasures="";
            }else {
                controlMeasures = controlMeasures.substr(0, controlMeasures.length - 1);
            }
            app.consdust.constructMonths = chestrMonth;
            app.consdust.controlMeasures = controlMeasures;
            app.consdust.startdate = document.getElementById("updatenstartdate").value;
            app.consdust.finishdate = document.getElementById("updatenfinishdate").value;
            // ajax请求。
            $.ajax({
                type:"post",
                dataType : "json",
                url : "/constructionDust/updateConDust", //要访问的后台地址
                contentType:"application/json",
                data : JSON.stringify(app.consdust), //直接传递对象给controller，
                // 需将json对象转化成字符流,必须声明dataType和contentType
                // 同时controller中注解requestbody

                success : function(reponseData) { //reponseData为返回的数据
                    if (reponseData.isUpdate){
                        app.roaddust=reponseData.roaddust;
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
            nconstructionType:{
                validators: {
                    notEmpty: {}
                }
            },
            nconstructState:{
                validators: {
                    notEmpty: {}
                }
            },
            nconstructArea:{
                validators: {
                    notEmpty: {}
                }
            },
            control:{
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
            updatenconstructArea:{
                validators: {
                    notEmpty: {}
                }
            },
            updatecontrol:{
                validators: {
                    choice: {
                        min: 1
                    }
                }
            }
        }

    });

});


//自定义函数：增加施工扬尘源
function updatedata() {
    var bootstrapValidator = $("#addPanel").data('bootstrapValidator');
    bootstrapValidator.validate();
    if(bootstrapValidator.isValid()){
        //必填项不为空，可以提交
        var constructionType = document.getElementById("nconstructionType").value;
        var constructState = document.getElementById("nconstructState").value;
        var constructArea = document.getElementById("nconstructArea").value;
        var nowkgarea = document.getElementById("nnowkgarea").value;
        var startdate = document.getElementById("nstartdate").value;
        var finishdate = document.getElementById("nfinishdate").value;

        var strMonth=document.getElementsByName("Month");
        var objarray=strMonth.length;
        var chestrMonth="";
        for (var i=0;i<objarray;i++)
        {
            if(strMonth[i].checked == true)
            {
                chestrMonth+=strMonth[i].value+",";
            }
        }
        if(chestrMonth==""){
            chestrMonth="无";
        }else
            chestrMonth = chestrMonth.substr(0, chestrMonth.length - 1);

        var str=document.getElementsByName("control");
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
        // ajax请求。
        $.ajax({
            type:"post",
            dataType : "json",
            url : "/constructionDust/addconDust", //要访问的后台地址
            data : {
                constructionType : constructionType ,
                constructState : constructState,
                constructArea  : constructArea,
                nowkgarea : nowkgarea,
                startdate : startdate,
                finishdate : finishdate,
                constructMonths : chestrMonth ,
                controlMeasures : controlMeasures

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
