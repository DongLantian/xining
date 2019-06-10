$(function () {

    // 定义Vue对象，与页面中元素绑定
    //使用Vue控制页面元素：用于编辑和删除功能
    var app = new Vue({
        el: '#exfDom',  //绑定DOM根节点（最外层标签）的id
        data: {
            roaddust: {}
        },
        methods:{
            delroadDust:function (e) {
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                bootbox.confirm({
                    message : "<p style='font-size: 16px;'>如道路扬尘源信息有误可点击编辑按钮进行修改。。。</p>" +
                    "<p style='font-size: 16px;'>请确认是否删除该道路扬尘源？？？</p>",
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
                                url : "/roadDust/delRoadDust", //要访问的后台地址
                                data : {
                                    roadDustID : curID
                                }, //要发送的数据，采用josn格式

                                success : function(data) { //data为返回的数据
                                    if (data.isDel=="success"){
                                        $.niftyNoty({
                                            type: "success",
                                            container : "page",
                                            title : "<br><p style='font-size: 17px;'>删除成功！！！</p>",
                                            message : "<p style='font-size: 16px;'>道路扬尘源已删除。。。6秒后自动刷新页面。。。</p>",
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
            editroadDust:function(e) {
                $("#updatePanel").removeAttr("hidden");
                $("#addPanel").attr("hidden","hidden");
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                // ajax请求。
                $.ajax({
                    type:"get",
                    dataType : "json",
                    url : "/roadDust/getRoadDust", //要访问的后台地址
                    data : {
                        roadDustID : curID
                    }, //要发送的数据，采用josn格式

                    success : function(data) { //data为返回的数据
                        app.roaddust=data;
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


    //修改道路扬尘源信息
    $("#updateroadDust").click(function () {
        var bootstrapValidator = $("#updatePanel").data('bootstrapValidator');
        bootstrapValidator.validate();
        if(bootstrapValidator.isValid()){
            //可以提交
            if(app.roaddust.ispave==1){
                app.roaddust.scccode="1602001003";
            }
            else{
                app.roaddust.scccode="1602002000";
            }
            // ajax请求。
            $.ajax({
                type:"post",
                dataType : "json",
                url : "/roadDust/updateRoadDust", //要访问的后台地址
                contentType:"application/json",
                data : JSON.stringify(app.roaddust), //直接传递对象给controller，
                // 需将json对象转化成字符流,必须声明dataType和contentType
                // 同时controller中注解requestbody

                success : function(reponseData) { //reponseData为返回的数据
                    if (reponseData.isUpdate){
                        app.roaddust=reponseData.roaddust;
                        $.niftyNoty({
                            type: "success",
                            container : "page",
                            title : "<br><p style='font-size: 17px;'>成功！！！</p>",
                            message : "<p style='font-size: 16px;'>道路扬尘源信息已经修改。。。6秒后将自动刷新当前页面。。。</p>",
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
            pathLength:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            averWidth:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            averWeight:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            carFlow:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            averSpeed:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            clearTimeInstall:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            clearTimeUninstall:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            sweepSpring:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            sweepSummer:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            sweepFall:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            waterTimesSpring:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            waterTimesSummer:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            waterTimesFall:{
                validators: {
                    notEmpty: {},
                    integer: {}
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
            updatepathLength:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            updateaverWidth:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            updateaverWeight:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            updatecarFlow:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            updateaverSpeed:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            updateclearTimeInstall:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            updateclearTimeUninstall:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            updatesweepSpring:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            updatesweepSummer:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            updatesweepFall:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            updatewaterTimesSpring:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            updatewaterTimesSummer:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            updatewaterTimesFall:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            }
        }

    });

});


//自定义函数：增加道路扬尘源
function updatedata() {
    var bootstrapValidator = $("#addPanel").data('bootstrapValidator');
    bootstrapValidator.validate();
    if(bootstrapValidator.isValid()){
        //必填项不为空，可以提交
        var companyName = document.getElementById("companyName").innerHTML;
        var pathLength = document.getElementById("pathLength").value;
        var ispave = document.getElementById("ispave").value;
        var averWidth = document.getElementById("averWidth").value;
        var averWeight = document.getElementById("averWeight").value;
        var carFlow = document.getElementById("carFlow").value;
        var averSpeed = document.getElementById("averSpeed").value;
        var clearTimeInstall = document.getElementById("clearTimeInstall").value;
        var clearTimeUninstall = document.getElementById("clearTimeUninstall").value;
        var sweepSpring = document.getElementById("sweepSpring").value;
        var sweepSummer = document.getElementById("sweepSummer").value;
        var sweepFall = document.getElementById("sweepFall").value;
        var waterTimesSpring = document.getElementById("waterTimesSpring").value;
        var waterTimesSummer = document.getElementById("waterTimesSummer").value;
        var waterTimesFall = document.getElementById("waterTimesFall").value;
        var dustSuppression = document.getElementById("dustSuppression").value;
        var scc;
        if(ispave==1){
            scc="1602001003";
        }
        else{
            scc="1602002000";
        }


        // ajax请求。
        $.ajax({
            type:"post",
            dataType : "json",
            url : "/roadDust/addRoadDust", //要访问的后台地址
            data : {
                scccode:scc,
                companyName: companyName,
                pathLength : pathLength,
                ispave : ispave,
                averWidth : averWidth,
                averWeight : averWeight ,
                carFlow : carFlow,
                averSpeed  : averSpeed,
                clearTimeInstall : clearTimeInstall,
                clearTimeUninstall : clearTimeUninstall,
                sweepSpring : sweepSpring,
                sweepSummer : sweepSummer,
                sweepFall : sweepFall ,
                waterTimesSpring : waterTimesSpring,
                waterTimesSummer : waterTimesSummer,
                waterTimesFall : waterTimesFall ,
                dustSuppression : dustSuppression

            }, //要发送的数据，采用josn格式

            success : function(data) { //data为返回的数据
                if(data.isAdd){
                    $.niftyNoty({
                        type: "success",
                        container : "page",
                        title : "<br><p style='font-size: 17px;'>成功！！！</p>",
                        message : "<p style='font-size: 16px;'>锅炉信息已添加。。。6秒后自动刷新页面。。。</p>",
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
                        message : "<p style='font-size: 16px;'>请重新填写烟囱信息并添加。</p>",
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
