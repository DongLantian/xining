//1.页面加载时：初始化Scc第一级下拉菜单（update和add同时初始化）
$(function () {
        //锅炉用途菜单初始化
        $.ajax({
            type:"post",
            dataType : "json",
            async: false,
            url : "/scc/loadSelectA", //要访问的后台地址
            data : {
                scc1ID: '10'
            },                             //要发送的数据，采用josn格式

            success : function(list) { //list为返回的数据
                //使用jQuery的each方法遍历，index是下标。使用for循环遍历也可以。
                $.each(list,function (index,item) {
                    var $option = $("<option></option>");
                    $option.attr("value", item.scc2);
                    $option.text(item.description+'('+item.scc2+')');
                    $("#updatefunctio").append($option);
                    $("#functio").append("<option value="+item.scc2+">"+item.description+"("+item.scc2+")</option>");
                })
            },
            error : function(XMLResponse) {
                alert(XMLResponse.responseText);

            }
        });

        //烟囱下拉菜单初始化
        $.ajax({
            type:"post",
            dataType : "json",
            async: false,
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
                boiler: {}
            },
            methods:{
                delBoiler:function (e) {
                    var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                    var curID = cur.value;      //获取button的value，即exhaust.exfId值

                    bootbox.confirm({
                        message : "<p style='font-size: 16px;'>删除该锅炉后此编号将不可用！</p>" +
                        "<p style='font-size: 16px;'>如锅炉信息有误可点击编辑按钮进行修改。。。</p>" +
                        "<p style='font-size: 16px;'>请确认是否删除该锅炉？？？</p>",
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
                                    url : "/boiler/delBoiler", //要访问的后台地址
                                    data : {
                                        boilerID : curID
                                    }, //要发送的数据，采用josn格式

                                    success : function(data) { //data为返回的数据
                                        if (data.isDel=="success"){
                                            if (data.isDel=="success"){
                                                layer.msg('删除成功', {
                                                    icon: 1,
                                                    anim: 6,
                                                    time: 2000 //2秒关闭（如果不配置，默认是3秒）
                                                }, function(index){
                                                    layer.close(index);
                                                    window.location.href="/Client/boilershell?page=1";
                                                });
                                        }else {
                                                layer.alert('删除失败！！！请重新登录系统并重试！',{icon: 5});
                                            }
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
                editBoiler:function(e) {
                    var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                    var curID = cur.value;      //获取button的value，即exhaust.exfId值
                    // ajax请求。
                    $.ajax({
                        type:"get",
                        dataType : "json",
                        async: false,
                        url : "/boiler/getBoiler", //要访问的后台地址
                        data : {
                            boilerID : curID
                        }, //要发送的数据，采用josn格式

                        success : function(data) { //data为返回的数据
                            app.boiler=data;
                            $("#updatefunctio_input").val(data.functio);
                            $("#updatefueltype_input").val(data.fueltype);
                            $("#updatemodel_input").val(data.model);
                            $("#updatefunctio").val(data.functio);
                            clientscc3('10',data.functio,'updatefueltype','updatemodel');
                            clientscc4('10','updatefunctio_input',data.fueltype,'updatemodel');
                            app.initSelect(data);
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
                            title :'修改锅炉信息',
                            type: 1,
                            skin: 'layui-layer-molv',
                            area: ['1100px', '520px'],
                            content: $('#updatePanel') //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
                        });
                    });


                },
                initSelect:function (data) {
                    var fuelInput = $("#updatefueltype_input").val();
                    var modelInput = $("#updatemodel_input").val();
                    $("#updatefueltype").val(fuelInput);
                    $("#updatemodel").val(modelInput);
                    $("#updatecombustionsystem").val(data.combustionsystem);
                    $("#updatefuelAusageunit").val(data.fuelAusageunit);
                    $("#updatedustremoveId").val(data.dustremoveId);
                    $("#updatesulphurremoveId").val(data.sulphurremoveId);
                    $("#updatenitreremoveId").val(data.nitreremoveId);
                    $("#updatemchimney").val(data.exhustId);
                }

            }

        });


        $("#addBtn").click(function () {
            layui.use('layer', function(){
                var layer = layui.layer;
                layer.open({
                    title :'添加锅炉',
                    type: 1,
                    skin: 'layui-layer-molv',
                    area: ['1100px', '520px'],
                    content: $('#addPanel') //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
                });
            });
        });
        //修改锅炉信息
        $("#updateBoiler").click(function () {
            var bootstrapValidator = $("#updatePanel").data('bootstrapValidator');
            bootstrapValidator.validate();
            if(bootstrapValidator.isValid()){
                if (checkvalue("update")){
                    //可以提交
                    app.boiler.functio = $("#updatefunctio").val();
                    app.boiler.fueltype = $("#updatefueltype").val();
                    app.boiler.model = $("#updatemodel").val();
                    app.boiler.functionDec = $("#updatefunctio").find("option:selected").text();
                    app.boiler.fueltypeDec = $("#updatefueltype").find("option:selected").text();
                    app.boiler.modelDec = $("#updatemodel").find("option:selected").text();
                    app.boiler.exfNo = parseInt($("#updatemchimney").find("option:selected").text().replace(/[^0-9]/ig,""));

                    app.boiler.exhustId = parseInt(document.getElementById("updatemchimney").value);
                    app.boiler.combustionsystem = document.getElementById("updatecombustionsystem").value;
                    app.boiler.fuelAusageunit = document.getElementById("updatefuelAusageunit").value;
                    app.boiler.dustremoveId = document.getElementById("updatedustremoveId").value;
                    app.boiler.sulphurremoveId  = document.getElementById("updatesulphurremoveId").value;
                    app.boiler.nitreremoveId = document.getElementById("updatenitreremoveId").value;

                    // ajax请求。
                    $.ajax({
                        type:"post",
                        dataType : "json",
                        url : "/boiler/updateBoiler", //要访问的后台地址
                        contentType:"application/json",
                        data : JSON.stringify(app.boiler), //直接传递对象给controller，
                        // 需将json对象转化成字符流,必须声明dataType和contentType
                        // 同时controller中注解requestbody

                        success : function(reponseData) { //reponseData为返回的数据
                            if (reponseData.isUpdate){
                                app.boiler=reponseData.boiler;
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
                functio:{
                    validators: {
                        notEmpty: {}
                    }
                },
                fueltype:{
                    validators: {
                        notEmpty: {}
                    }
                },
                model:{
                    validators: {
                        notEmpty: {}
                    }
                },
                mchimney:{
                    validators: {
                        notEmpty: {
                            message: '必填项！需首先在烟囱页面添加烟囱。'
                        }
                    }
                },
                machineNo: {
                    validators: {
                        notEmpty: {},
                        stringLength: {
                            max: 50
                        }
                    }
                },
                installedCapacity:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                no:{
                    validators: {
                        notEmpty: {},
                        integer: {}
                    }
                },
                version: {
                    validators: {
                        notEmpty: {},
                        stringLength: {
                            max: 100
                        }
                    }
                },
                tons:{
                    validators: {
                        notEmpty: {},
                        between: {
                            min: 0,
                            max: 5000
                        }
                    }
                },
                coalash: {
                    validators: {
                        notEmpty: {},
                        between: {
                            min: 0,
                            max: 45
                        }
                    }
                },
                coalsulfur:{
                    validators: {
                        notEmpty: {},
                        between: {
                            min: 0,
                            max: 3
                        }
                    }
                },
                coalVolatilisation:{
                    validators: {
                        notEmpty: {},
                        between: {
                            min: 0,
                            max: 50
                        }
                    }
                },
                fuelAusage:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                feiqiti:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                so2out:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                noxout:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                pmout:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                janUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                febUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                marUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                aprUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                mayUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                juneUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                julyUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                augUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                septUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                octUseAmount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                novUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                decUseamount:{
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
            fields: {
                updatefunctio:{
                    validators: {
                        notEmpty: {}
                    }
                },
                updatefueltype:{
                    validators: {
                        notEmpty: {}
                    }
                },
                updatemodel:{
                    validators: {
                        notEmpty: {}
                    }
                },
                updatemchimney:{
                    validators: {
                        notEmpty: {}
                    }
                },
                updatemachineNo: {
                    validators: {
                        notEmpty: {},
                        stringLength: {
                            max: 50
                        }
                    }
                },
                updateinstalledCapacity:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updateno:{
                    validators: {
                        notEmpty: {},
                        integer: {}
                    }
                },
                updateversion: {
                    validators: {
                        notEmpty: {},
                        stringLength: {
                            max: 100
                        }
                    }
                },
                updatetons:{
                    validators: {
                        notEmpty: {},
                        between: {
                            min: 0,
                            max: 5000
                        }
                    }
                },
                updatecoalash: {
                    validators: {
                        notEmpty: {},
                        between: {
                            min: 0,
                            max: 45
                        }
                    }
                },
                updatecoalsulfur:{
                    validators: {
                        notEmpty: {},
                        between: {
                            min: 0,
                            max: 3
                        }
                    }
                },
                updatecoalVolatilisation:{
                    validators: {
                        notEmpty: {},
                        between: {
                            min: 0,
                            max: 50
                        }
                    }
                },
                updatefuelAusage:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updatefeiqiti:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updateso2out:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updatenoxout:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updatepmout:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updatejanUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updatefebUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updatemarUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updateaprUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updatemayUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updatejuneUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updatejulyUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updateaugUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updateseptUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updateoctUseAmount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updatenovUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                },
                updatedecUseamount:{
                    validators: {
                        notEmpty: {},
                        numeric: {}
                    }
                }
            }
        });

    });



//自定义函数：检查必填项是否为空
function  checkvalue(type) {
    var ids;
    if (type=="add"){
        ids = new Array("functio", "fueltype", "model", "no", "version",
            "tons", "coalsulfur",  "fuelAusage",
            "fuelAusageunit", "mchimney", "feiqiti", "so2out", "noxout",
            "pmout","coalash","coalVolatilisation","machineNo","installedCapacity",
            "janUseamount", "febUseamount","marUseamount",
            "aprUseamount","mayUseamount","juneUseamount",
            "julyUseamount","augUseamount","septUseamount","octUseAmount","novUseamount","decUseamount");
    }else if(type="update"){
        ids = new Array("updatefunctio", "updatefueltype", "updatemodel", "updateno", "updateversion",
            "updatetons", "updatecoalsulfur", "updatefuelAusage",
            "updatefuelAusageunit", "updatemchimney", "updatefeiqiti", "updateso2out", "updatenoxout",
            "updatepmout","updatecoalash","updatecoalVolatilisation","updatemachineNo","updateinstalledCapacity",
            "updatejanUseamount", "updatefebUseamount","updatemarUseamount",
            "updateaprUseamount","updatemayUseamount","updatejuneUseamount",
            "updatejulyUseamount","updateaugUseamount","updateseptUseamount","updateoctUseAmount","updatenovUseamount","updatedecUseamount");
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

//自定义函数：增加锅炉
function updatedata() {
    var bootstrapValidator = $("#addPanel").data('bootstrapValidator');
    bootstrapValidator.validate();
    if(bootstrapValidator.isValid()){
        if (checkvalue("add")){
            //必填项不为空，可以提交
            var functio = document.getElementById("functio").value;
            var functiondec = $("#functio").find("option:selected").text();
            var fueltype = document.getElementById("fueltype").value;
            var fueltypeDec = $("#fueltype").find("option:selected").text();
            var model = document.getElementById("model").value;
            var modelDec = $("#model").find("option:selected").text();

            var no = document.getElementById("no").value;
            var version = document.getElementById("version").value;
            var tons = document.getElementById("tons").value;
            var coalsulfur = document.getElementById("coalsulfur").value;
            var combustionsystem = document.getElementById("combustionsystem").value;
            var fuelAusage = document.getElementById("fuelAusage").value;
            var fuelAusageunit = document.getElementById("fuelAusageunit").value;
            var chimney = parseInt(document.getElementById("mchimney").value);
            var so2out = document.getElementById("so2out").value;
            var feiqiti = document.getElementById("feiqiti").value;
            var noxout = document.getElementById("noxout").value;
            var pmout = document.getElementById("pmout").value;

            var coalash = document.getElementById("coalash").value;
            var coalVolatilisation = document.getElementById("coalVolatilisation").value;
            var machineNo = document.getElementById("machineNo").value;
            var installedCapacity = document.getElementById("installedCapacity").value;

            var janUseamount = document.getElementById("janUseamount").value;
            var febUseamount = document.getElementById("febUseamount").value;
            var marUseamount = document.getElementById("marUseamount").value;
            var aprUseamount = document.getElementById("aprUseamount").value;
            var mayUseamount = document.getElementById("mayUseamount").value;
            var juneUseamount = document.getElementById("juneUseamount").value;
            var julyUseamount = document.getElementById("julyUseamount").value;
            var augUseamount = document.getElementById("augUseamount").value;
            var septUseamount = document.getElementById("septUseamount").value;
            var octUseAmount = document.getElementById("octUseAmount").value;
            var novUseamount = document.getElementById("novUseamount").value;
            var decUseamount = document.getElementById("decUseamount").value;

            var dustremoveId = document.getElementById("dustremoveId").value;
            var sulfurId = document.getElementById("sulphurremoveId").value;
            var nitreId = document.getElementById("nitreremoveId").value;

            var chimneynkno = parseInt($("#mchimney").find("option:selected").text().replace(/[^0-9]/ig,""));

            // ajax请求。
            $.ajax({
                type:"post",
                dataType : "json",
                url : "/boiler/addBoiler", //要访问的后台地址
                data : {
                    functio : functio,
                    functionDec : functiondec,
                    model : model,
                    tons : tons,
                    installedCapacity : installedCapacity,
                    coalVolatilisation : coalVolatilisation,
                    machineNo : machineNo,
                    fueltype : fueltype,
                    coalash : coalash,
                    coalsulfur : coalsulfur,
                    noxout : noxout,
                    pmout : pmout,
                    feiqiti : feiqiti,
                    so2out : so2out,
                    modelDec : modelDec,
                    fueltypeDec : fueltypeDec,
                    combustionsystem : combustionsystem,
                    fuelAusage : fuelAusage,
                    fuelAusageunit : fuelAusageunit,
                    version : version,
                    dustremoveId : dustremoveId,
                    sulphurremoveId : sulfurId,
                    nitreremoveId : nitreId,
                    no : no,
                    janUseamount : janUseamount,
                    febUseamount : febUseamount,
                    marUseamount : marUseamount,
                    aprUseamount : aprUseamount,
                    mayUseamount : mayUseamount,
                    juneUseamount : juneUseamount,
                    julyUseamount : julyUseamount,
                    augUseamount : augUseamount,
                    septUseamount : septUseamount,
                    octUseAmount : octUseAmount,
                    novUseamount : novUseamount,
                    decUseamount : decUseamount,
                    exhustId : chimney,
                    exfNo : chimneynkno
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



/***
 * CAIJUN
 * @param {Object} total 总的ID
 * @param {Object} a1    12个月份的id
 * @param {Object} a2
 * @param {Object} a3
 * @param {Object} a4
 * @param {Object} a5
 * @param {Object} a6
 * @param {Object} a7
 * @param {Object} a8
 * @param {Object} a9
 * @param {Object} a10
 * @param {Object} a11
 * @param {Object} a12
 * @param {Object} s   使用量or 产量
 * @param {Object} self 当前被检测的ID
 * 12个月份之和<=总
 */
function sumall(total,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,s,self){
    // alert(123)
    var b = new Array(13);
    b[1]= document.getElementById(a1).value;
    b[2]= document.getElementById(a2).value;
    b[3]= document.getElementById(a3).value;
    b[4]= document.getElementById(a4).value;
    b[5]= document.getElementById(a5).value;
    b[6]= document.getElementById(a6).value;
    b[7]= document.getElementById(a7).value;
    b[8]= document.getElementById(a8).value;
    b[9]= document.getElementById(a9).value;
    b[10]= document.getElementById(a10).value;
    b[11]= document.getElementById(a11).value;
    b[12]= document.getElementById(a12).value;
    var sum=0;
    for(var i=1;i<=12;i++){
        if(b[i]==""){
            b[i]=0;
        }
        sum+=parseInt(b[i]);
    }
    var t= document.getElementById(total).value;
    if(t<sum){
        layer.msg('您输入的各个月份的使用量之和大于年使用量，请修改年使用量', {
            icon: 2,
            anim: 6,
            time: 2000 //2秒关闭（如果不配置，默认是3秒）
        }, function(index){
            layer.close(index);
        });

    }

}



