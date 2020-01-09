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
                                        layer.msg('删除成功', {
                                            icon: 1,
                                            anim: 6,
                                            time: 2000 //2秒关闭（如果不配置，默认是3秒）
                                        }, function(index){
                                            layer.close(index);
                                            window.location.href="/Client/device?page=1";
                                        });
                                    }else if (data.isDel=="constraint"){
                                        layer.alert('删除失败！！！有原料选择了该设备！！',{icon: 5});
                                    }else {
                                        layer.alert('删除失败！！！请重新登录系统并重试！！',{icon: 5});
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
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                // ajax请求。
                $.ajax({
                    type:"get",
                    dataType : "json",
                    async: false,
                    url : "/device/getDevice", //要访问的后台地址
                    data : {
                        deviceID : curID
                    }, //要发送的数据，采用josn格式

                    success : function(data) { //data为返回的数据
                        app.device=data;
                        $("#updatemchimney").val(data.exhustId);
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
                        title :'修改设备信息',
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
                title :'添加设备',
                type: 1,
                skin: 'layui-layer-molv',
                area: ['1100px', '520px'],
                content: $('#addPanel') //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
            });
        });
    });


    //修改设备信息
    $("#updateDevice").click(function () {
        var bootstrapValidator = $("#updatePanel").data('bootstrapValidator');
        bootstrapValidator.validate();
        if(bootstrapValidator.isValid()){
            if (checkvalue("update")){
                //可以提交
                app.device.exhustNo=parseInt($("#updatemchimney").find("option:selected").text().replace(/[^0-9]/ig,""));

                app.device.exhustId = parseInt(document.getElementById("updatemchimney").value);
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
                //必填项有空值，不可以提交
                layer.alert('带*号必填！！！请填写完整。',{icon: 5});
            }
        }else {
            layer.alert('所填数据不符合要求，请按提示修改。',{icon: 5});
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
                    notEmpty: {
                        message: '必填项！需首先在烟囱页面添加烟囱。'
                    }
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
            //必填项有空值，不可以提交
            layer.alert('带*号必填！！！请填写完整。',{icon: 5});
        }
    }else {
        layer.alert('所填数据不符合要求，请按提示修改。',{icon: 5});
    }

}

