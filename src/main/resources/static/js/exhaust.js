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
            editExhaust:function(e) {
                $("#updatePanel").removeAttr("hidden");
                var cur = e.currentTarget;  //获取当前元素，即注册点击事件的button
                var curID = cur.value;      //获取button的value，即exhaust.exfId值
                // ajax请求。
                $.ajax({
                    type:"get",
                    dataType : "json",
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
            }

        }

    })


    //修改烟囱信息
    $("#updateExhaust").click(function () {
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
        }else {
            //必填项有空值，不可以提交
            $.niftyNoty({
                type: "warning",
                container : "floating",
                title : "<br><p style='font-size: 18px;'>带*号必填！！！请填写完整。。。</p>"
            });
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
//自定义函数：增加烟囱
function updatedata() {
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