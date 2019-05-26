$(function () {


    //烟囱下拉菜单初始化
    $.ajax({
        type:"post",
        dataType : "json",
        url : "/common/getExhaustList", //要访问的后台地址
        data : {},                             //要发送的数据，采用josn格式

        success : function(list) { //list为返回的数据
            //使用jQuery的each方法遍历，index是下标。使用for循环遍历也可以。
            $.each(list,function (index,item) {
                var $option = $("<option></option>");
                $option.attr("value", item.exfId);
                $option.text('烟囱'+item.nkNo+'号');
                $("#updatemchimney").append($option);
                $("#mchimney").append("<option value="+item.exfId+">烟囱"+item.nkNo+"号</option>");
            })
        },
        error : function(XMLResponse) {
            alert(XMLResponse.responseText);

        }
    });

    // 定义Vue对象，与页面中元素绑定
    //使用Vue控制页面元素：用于编辑和删除功能
    var app = new Vue({
        el: '#exfDom',  //绑定DOM根节点（最外层标签）的id
        data: {
            device: {}
        },
        methods:{
            delDevice:function (e) {
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即device.id值
                bootbox.confirm({
                    message : "<p style='font-size: 16px;'>删除该设备后此编号将不可用！</p>" +
                    "<p style='font-size: 16px;'>如设备信息有误可点击编辑按钮进行修改。。。</p>" +
                    "<p style='font-size: 16px;'>请确认是否删除该设备？？？</p>",
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
                                url : "/device/delDevice", //要访问的后台地址
                                data : {
                                    deviceID : curID
                                }, //要发送的数据，采用josn格式

                                success : function(data) { //data为返回的数据
                                    if (data.isDel=="success"){
                                        $.niftyNoty({
                                            type: "success",
                                            container : "page",
                                            title : "<br><p style='font-size: 17px;'>删除成功！！！</p>",
                                            message : "<p style='font-size: 16px;'>设备已删除。。。6秒后自动刷新页面。。。</p>",
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
            editDevice:function(e) {
                $("#updatePanel").removeAttr("hidden");
                $("#addPanel").attr("hidden","hidden");
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                // ajax请求。
                $.ajax({
                    type:"get",
                    dataType : "json",
                    url : "/device/getDevice", //要访问的后台地址
                    data : {
                        deviceID : curID
                    }, //要发送的数据，采用josn格式

                    success : function(data) { //data为返回的数据
                        app.device=data;
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


    //修改窑炉信息
    $("#updateDevice").click(function () {
        var bootstrapValidator = $("#updatePanel").data('bootstrapValidator');
        bootstrapValidator.validate();
        if(bootstrapValidator.isValid()){
            if (checkvalue("update")){
                //可以提交
                app.device.exhustNo=parseInt($("#updatemchimney").find("option:selected").text().replace(/[^0-9]/ig,""));

                // ajax请求。
                $.ajax({
                    type:"post",
                    dataType : "json",
                    url : "/device/updateDevice", //要访问的后台地址
                    contentType:"application/json",
                    data : JSON.stringify(app.device), //直接传递对象给controller，
                    // 需将json对象转化成字符流,必须声明dataType和contentType
                    // 同时controller中注解requestbody

                    success : function(reponseData) { //reponseData为返回的数据
                        if (reponseData.isUpdate){
                            app.device=reponseData.device;
                            $.niftyNoty({
                                type: "success",
                                container : "page",
                                title : "<br><p style='font-size: 17px;'>成功！！！</p>",
                                message : "<p style='font-size: 16px;'>锅炉信息已经修改。。。6秒后将自动刷新当前页面。。。</p>",
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
                //必填项有空值，不可以提交
                bootbox.alert("<p style='font-size: 17px;'>带*号必填！！！请填写完整。。。</p>");
            }
        }else {
            bootbox.alert("<p style='font-size: 17px;'>所填数据不符合要求，请按提示修改。。。</p>");
        }
    });

    //数据校验
    $('#addPanel').bootstrapValidator({
        message: '这是必填项',
        fields: {
            name: {
                validators: {
                    notEmpty: {},
                    stringLength: {
                        max: 100
                    }
                }
            },
            deviceFlow: {
                validators: {
                    notEmpty: {},
                    stringLength: {
                        max: 100
                    }
                }
            },
            designPower:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            practicalPower:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            designUnit: {
                validators: {
                    notEmpty: {},
                    stringLength: {
                        max: 20
                    }
                }
            },
            yearrunDays: {
                validators: {
                    notEmpty: {},
                    between: {
                        min: 0,
                        max: 366
                    }
                }
            },
            mchimney:{
                validators: {
                    notEmpty: {}
                }
            }

        }
    });

    //数据校验
    $('#updatePanel').bootstrapValidator({
        message: '这是必填项',
        fields: {
            updatename: {
                validators: {
                    notEmpty: {},
                    stringLength: {
                        max: 100
                    }
                }
            },
            updatedeviceFlow: {
                validators: {
                    notEmpty: {},
                    stringLength: {
                        max: 100
                    }
                }
            },
            updatedesignPower:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            updatepracticalPower:{
                validators: {
                    notEmpty: {},
                    numeric: {}
                }
            },
            updatedesignUnit: {
                validators: {
                    notEmpty: {},
                    stringLength: {
                        max: 20
                    }
                }
            },
            updateyearrunDays: {
                validators: {
                    notEmpty: {},
                    between: {
                        min: 0,
                        max: 366
                    }
                }
            },
            updatemchimney:{
                validators: {
                    notEmpty: {}
                }
            }

        }

    });

});


//自定义函数：检查必填项是否为空
function  checkvalue(type) {
    var ids;
    if (type=="add"){
        ids = new Array("name",  "deviceFlow", "designPower",
            "practicalPower","designUnit", "yearrunDays");
    }else if(type="update"){
        ids = new Array("updatename",  "updatedeviceFlow", "updatedesignPower",
            "updatepracticalPower","updatedesignUnit", "updateyearrunDays");
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

//自定义函数：增加窑炉
function updatedata() {
    var bootstrapValidator = $("#addPanel").data('bootstrapValidator');
    bootstrapValidator.validate();
    if(bootstrapValidator.isValid()){
        if (checkvalue("add")){

            //必填项不为空，可以提交
            var mchimney = parseInt(document.getElementById("mchimney").value);
            var exhustNo = parseInt($("#mchimney").find("option:selected").text().replace(/[^0-9]/ig,""));

            var name = document.getElementById("name").value;
            var deviceNo = document.getElementById("deviceNo").value;
            var deviceFlow = document.getElementById("deviceFlow").value;
            var designPower = document.getElementById("designPower").value;
            var practicalPower = document.getElementById("practicalPower").value;
            var yearrunDays = document.getElementById("yearrunDays").value;
            var designUnit =document.getElementById("designUnit").value;

            // ajax请求。
            $.ajax({
                type:"post",
                dataType : "json",
                url : "/device/addDevice", //要访问的后台地址
                data : {
                    name : name,
                    deviceNo : deviceNo,
                    deviceFlow : deviceFlow,
                    designPower : designPower,
                    practicalPower : practicalPower,
                    yearrunDays : yearrunDays,
                    designUnit:designUnit,
                    exhustNo:exhustNo,
                    exhustId : mchimney

                }, //要发送的数据，采用josn格式

                success : function(data) { //data为返回的数据
                    if(data.isAdd){
                        $.niftyNoty({
                            type: "success",
                            container : "page",
                            title : "<br><p style='font-size: 17px;'>成功！！！</p>",
                            message : "<p style='font-size: 16px;'>设备信息已添加。。。6秒后自动刷新页面。。。</p>",
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
                            message : "<p style='font-size: 16px;'>请重新填写设备信息并添加。</p>",
                            timer : 6000
                        });
                    }
                },

                error : function(XMLResponse) {
                    alert("出了点问题！！！");

                }
            });
        }else {
            //必填项有空值，不可以提交
            $.niftyNoty({
                type: "warning",
                container : "floating",
                title : "<br><p style='font-size: 18px;'>带*号必填！！！请填写完整。。。</p>",
                timer : 5000
            });
        }
    }else {
        bootbox.alert("<p style='font-size: 17px;'>所填数据不符合要求，请根据提示修改。。。</p>");
    }

}

//自定义函数：选中烟囱时显示烟囱参数
function exhaustModel(exhustId,select){

    if(exhustId!=''){
        $.ajax({
            type:"get",
            dataType : "json",
            url : "/exhaust/getExhaust", //要访问的后台地址
            data : {
                exhaustID : exhustId
            }, //要发送的数据，采用josn格式
            success : function(data) { //data为返回的数据
                if (select=="update"){

                    $("#updateexaust_info").html("<b style='color:purple'>烟囱"
                        + data.nkNo + "号的详细信息：</br>"
                        + "材质："+data.exfMaterial+"，高度："+data.exfHeight+"，出口直径："+data.smokeOutd
                        + "，出口温度："+data.smokeOUtteM+"，出口流速："+data.smokeOutv+"，烟气流量："+data.smokeOuta
                        + "</b>");
                }else {
                    $("#exaust_info").html("<b style='color:purple'>烟囱"
                        + data.nkNo + "号的详细信息：</br>"
                        + "材质："+data.exfMaterial+"，高度："+data.exfHeight+"，出口直径："+data.smokeOutd
                        + "，出口温度："+data.smokeOUtteM+"，出口流速："+data.smokeOutv+"，烟气流量："+data.smokeOuta
                        + "</b>");
                }
            }
        });

    } else {
        document.getElementById("exaust_info").innerHTML = "<b style='color:purple'></b>";
    }
}

