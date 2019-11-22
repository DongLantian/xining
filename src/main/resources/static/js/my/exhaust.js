$(function () {
    // $("#app").html("nihao");
    // var u = $("#modelUser").val();
    // 定义Vue对象，与页面中元素绑定


    var app = new Vue({
        el: '#exfDom',  //绑定DOM根节点（最外层标签）的id
        data: {
            message: "Hello啊！",
            ID: "",
            exhaust: ""
        },
        methods:{
            delExhaust:function (e) {
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值

                bootbox.confirm({
                    message : "<p style='font-size: 16px;'>删除该烟囱后此编号将不可用！</p>" +
                    "<p style='font-size: 16px;'>如烟囱信息有误可点击编辑按钮进行修改。。。</p>" +
                    "<p style='font-size: 16px;'>请确认是否删除该烟囱？？？</p>",
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
                                url : "/exhaust/delExhaust", //要访问的后台地址
                                data : {
                                    exhaustID : curID
                                }, //要发送的数据，采用josn格式

                                success : function(data) { //data为返回的数据
                                    if (data.isDel=="success"){
                                        $.niftyNoty({
                                            type: "success",
                                            container : "page",
                                            title : "<br><p style='font-size: 17px;'>删除成功！！！</p>",
                                            message : "<p style='font-size: 16px;'>烟囱已删除。。。2秒后自动刷新页面。。。</p>",
                                            timer : 2000
                                        });
                                        setTimeout(function(){
                                            window.location.href="/Client/exhaust?page=1";
                                        },2000);
                                    }else if (data.isDel=="constraint"){
                                        $.niftyNoty({
                                            type: "warning",
                                            container : "floating",
                                            title : "<br><p style='font-size: 18px;'>删除失败！！！有其他设备选择了该烟囱！！！</p>",
                                            timer : 10000
                                        });
                                    }else {
                                        $.niftyNoty({
                                            type: "warning",
                                            container : "page",
                                            title : "<br><p style='font-size: 17px;'>删除失败！！！请重新登录系统并重试！！！</p>"
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
            editExhaust:function(e) {
                $("#updatePanel").removeAttr("hidden");
                $("#addPanel").attr("hidden","hidden");
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                // ajax请求。
                $.ajax({
                    type:"get",
                    dataType : "json",
                    async: false,
                    url : "/exhaust/getExhaust", //要访问的后台地址
                    data : {
                        exhaustID : curID
                    }, //要发送的数据，采用josn格式

                    success : function(data) { //data为返回的数据

                        app.exhaust=data;
                    },

                    error : function(XMLResponse) {
                        alert("没有");

                    }
                });

                layui.use('layer', function(){
                    var layer = layui.layer;

                    /*layer.msg('hello');*/
                    layer.open({
                        title :'修改烟囱信息（带*号为必填项）',
                        type: 1,
                        skin: 'layui-layer-lan',
                        area: ['1000px', '500px'],
                        content: $('#updatePanel') //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
                    });
                });
            }

        }

    })


    //修改烟囱信息
    $("#updateExhaust").click(function () {
        var bootstrapValidator = $("#updatePanel").data('bootstrapValidator');
        bootstrapValidator.validate();
        if(bootstrapValidator.isValid()){
            if (checkvalue("update")){
                // ajax请求。
                $.ajax({
                    type:"post",
                    dataType : "json",
                    url : "/exhaust/updateExhaust", //要访问的后台地址
                    contentType:"application/json",
                    data : JSON.stringify(app.exhaust), //直接传递对象给controller，
                    // 需将json对象转化成字符流,必须声明dataType和contentType
                    // 同时controller中注解requestbody

                    success : function(reponseData) { //reponseData为返回的数据
                        if (reponseData.isUpdate){
                            app.exhaust=reponseData.exhaust;
                            $.niftyNoty({
                                type: "success",
                                container : "page",
                                title : "<br><p style='font-size: 17px;'>修改成功！！！</p>",
                                timer : 2000
                            });
                            setTimeout(function(){
                                window.location.reload();//刷新当前页面.
                            },2000);
                        }else {
                            $.niftyNoty({
                                type: "warning",
                                container : "floating",
                                title : "<br><p style='font-size: 16px;'>失败！！！</p>",
                                message : "请重新填写信息并提交修改。。。",
                                timer : 6000
                            });
                        }

                    },

                    error : function(XMLResponse) {
                        alert("失败");

                    }
                });
            }
        } else {
            //必填项有空值，不可以提交
            bootbox.alert("<p style='font-size: 17px;'>所填数据不符合要求，请按提示修改。</p>");
        }

    });

    //添加烟囱按钮事件
    $("#addBtn").click(function () {
        $("#addPanel").removeAttr("hidden");
        $("#updatePanel").attr("hidden","hidden");
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
            material:{
                validators: {
                    notEmpty: {}
                }
            },
            smokeOuta:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            exfheight:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            smoke_outd:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            smoke_outtem:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            smoke_outv:{
                validators: {
                    notEmpty: {},
                    numeric: {}
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
            materialUpdate:{
                validators: {
                    notEmpty: {}
                }
            },
            smokeOutaUpdate:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            exfheightUpdate:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            smoke_outdUpdate:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            smoke_outtemUpdate:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            smoke_outvUpdate:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            longitudeUpdate: {
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
            latitudeUpdate: {
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
            }
        }

    });



});


//自定义函数：检查必填项是否为空
function  checkvalue(type) {
    var ids;
    if (type=="add"){
        ids = new Array("material", "exfheight", "smoke_outd", "smoke_outtem",
            "smoke_outv", "smokeOuta","longitude","latitude");
    }else if(type="update"){
        ids = new Array("materialUpdate", "exfheightUpdate", "smoke_outdUpdate", "smoke_outtemUpdate",
            "smoke_outvUpdate", "smokeOutaUpdate","longitudeUpdate","latitudeUpdate");
    }
    var hasEmpty=0;
    for (var i=0;i<ids.length;i++){
        if ($.trim($("#"+ids[i]).val()).length==0){
            hasEmpty=1;
            break;
        }
    }
    if (hasEmpty==1){
        return false;
    }else
        return true;

}
//自定义函数：增加烟囱
function updatedata() {
    var bootstrapValidator = $("#addPanel").data('bootstrapValidator');
    bootstrapValidator.validate();
    if(bootstrapValidator.isValid()){
        if (checkvalue("add")){
            //必填项不为空，可以提交
            var material = document.getElementById("material").value;
            var exfheight = document.getElementById("exfheight").value;
            var smoke_outtem = document.getElementById("smoke_outtem").value;
            var smoke_outd = document.getElementById("smoke_outd").value;
            var smoke_outv = document.getElementById("smoke_outv").value;
            var longitude = document.getElementById("longitude").value;
            var latitude = document.getElementById("latitude").value;
            var smokeOuta = parseInt(document.getElementById("smokeOuta").value);

            // ajax请求。
            $.ajax({
                type:"post",
                dataType : "json",
                url : "/exhaust/addExhaust", //要访问的后台地址
                data : {
                    exfMaterial : material,
                    exfHeight : exfheight,
                    smokeOutd : smoke_outd,
                    smokeOUtteM : smoke_outtem,
                    smokeOutv : smoke_outv,
                    exfLongitude : longitude,
                    exfLatitude : latitude,
                    smokeOuta : smokeOuta
                }, //要发送的数据，采用josn格式

                success : function(data) { //data为返回的数据
                    if(data.isAdd){
                        $.niftyNoty({
                            type: "success",
                            container : "page",
                            title : "<br><p style='font-size: 17px;'>成功！！！</p>",
                            message : "<p style='font-size: 16px;'>烟囱信息已添加。。。2秒后自动刷新页面。。。</p>",
                            timer : 2000
                        });
                        setTimeout(function(){
                            window.location.reload();//刷新当前页面.
                        },2000);
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
        }
    } else {
        //必填项有空值，不可以提交
        bootbox.alert("<p style='font-size: 17px;'>所填数据不符合要求，请按提示修改。</p>");
    }

}