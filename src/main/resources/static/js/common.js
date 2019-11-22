layui.config({
    base: "/lib/layui/extend/",
}).use(["zadmin", "tabRightMenu"], function () {
    var zadmin = layui.zadmin;
    var tabRightMenu = layui.tabRightMenu;

    // 渲染 tab 右键菜单.
    tabRightMenu.render({
        filter: "lay-tab",
        pintabIDs: ["home"],
        width: 110,
    });

    setTimeout(function() {
        zadmin.removeLoading();
    }, 500);
});

/**
 * 显示错误信息
 * @param msg： 错误信息
 */
function showError(msg) {
    layer.msg(msg, {icon: 2});
}

/**
 * 处理 ajax 请求结果
 * @param result： ajax 返回的结果
 * @param fn： 成功的处理函数 ( 传入data: fn(result.data) )
 */
function handlerResult(result, fn) {
    // 成功执行操作，失败提示原因
    if (result.code === 0) {
        fn(result.data);
    } else {
        showError(result.msg);
    }
}

function getWeekList() {
    var today = new Date();
    var data = [];
    for (var i = 0; i < 7; i++) {
        var temp = new Date(today.getTime() - 1000 * 60 * 60 * 24 * i);
        data[6 - i] = dateFormat("yyyy-MM-dd", temp);
    }
    return data;
}

function dateFormat(fmt, date) {
    var o = {
        "M+": date.getMonth() + 1,                      //月份
        "d+": date.getDate(),                           //日
        "h+": date.getHours(),                          //小时
        "m+": date.getMinutes(),                        //分
        "s+": date.getSeconds(),                        //秒
        "q+": Math.floor((date.getMonth() + 3) / 3),    //季度
        "S": date.getMilliseconds()                     //毫秒
    };
    if (/(y+)/.test(fmt))
        fmt = fmt.replace(RegExp.$1, (date.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt))
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}

/**
 * 公共打开父页面 tab 方法.
 * @param title
 * @param url
 */
function openTab(title, url) {
    parent.layui.zadmin.tabAdd({
        id: url,
        title: title,
        url: url
    });
}

/**
 * 全局 AJAX error 处理事件.
 */
$(document).ajaxError(function(event, response){
    console.log("错误响应状态码: ",response.status);
    console.log("错误响应结果: ",response.responseJSON);
    showError(response.responseJSON.msg);
});

/**
 * 禁用 ajax 缓存
 */
$.ajaxSetup({
    cache: false
});

/**
 * 获取 URL 中查询条件部分的参数
 * @param name      参数名称
 * @returns         参数值
 */
function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]);
    return null;
}

/**
 * 城市联级选择/年代选择器/SCC编码联级选择/校验
 */

