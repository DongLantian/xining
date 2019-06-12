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
                                        $.niftyNoty({
                                            type: "success",
                                            container : "page",
                                            title : "<br><p style='font-size: 17px;'>删除成功！！！</p>",
                                            message : "<p style='font-size: 16px;'>车间已删除。。。6秒后自动刷新页面。。。</p>",
                                            timer : 5000
                                        });
                                        setTimeout(function(){
                                            window.location.reload();//刷新当前页面.
                                        },6000);
                                    }else {
                                        $.niftyNoty({
                                            type: "warning",
                                            container : "page",
                                            title : "<br><p style='font-size: 17px;'>删除失败！！！请重新登录系统并重试！！！</p>",
                                            timer : 5000
                                        });
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
                $("#updatePanel").removeAttr("hidden");
                $("#addPanel").attr("hidden","hidden");
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

            }

        }

    });


    $("#addBtn").click(function () {
        $("#addPanel").removeAttr("hidden");
        $("#updatePanel").attr("hidden","hidden");
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
                        $.niftyNoty({
                            type: "success",
                            container : "page",
                            title : "<br><p style='font-size: 17px;'>成功！！！</p>",
                            message : "<p style='font-size: 16px;'>车间信息已经修改。。。6秒后将自动刷新当前页面。。。</p>",
                            timer : 5000
                        });
                        setTimeout(function(){
                            window.location.reload();//刷新当前页面.
                        },6000);
                    }else {
                        bootbox.alert("<p style='font-size: 17px;'>失败！！！</p>" +
                            "<p style='font-size: 17px;'>请重新填写信息并提交修改。。。</p>");
                    }

                },

                error : function(XMLResponse) {
                    alert("失败");

                }
            });
        }else {
            bootbox.alert("<p style='font-size: 17px;'>所填数据不符合要求，请按提示修改。。。</p>");
        }
    });

    //数据校验
    $('#addPanel').bootstrapValidator({
        message: '这是必填项',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
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
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
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
                    $.niftyNoty({
                        type: "success",
                        container : "page",
                        title : "<br><p style='font-size: 17px;'>成功！！！</p>",
                        message : "<p style='font-size: 16px;'>车间信息已添加。。。6秒后自动刷新页面。。。</p>",
                        timer : 5000
                    });
                    setTimeout(function(){
                        window.location.reload();//刷新当前页面.
                    },6000);
                }else {
                    $.niftyNoty({
                        type: "warning",
                        container : "page",
                        title : "<br><p style='font-size: 17px;'>失败！！！</p>",
                        message : "<p style='font-size: 16px;'>请重新填写车间信息并添加。</p>",
                        timer : 6000
                    });
                }
            },

            error : function(XMLResponse) {
                alert("出了点问题！！！");

            }
        });
    }else {
        bootbox.alert("<p style='font-size: 17px;'>所填数据不符合要求，请根据提示修改。。。</p>");
    }

}
