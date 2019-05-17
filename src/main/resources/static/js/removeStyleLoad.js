$(document).ready(function() {

    //除尘方式下拉菜单初始化
    $.ajax({
        type:"post",
        dataType : "json",
        url : "/common/getDustremoveList", //要访问的后台地址
        data : {},                             //要发送的数据，采用josn格式

        success : function(list) { //list为返回的数据
            //使用jQuery的each方法遍历，index是下标。使用for循环遍历也可以。
            $.each(list,function (index,item) {
                var $option = $("<option></option>");
                $option.attr("value", item.id);
                $option.text(item.dustRemoveName);
                $("#updatedustremoveId").append($option);
                $("#dustremoveId").append("<option value="+item.id+">"+item.dustRemoveName+"</option>");
            })
        },
        error : function(XMLResponse) {
            alert(XMLResponse.responseText);

        }
    });

    //脱硫方式下拉菜单初始化
    $.ajax({
        type:"post",
        dataType : "json",
        url : "/common/getSulphurremoveList",  //要访问的后台地址
        data : {},                             //要发送的数据，采用josn格式

        success : function(list) { //list为返回的数据
            //使用jQuery的each方法遍历，index是下标。使用for循环遍历也可以。
            $.each(list,function (index,item) {
                var $option = $("<option></option>");
                $option.attr("value", item.id);
                $option.text(item.sulphurMethod);
                $("#updatesulphurremoveId").append($option);
                $("#sulphurremoveId").append("<option value="+item.id+">"+item.sulphurMethod+"</option>");
            })
        },
        error : function(XMLResponse) {
            alert(XMLResponse.responseText);

        }
    });


    //脱硝方式下拉菜单初始化
    $.ajax({
        type:"post",
        dataType : "json",
        url : "/common/getNitreremoveList",    //要访问的后台地址
        data : {},                             //要发送的数据，采用josn格式

        success : function(list) { //list为返回的数据
            //使用jQuery的each方法遍历，index是下标。使用for循环遍历也可以。
            $.each(list,function (index,item) {
                var $option = $("<option></option>");
                $option.attr("value", item.id);
                $option.text(item.nitreMethod);
                $("#updatenitreremoveId").append($option);
                $("#nitreremoveId").append("<option value="+item.id+">"+item.nitreMethod+"</option>");
            })
        },
        error : function(XMLResponse) {
            alert(XMLResponse.responseText);

        }
    });


})