layui.use(['form', 'layer','jquery','laydate'], function(){
    $ = layui.jquery;
    var form = layui.form
        , layer = layui.layer
        , laydate = layui.laydate;
    //年选择器
    laydate.render({
        elem: '#year'
        ,type: 'year'
    });
    form.verify({
        "factoryNo": function(value, item) {
            var reg = new RegExp(/^(?![\d]+$)(?![a-zA-Z]+$)(-)[\da-zA-Z!#$%^&*]{6,30}$/);
            if (value.length > 0 && !reg.test(value)) {
                return '企业机构代码格式不正确，由6-30位字母或数字或"-"组合！！'
            }
        },
        "ratio": function(value, item) {
            var reg = new RegExp(/^([0-9]\d?(\.\d{1,2})?|1)$/);
            if (value.length > 0 && !reg.test(value)) {
                return '请输入0-1，最多保留两位小数！！'
            }
        },"speed": function(value, item) {
            var reg = new RegExp(/^([0-9]\d?(\.\d{1,2})?|100)$/);
            if (value.length > 0 && !reg.test(value)) {
                return '请输入0-100，最多保留两位小数！！'
            }
        },"pos-num": function(value, item) {
            var reg1 = new RegExp(/^(?!0\d)\d+(\.\d{1,})?(E[-]{0,1}\d+)?$/);
            var reg2 = new RegExp(/^[1-9]\d{0,8}(\.\d{1,10})?$|^0(\.\d{1,10})?$/);
            if (value.length > 0 && !reg1.test(value)) {
                return '请输入八位整数，十位小数的正数！！'
            }else {
                var num = new Number(value)
                if (num<0 || !reg2.test(num)){
                    return '请输入八位整数，十位小数的正数！！'
                }
            }
        },"pos-num-100": function(value, item) {
            var reg1 = new RegExp(/^(?!0\d)\d+(\.\d{1,})?(E[-]{0,1}\d+)?$/);
            var reg2 = new RegExp(/^[1-9]\d{0,8}(\.\d{1,10})?$|^0(\.\d{1,10})?$/);
            if (value.length > 0 && !reg1.test(value)) {
                return '请输入八位整数，十位小数的正数！！'
            }else {
                var num = new Number(value)
                if (num<0 || !reg2.test(num)){
                    return '请输入八位整数，十位小数的正数！！'
                }
                if (num>100){
                    return '请输入小于等于100的正数！！'
                }
            }
        },"integer": function(value, item) {
            var reg = new RegExp(/^(0|\+?[1-9][0-9]*)$/);
            if (value.length > 0 && !reg.test(value)) {
                return '请输入正整数！！'
            }
        },"chinese": function(value, item) {
            var reg = new RegExp(/[\u4e00-\u9fa5]+/);
            if (value.length > 0 && !reg.test(value)) {
                return '企业名称至少包含一个汉字！！'
            }
        },"longitude": function(value, item) {
            var reg = new RegExp(/^[\-\+]?(0(\.\d{1,10})?|([1-9](\d)?)(\.\d{1,10})?|1[0-7]\d{1}(\.\d{1,10})?|180\.0{1,10})$/);
            if(value.length > 0 ){
                if (!reg.test(value)) {
                    return '经度整数部分为0-180,小数部分为0到6位!'
                }
            }
        }, "latitude": function(value, item) {
            var reg = new RegExp(/^[\-\+]?((0|([1-8]\d?))(\.\d{1,10})?|90(\.0{1,10})?)$/);
            if(value.length > 0 ){
                if (!reg.test(value)) {
                    return '纬度整数部分为0-90,小数部分为0到6位!\''
                }
            }
        }
    });
    //加载城市
    // $(function(){
    //     $.ajax({
    //         url: '/factoryAuth/seleCity',
    //         data: {provinceCode: '65'},//发送的参数
    //         type: "post",
    //         success: function (datas) {
    //             if(datas.length>0){
    //                 $.each(datas, function(key, val) {
    //                     var option1 = $("<option>").val(val.cityCode).text(val.cityName);
    //                     $("select[name=cityCode]").append(option1);
    //                     form.render('select');
    //                 });
    //             }else{
    //                 form.render('select');
    //             }
    //         },
    //         error:function(){
    //             //失败执行的方法
    //             layer.msg("城市信息加载失败!", {icon: 6});
    //         }
    //     })
    // });
    //城市区县级联选择
    form.on('select(cityCode)',function(data){
        var cityCode=data.value;
        $("select[name=countyId]").html('<option value="">请选择</option>'); //清空
        form.render('select');
        if(cityCode!=''){
            $.ajax({
                url: '/factoryAuth/seleCountry/' + cityCode,
                data: {cityCode: cityCode},//发送的参数
                type: "post",
                success: function (datas) {
                    if(datas.length>0){
                        $.each(datas, function(key, val) {
                            var option1 = $("<option>").val(val.countyId).text(val.countyName);
                            $("select[name=countyId]").append(option1);
                            form.render('select');
                        });
                    }else{
                        form.render('select');
                    }
                },
                error:function(){
                    //失败执行的方法
                    layer.msg("区县信息加载失败!", {icon: 6});
                }
            })
        }
    });
    form.on('select(scc2)',function(data){
        var formData = {};
        var t = $('form').serializeArray();
        $.each(t, function() {
            formData [this.name] = this.value;
        });
        var scc1=formData["scc1"];
        $("select[name=scc3]").html('<option value="">请选择</option>'); //清空
        $("select[name=scc4]").html('<option value="">请选择</option>'); //清空
        form.render('select');
        var scc2=data.value;
        if(scc2!=''){
            $.ajax({
                url: '/factoryAuth/seleScc2/' + scc2,
                data: {scc1: scc1,scc2: scc2},//发送的参数
                type: "post",
                success: function (datas) {
                    if(datas.length>0){
                        $.each(datas, function(key, val) {
                            var option1 = $("<option>").val(val.scc3).text(val.description);
                            $("select[name=scc3]").append(option1);
                            form.render('select');
                        });
                    }else{
                        form.render('select');
                    }
                },
                error:function(){
                    //失败执行的方法
                    layer.msg("更新失败!", {icon: 6});
                }
            })
        }
    });
    form.on('select(scc3)',function(data){
        var formData = {};
        var t = $('form').serializeArray();
        $.each(t, function() {
            formData [this.name] = this.value;
        });
        var scc1=formData["scc1"];
        var scc2=formData["scc2"];
        $("select[name=scc4]").html('<option value="">请选择</option>'); //清空
        form.render('select');
        var scc3=data.value;
        if (scc3!=''){
            $.ajax({
                url: '/factoryAuth/seleScc3/' + scc2+"/"+scc3,
                data: {scc1: scc1,scc2: scc2,scc3: scc3},//发送的参数
                type: "post",
                success: function (datas) {
                    if(datas.length>0){
                        $.each(datas, function(key, val) {
                            var option1 = $("<option>").val(val.scc4).text(val.description);
                            $("select[name=scc4]").append(option1);
                            form.render('select');
                        });
                    }else{
                        form.render('select');
                    }
                },
                error:function(){
                    //失败执行的方法
                    layer.msg("更新失败!", {icon: 6});
                }
            })
        }
    });
    //监听指定开关//污染物是否参与运算
    form.on('switch(isCul)', function(data){
        if (this.checked){
            $("#emissionDiv").attr("style","display:block;");//显示div
        }else {
            $("#emissionDiv").attr("style","display:none;");//隐藏div
        }
    });
    //企业查询
    $(function(){
        //输入框的值改变时触发
        //$("#companyName").on("input",function(e){
        $("#companyName").on('blur',function(){
            //获取input输入的值
            var companyName=$(this).val();
            if (companyName!='') {
                $.ajax({
                    url: '/factoryAuth/seleCompany/',
                    data: {companyName: companyName},//发送的参数
                    type: "post",
                    success: function (data) {
                        if ($.isEmptyObject(data)) {
                            layer.msg("无该企业信息！提交后将自动新增！", {icon: 6});
                        }else {
                            $('#comId').val(data.comId);
                            $('#address').val(data.address);
                            $('#longitude').val(data.longitude);
                            $('#latitude').val(data.latitude);
                            $('#category').val(data.category);
                        }
                    },
                    error:function(){
                        //失败执行的方法
                        layer.msg("企业名称加载失败!", {icon: 6});
                    }
                })
            }
        })
    });

});