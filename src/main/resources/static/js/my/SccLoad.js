//动态更新scc下拉菜单方法
//动态更新下一级菜单：点击当前下拉菜单事件；点击编辑事件；

//根据第一级菜单的选项更新第二级
function clientscc3(scc1,scc2,selectB,selectC) {
    $("#"+selectB).empty();
    $("#"+selectB).append("<option value=''>请选择</option>");
    $("#"+selectC).empty();
    $("#"+selectC).append("<option value=''>请先选择上一类型</option>");
    if (scc2!=""){
        //锅炉所用燃料类型菜单初始化
        $.ajax({
            type:"post",
            dataType : "json",
            url : "/scc/loadSelectB", //要访问的后台地址
            data : {
                scc1ID: scc1,
                scc2ID: scc2
            },                             //要发送的数据，采用josn格式

            success : function(list) { //list为返回的数据
                //使用jQuery的each方法遍历，index是下标。使用for循环遍历也可以。
                $.each(list,function (index,item) {
                    var $option = $("<option></option>");
                    $option.attr("value", item.scc3);
                    $option.text(item.description+'('+item.scc3+')');
                    $("#"+selectB).append($option);
                });
            },
            error : function(XMLResponse) {
                alert(XMLResponse.responseText);

            }
        });
    }else {
        $("#"+selectB).empty();
        $("#"+selectB).append("<option value=''>请先选择用途</option>");
        $("#"+selectC).empty();
        $("#"+selectC).append("<option value=''>请先选择上一类型</option>");
    }

}

//根据第二级菜单的选项更新第三级
function clientscc4(scc1,selectA,scc3,selectC) {
    $("#"+selectC).empty();
    $("#"+selectC).append("<option value=''>请选择</option>");
    var scc2 = $("#"+selectA).val();
    if (scc3!=""){
        //锅炉类型菜单初始化
        $.ajax({
            type:"post",
            dataType : "json",
            url : "/scc/loadSelectC", //要访问的后台地址
            data : {
                scc1ID: scc1,
                scc2ID: scc2,
                scc3ID: scc3
            },                             //要发送的数据，采用josn格式
            success : function(list) { //list为返回的数据
                //使用jQuery的each方法遍历，index是下标。使用for循环遍历也可以。
                $.each(list,function (index,item) {
                    var $option = $("<option></option>");
                    $option.attr("value", item.scc4);
                    $option.text(item.description+'('+item.scc4+')');
                    $("#"+selectC).append($option);
                })
            },
            error : function(XMLResponse) {
                alert(XMLResponse.responseText);

            }
        });
    }else {
        $("#"+selectC).empty();
        $("#"+selectC).append("<option value=''>请先选择上一类型</option>");
    }

}