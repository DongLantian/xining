$(function () {

    // 定义Vue对象，与页面中元素绑定
    //使用Vue控制页面元素：用于编辑和删除功能
    var app = new Vue({
        el: '#exfDom',  //绑定DOM根节点（最外层标签）的id
        data: {
            workshop: {}
        },
        methods:{
            delworkshop:function (e) {
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                bootbox.confirm({
                    message : "<p style='font-size: 16px;'>如车间信息有误可点击编辑按钮进行修改。。。</p>" +
                    "<p style='font-size: 16px;'>请确认是否删除该车间？？？</p>",
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
                                url : "/workshop/delworkshop", //要访问的后台地址
                                data : {
                                    workshopID : curID
                                }, //要发送的数据，采用josn格式

                                success : function(data) { //data为返回的数据
                                    if (data.isDel=="success"){
                                        layer.msg('删除成功', {
                                            icon: 1,
                                            anim: 6,
                                            time: 2000 //2秒关闭（如果不配置，默认是3秒）
                                        }, function(index){
                                            layer.close(index);
                                            window.location.href="/Client/auxiliaryWorkshop?page=1";
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
            editworkshop:function(e) {
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                // ajax请求。
                $.ajax({
                    type:"get",
                    dataType : "json",
                    url : "/workshop/getworkshop", //要访问的后台地址
                    data : {
                        workshopID : curID
                    }, //要发送的数据，采用josn格式

                    success : function(data) { //data为返回的数据
                        app.workshop=data;
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
                        title :'修改无组织车间',
                        type: 1,
                        skin: 'layui-layer-molv',
                        area: ['1160px', '400px'],
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
                title :'添加无组织车间',
                type: 1,
                skin: 'layui-layer-molv',
                area: ['1160px', '400px'],
                content: $('#addPanel') //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
            });
        });
    });


    //修改车间信息
    $("#updateworkshop").click(function () {
        var bootstrapValidator = $("#updatePanel").data('bootstrapValidator');
        bootstrapValidator.validate();
        if(bootstrapValidator.isValid()){
            //可以提交
            // ajax请求。
            $.ajax({
                type:"post",
                dataType : "json",
                url : "/workshop/updateWorkShop", //要访问的后台地址
                contentType:"application/json",
                data : JSON.stringify(app.workshop), //直接传递对象给controller，
                // 需将json对象转化成字符流,必须声明dataType和contentType
                // 同时controller中注解requestbody

                success : function(reponseData) { //reponseData为返回的数据
                    if (reponseData.isUpdate){
                        app.workshop=reponseData.workshop;
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
            workshopid:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            productionUse: {
                validators: {
                    notEmpty: {},
                    stringLength: {
                        max: 60
                    }
                }
            },
            longitude: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 89.5833,
                        max: 103.0667,
                        message: '经度范围为%s到%s',
                    }
                }
            },
            latitude: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 31.1500,
                        max: 39.3167,
                        message: '纬度范围为%s到%s',
                    }
                }
            },
            workshopArea:{
                validators: {
                    notEmpty: {},
                    numeric: {}
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
            updateworkshopid:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            updateproductionUse: {
                validators: {
                    notEmpty: {},
                    stringLength: {
                        max: 60
                    }
                }
            },
            updatelongitude: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 89.5833,
                        max: 103.0667,
                        message: '经度范围为%s到%s',
                    }
                }
            },
            updatelatitude: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 31.1500,
                        max: 39.3167,
                        message: '纬度范围为%s到%s',
                    }
                }
            },
            updateworkshopArea:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            }
        }

    });


});

//自定义函数：增加车间
function updatedata() {
    var bootstrapValidator = $("#addPanel").data('bootstrapValidator');
    bootstrapValidator.validate();
    if(bootstrapValidator.isValid()){
        //必填项不为空，可以提交
        var workshopid = document.getElementById("workshopid").value;
        var longitude = document.getElementById("longitude").value;
        var latitude = document.getElementById("latitude").value;
        var productionUse = document.getElementById("productionUse").value;
        var workshopArea = document.getElementById("workshopArea").value;

        // ajax请求。
        $.ajax({
            type:"post",
            dataType : "json",
            url : "/workshop/addworkshop", //要访问的后台地址
            data : {
                workshopid : workshopid,
                longitude : longitude,
                latitude : latitude,
                productionUse : productionUse,
                workshopArea : workshopArea
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
