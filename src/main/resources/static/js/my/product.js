$(function () {

    //1.页面加载时：初始化Scc第一级下拉菜单（update和add同时初始化）

    //窑炉用途菜单初始化
    $.ajax({
        type:"post",
        dataType : "json",
        url : "/scc/loadSelectA", //要访问的后台地址
        data : {
            scc1ID: '11'
        },                             //要发送的数据，采用josn格式

        success : function(list) { //list为返回的数据
            //使用jQuery的each方法遍历，index是下标。使用for循环遍历也可以。
            $.each(list,function (index,item) {
                var $option = $("<option></option>");
                $option.attr("value", item.scc2);
                $option.text(item.description+'('+item.scc2+')');
                $("#updateactivitiesCategory").append($option);
                $("#activitiesCategory").append("<option value="+item.scc2+">"+item.description+"("+item.scc2+")</option>");
            })
        },
        error : function(XMLResponse) {
            alert(XMLResponse.responseText);

        }
    });

    //设备下拉菜单初始化
    $.ajax({
        type:"post",
        dataType : "json",
        url : "/common/getDeviceList", //要访问的后台地址
        data : {},                             //要发送的数据，采用josn格式

        success : function(list) { //list为返回的数据
            //使用jQuery的each方法遍历，index是下标。使用for循环遍历也可以。
            $.each(list,function (index,item) {
                var $option = $("<option></option>");
                $option.attr("value", item.id);
                $option.text('设备'+item.nkNo+'号');
                $("#updatedeviceno").append($option);
                $("#deviceno").append("<option value="+item.id+">设备"+item.nkNo+"号</option>");
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
            product: {}
        },
        methods:{
            delProduct:function (e) {
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                bootbox.confirm({
                    message : "<p style='font-size: 16px;'>删除该产品后此编号将不可用！</p>" +
                    "<p style='font-size: 16px;'>如产品信息有误可点击编辑按钮进行修改。。。</p>" +
                    "<p style='font-size: 16px;'>请确认是否删除该产品？？？</p>",
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
                                url : "/deviceProduct/delProduct", //要访问的后台地址
                                data : {
                                    productID : curID
                                }, //要发送的数据，采用josn格式

                                success : function(data) { //data为返回的数据
                                    if (data.isDel=="success"){
                                        $.niftyNoty({
                                            type: "success",
                                            container : "page",
                                            title : "<br><p style='font-size: 17px;'>删除成功！！！</p>",
                                            message : "<p style='font-size: 16px;'>产品已删除。。。6秒后自动刷新页面。。。</p>",
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
            editProduct:function(e) {
                $("#updatePanel").removeAttr("hidden");
                $("#addPanel").attr("hidden","hidden");
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                // ajax请求。
                $.ajax({
                    type:"get",
                    dataType : "json",
                    url : "/deviceProduct/getProduct", //要访问的后台地址
                    data : {
                        productID : curID
                    }, //要发送的数据，采用josn格式

                    success : function(data) { //data为返回的数据
                        app.product=data;
                        $("#updateactivitiesCategory_input").val(data.activitiesCategory);
                        $("#updatenameCategory_input").val(data.nameCategory);
                        $("#updatedrainageProcess_input").val(data.drainageProcess);
                        $("#updateactivitiesCategory").val(data.activitiesCategory);
                        clientscc3('11',data.activitiesCategory,'updatenameCategory','updatedrainageProcess');
                        clientscc4('11','updateactivitiesCategory',data.nameCategory,'updatedrainageProcess');

                        app.initSelect();
                    },
                    error : function(XMLResponse) {
                        alert("没有");

                    }
                });


            },
            initSelect:function () {
                setTimeout(function () {
                    var nameCategoryInput = $("#updatenameCategory_input").val();
                    var drainageProcessInput = $("#updatedrainageProcess_input").val();
                    $("#updatenameCategory").val(nameCategoryInput);
                    $("#updatedrainageProcess").val(drainageProcessInput);
                },1000)
            }

        }

    });


    $("#addBtn").click(function () {
        $("#addPanel").removeAttr("hidden");
        $("#updatePanel").attr("hidden","hidden");
    });


    //修改窑炉信息
    $("#updateProduct").click(function () {
        var bootstrapValidator = $("#updatePanel").data('bootstrapValidator');
        bootstrapValidator.validate();
        if(bootstrapValidator.isValid()){
            if (checkvalue("update")){
                //可以提交
                app.product.activitiesCategory = $("#updateactivitiesCategory").val();
                app.product.nameCategory = $("#updatenameCategory").val();
                app.product.drainageProcess = $("#updatedrainageProcess").val();
                app.product.activitiesCategoryDec = $("#updateactivitiesCategory").find("option:selected").text();
                app.product.nameCategoryDec = $("#updatenameCategory").find("option:selected").text();
                app.product.drainageProcessDec = $("#updatedrainageProcess").find("option:selected").text();
                app.product.deviceNo = parseInt($("#updatedeviceno").find("option:selected").text().replace(/[^0-9]/ig,""));
                // ajax请求。
                $.ajax({
                    type:"post",
                    dataType : "json",
                    url : "/deviceProduct/updateProduct", //要访问的后台地址
                    contentType:"application/json",
                    data : JSON.stringify(app.product), //直接传递对象给controller，
                    // 需将json对象转化成字符流,必须声明dataType和contentType
                    // 同时controller中注解requestbody

                    success : function(reponseData) { //reponseData为返回的数据
                        if (reponseData.isUpdate){
                            app.product=reponseData.product;
                            $.niftyNoty({
                                type: "success",
                                container : "page",
                                title : "<br><p style='font-size: 17px;'>成功！！！</p>",
                                message : "<p style='font-size: 16px;'>产品信息已经修改。。。6秒后将自动刷新当前页面。。。</p>",
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
            activitiesCategory:{
                validators: {
                    notEmpty: {}
                }
            },
            nameCategory:{
                validators: {
                    notEmpty: {}
                }
            },
            drainageProcess:{
                validators: {
                    notEmpty: {}
                }
            },
            deviceno:{
                validators: {
                    notEmpty: {}
                }
            },
            uint: {
                validators: {
                    notEmpty: {},
                    stringLength: {
                        max: 20
                    }
                }
            },
            annualOutput:{
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
            updateactivitiesCategory:{
                validators: {
                    notEmpty: {}
                }
            },
            updatenameCategory:{
                validators: {
                    notEmpty: {}
                }
            },
            updatedrainageProcess:{
                validators: {
                    notEmpty: {}
                }
            },
            updatedeviceno:{
                validators: {
                    notEmpty: {}
                }
            },
            updateuint: {
                validators: {
                    notEmpty: {},
                    stringLength: {
                        max: 20
                    }
                }
            },
            updateannualOutput:{
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
        ids = new Array("activitiesCategory", "nameCategory",
            "drainageProcess","deviceno", "uint", "annualOutput",
            "janUseamount","febUseamount","marUseamount","aprUseamount","mayUseamount","juneUseamount",
            "julyUseamount","augUseamount","septUseamount","octUseAmount","novUseamount","decUseamount");
    }else if(type="update"){
        ids = new Array("updateactivitiesCategory", "updatenameCategory",
            "updatedrainageProcess","updatedeviceno", "updateuint", "updateannualOutput",
            "updatejanUseamount","updatefebUseamount","updatemarUseamount","updateaprUseamount","updatemayUseamount","updatejuneUseamount",
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

//自定义函数：增加产品
function updatedata() {
    var bootstrapValidator = $("#addPanel").data('bootstrapValidator');
    bootstrapValidator.validate();
    if(bootstrapValidator.isValid()){
        if (checkvalue("add")){

            //必填项不为空，可以提交
            var activitiesCategory = document.getElementById("activitiesCategory").value;
            var activitiesCategoryDec = $("#activitiesCategory").find("option:selected").text();
            var drainageProcess = document.getElementById("drainageProcess").value;
            var drainageProcessDec = $("#drainageProcess").find("option:selected").text();
            var nameCategory = document.getElementById("nameCategory").value;
            var nameCategoryDec = $("#nameCategory").find("option:selected").text();
            var name = document.getElementById("name").value;
            var unit = document.getElementById("uint").value;
            var annualOutput = document.getElementById("annualOutput").value;
            var deviceId = document.getElementById("deviceno").value;
            var deviceNo = parseInt($("#deviceno").find("option:selected").text().replace(/[^0-9]/ig,""));
            var janUseamount= document.getElementById("janUseamount").value;
            var febUseamount= document.getElementById("febUseamount").value;
            var marUseamount= document.getElementById("marUseamount").value;
            var aprUseamount= document.getElementById("aprUseamount").value;
            var mayUseamount= document.getElementById("mayUseamount").value;
            var juneUseamount= document.getElementById("juneUseamount").value;
            var julyUseamount= document.getElementById("julyUseamount").value;
            var augUseamount= document.getElementById("augUseamount").value;
            var septUseamount= document.getElementById("septUseamount").value;
            var octUseAmount= document.getElementById("octUseAmount").value;
            var novUseamount= document.getElementById("novUseamount").value;
            var decUseamount= document.getElementById("decUseamount").value;


            // ajax请求。
            $.ajax({
                type:"post",
                dataType : "json",
                url : "/deviceProduct/addProduct", //要访问的后台地址
                data : {
                    janUseamount:janUseamount,
                    febUseamount:febUseamount,
                    marUseamount:marUseamount,
                    aprUseamount:aprUseamount,
                    mayUseamount:mayUseamount,
                    juneUseamount:juneUseamount,
                    julyUseamount:julyUseamount,
                    augUseamount:augUseamount,
                    septUseamount:septUseamount,
                    octUseAmount:octUseAmount,
                    novUseamount:novUseamount,
                    decUseamount:decUseamount,
                    activitiesCategory : activitiesCategory,
                    activitiesCategoryDec : activitiesCategoryDec,
                    nameCategory : nameCategory,
                    nameCategoryDec : nameCategoryDec,
                    drainageProcessDec : drainageProcessDec,
                    drainageProcess : drainageProcess,
                    name : name,
                    annualOutput : annualOutput,
                    uint : unit,
                    deviceNo : deviceNo,
                    deviceId: deviceId

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
            //必填项有空值，不可以提交
            bootbox.alert("<p style='font-size: 17px;'>带*号必填！！！请填写完整。。。</p>");
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
function sumall(total,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12){
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
        $.niftyNoty({
            type: "warning",
            container : "floating",
            title : "<br><p style='font-size: 16px;'>您输入的各个月份的使用量之和大于年使用量，已自动修改年使用量</p>",
            timer : 5000
        });
        document.getElementById(total).value=sum;
    }

}



