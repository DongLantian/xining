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
                                        $.niftyNoty({
                                            type: "success",
                                            container : "page",
                                            title : "<br><p style='font-size: 17px;'>删除成功！！！</p>",
                                            message : "<p style='font-size: 16px;'>施工扬尘源已删除。。。6秒后自动刷新页面。。。</p>",
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
            editconsDust:function(e) {
                $("#updatePanel").removeAttr("hidden");
                $("#addPanel").attr("hidden","hidden");
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                // ajax请求。
                $.ajax({
                    type:"get",
                    dataType : "json",
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

            }

        }

    });


    $("#addBtn").click(function () {
        $("#addPanel").removeAttr("hidden");
        $("#updatePanel").attr("hidden","hidden");
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
                        $.niftyNoty({
                            type: "success",
                            container : "page",
                            title : "<br><p style='font-size: 17px;'>成功！！！</p>",
                            message : "<p style='font-size: 16px;'>施工扬尘源信息已经修改。。。6秒后将自动刷新当前页面。。。</p>",
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
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
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
