$(function () {
    // $("#app").html("nihao");
    // var u = $("#modelUser").val();
    // 定义Vue对象，与页面中元素绑定

    //1.页面加载时：初始化Scc三级下拉菜单（update和add同时初始化）  默认第一个

    //锅炉用途菜单初始化
    $.ajax({
        type:"post",
        dataType : "json",
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

    //使用Vue控制页面元素：用于编辑和删除功能
    var app = new Vue({
        el: '#exfDom',  //绑定DOM根节点（最外层标签）的id
        data: {
            boiler: {}
        },
        methods:{
            delExhaust:function (e) {
                var r=confirm("删除后该烟囱编号将不可用！如烟囱信息有误可点击编辑按钮进行修改。。。请确认是否删除该烟囱？？？");
                if (r==true)
                {
                    var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                    var curID = cur.value;      //获取button的value，即exhaust.exfId值
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
                                    message : "<p style='font-size: 16px;'>烟囱已删除。。。6秒后自动刷新页面。。。</p>",
                                    timer : 5000
                                });
                                setTimeout(function(){
                                    window.location.reload();//刷新当前页面.
                                },6000);
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
                }
            },
            editBoiler:function(e) {
                $("#updatePanel").removeAttr("hidden");
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                // ajax请求。
                $.ajax({
                    type:"get",
                    dataType : "json",
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

                        app.initSelect();
                    },
                    error : function(XMLResponse) {
                        alert("没有");

                    }
                });


            },
            initSelect:function () {
                setTimeout(function () {
                    var fuelInput = $("#updatefueltype_input").val();
                    var modelInput = $("#updatemodel_input").val();
                    $("#updatefueltype").val(fuelInput);
                    $("#updatemodel").val(modelInput);
                },1000)
            }

        }

    })

    //修改烟囱信息
    $("#updateExhaust").click(function () {
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
                        title : "<br><p style='font-size: 17px;'>成功！！！</p>",
                        message : "<p style='font-size: 16px;'>烟囱信息已经修改。。。6秒后将自动刷新当前页面。。。</p>",
                        timer : 5000
                    });
                    setTimeout(function(){
                        window.location.reload();//刷新当前页面.
                    },6000);
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
    });
});


//自定义函数：检查必填项是否为空
function  checkvalue(type) {
    var ids;
    if (type=="add"){
        ids = new Array("functio", "fueltype", "model", "no", "version",
            "tons", "coalsulfur", "combustionsystem", "fuelAusage",
            "fuelAusageunit", "mchimney", "feiqiti", "so2out", "noxout",
            "pmout","coalash","coalVolatilisation","machineNo","installedCapacity",
            "janUseamount", "febUseamount","marUseamount",
            "aprUseamount","mayUseamount","juneUseamount",
            "julyUseamount","augUseamount","septUseamount","octUseAmount","novUseamount","decUseamount");
    }else if(type="update"){
        ids = new Array("updatefunctio", "updatefueltype", "updatemodel", "updateno", "updateversion",
            "updatetons", "updatecoalsulfur", "updatecombustionsystem", "updatefuelAusage",
            "updatefuelAusageunit", "updatemchimney", "updatefeiqiti", "updateso2out", "updatenoxout",
            "updatepmout","updatecoalash","updatecoalVolatilisation","updatemachineNo","updateinstalledCapacity",
            "updatejanUseamount", "updatefebUseamount","updatemarUseamount",
            "updateaprUseamount","updatemayUseamount","updatejuneUseamount",
            "updatejulyUseamount","updateaugUseamount","updateseptUseamount","updateoctUseAmount","updatenovUseamount","updatedecUseamount");
    }
    var hasEmpty=0;
    for (var i=0;i<ids.length;i++){
        if ($("#"+ids[i]).val().length==0){
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
    /*checkvalue("add")*/
    if (1){
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
        var dustremoveDec = $("#dustremoveId").find("option:selected").text();
        var sulphurremoveDec = $("#sulphurremoveId").find("option:selected").text();
        var nitreremoveDec = $("#nitreremoveId").find("option:selected").text();

        var chimneynkno = parseInt($("#mchimney").find("option:selected").text().replace(/[^0-9]/ig,""));

        // ajax请求。
        $.ajax({
            type:"post",
            dataType : "json",
            url : "/boiler/addBoiler", //要访问的后台地址
            data : {
                isnew : 0,
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
                sulphurremoveDec : sulphurremoveDec,
                dustremoveDec : dustremoveDec,
                modeldec : modelDec,
                fueltypedec : fueltypeDec,
                nitreremoveDec : nitreremoveDec,
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
                    $.niftyNoty({
                        type: "success",
                        container : "page",
                        title : "<br><p style='font-size: 17px;'>成功！！！</p>",
                        message : "<p style='font-size: 16px;'>烟囱信息已添加。。。6秒后自动刷新页面。。。</p>",
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
        //必填项有空值，不可以提交
        $.niftyNoty({
            type: "warning",
            container : "floating",
            title : "<br><p style='font-size: 18px;'>带*号必填！！！请填写完整。。。</p>"
        });
    }

}




