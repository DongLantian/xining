$(document).ready(function() {

    $.niftyNoty({
        type: "warning",
        icon :  'ion-paper-airplane icon-3x',
        container : "floating",
        title : "<br><p style='font-size: 16px;'>第一次登陆本系统请完善企业信息。" +
        "<br><br>带<strong>*</strong>号的为必填项.......填写完整之后可更新企业信息。</p>"
    });

    var datatime=new Date();

/*企业规模菜单初始化*/
    var factorySize=$("#getfactorySize").text();
    document.getElementById("factorySize").val=factorySize;
    $("#factorySize option[value='"+factorySize+"']").attr("selected", true);
/*污染源类型菜单初始化*/
    var abc=$("#getsourceType").text();
    $("#sourceType").val(abc);
    $("#sourceType option[value='"+abc+"']").attr("selected", true);

/*行业类别两个下拉菜单初始化*/
    $.ajax({
        type:"post",
        dataType : "json",
        url : "/enterprise/getIndustryBigAll", //要访问的后台地址
        data : {},                             //要发送的数据，采用josn格式

        success : function(list) { //list为返回的数据
            //使用jQuery的each方法遍历，index是下标。使用for循环遍历也可以。
            $.each(list,function (index,item) {
                var $option = $("<option></option>");
                $option.attr("value", item.industryCode);
                $option.text(item.industryName);
                $("#industryBigid").append($option);
            })
        },
        error : function(XMLResponse) {
            alert(XMLResponse.responseText);

        }
    });
    var m_indutryBig=$("#getindustryBigid").text();
    $("#industryBigid option[value='"+m_indutryBig+"']").attr("selected", true);
    if(m_indutryBig!=''){
        industrysmall(m_indutryBig);
    }

/*注册城市和注册行政区两个下拉菜单初始化*/
    $.ajax({
        type:"post",
        dataType : "json",
        url : "/enterprise/getCityAll", //要访问的后台地址
        data : {},                             //要发送的数据，采用josn格式

        success : function(list) { //list为返回的数据
            //使用jQuery的each方法遍历，index是下标。使用for循环遍历也可以。
            $.each(list,function (index,item) {
                var $option = $("<option></option>");
                $option.attr("value", item.cityCode);
                $option.text(item.cityName);
                $("#countyRegisterCity").append($option);
            })
        },
        error : function(XMLResponse) {
            alert(XMLResponse.responseText);

        }
    });
    var m_countyRegisterCity=$("#getcountyRegisterCity").text();
    var m_countyidRegister=$("#getcountyidRegister").text();
    $("#countyRegisterCity option[value='"+m_countyRegisterCity+"']").attr("selected", true);
    if(m_countyRegisterCity!=''){
        changeCity(m_countyRegisterCity,'countyidRegister',m_countyidRegister);
    }

/*实际城市和实际行政区两个下拉菜单初始化*/
    /*行业类别两个下拉菜单初始化*/
    $.ajax({
        type:"post",
        dataType : "json",
        url : "/enterprise/getCityAll", //要访问的后台地址
        data : {},                             //要发送的数据，采用josn格式

        success : function(list) { //list为返回的数据
            //使用jQuery的each方法遍历，index是下标。使用for循环遍历也可以。
            $.each(list,function (index,item) {
                var $option = $("<option></option>");
                $option.attr("value", item.cityCode);
                $option.text(item.cityName);
                $("#countyCity").append($option);
            })
        },
        error : function(XMLResponse) {
            alert(XMLResponse.responseText);

        }
    });
    var m_countyCity=$("#getcountyCity").text();
    var m_countyCode=$("#getcountyId").text();
    if(m_countyCity!=''){
        changeCity(m_countyCity,'countyId',m_countyCode);
    }


    //数据校验
    $('#addPanel').bootstrapValidator({
        message: '这是必填项',
        fields: {
            sourceType:{
                validators: {
                    notEmpty: {}
                }
            },
            workshopid:{
                validators: {
                    notEmpty: {},
                    integer: {}
                }
            },
            productionUse: {
                validators: {
                    notEmpty: {},
                    stringLength: {
                        max: 60
                    }
                }
            },
            principalEmail: {
                validators: {
                    emailAddress: {}
                }
            },
            principalPhone: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /0\d{2,4}-\d{7,8}/,
                        message:'固定电话格式为：区号-座机号。例：0221-6356899'
                    }
                }
            },
            principalMobile: {
                validators: {
                    notEmpty: {},
                    phone: {
                        message: '手机号不符合规范',
                        country: 'CN'
                    }
                }
            },
            factoryLongitude: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 73.6667,
                        max: 96.3000,
                        message: '经度范围为%s到%s',
                    }
                }
            },
            factoryLatitude: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 34.4167,
                        max: 48.1667,
                        message: '纬度范围为%s到%s',
                    }
                }
            },
            lon1: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 73.6667,
                        max: 96.3000,
                        message: '经度范围为%s到%s',
                    }
                }
            },
            lat1: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 34.4167,
                        max: 48.1667,
                        message: '纬度范围为%s到%s',
                    }
                }
            },
            lon2: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 73.6667,
                        max: 96.3000,
                        message: '经度范围为%s到%s',
                    }
                }
            },
            lat2: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 34.4167,
                        max: 48.1667,
                        message: '纬度范围为%s到%s',
                    }
                }
            },
            lon3: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 73.6667,
                        max: 96.3000,
                        message: '经度范围为%s到%s',
                    }
                }
            },
            lat3: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 34.4167,
                        max: 48.1667,
                        message: '纬度范围为%s到%s',
                    }
                }
            },
            lon4: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 73.6667,
                        max: 96.3000,
                        message: '经度范围为%s到%s',
                    }
                }
            },
            lat4: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 34.4167,
                        max: 48.1667,
                        message: '纬度范围为%s到%s',
                    }
                }
            },
            lon5: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 73.6667,
                        max: 96.3000,
                        message: '经度范围为%s到%s',
                    }
                }
            },
            lat5: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 34.4167,
                        max: 48.1667,
                        message: '纬度范围为%s到%s',
                    }
                }
            },
            lon6: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 73.6667,
                        max: 96.3000,
                        message: '经度范围为%s到%s',
                    }
                }
            },
            lat6: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 34.4167,
                        max: 48.1667,
                        message: '纬度范围为%s到%s',
                    }
                }
            },
            lon7: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 73.6667,
                        max: 96.3000,
                        message: '经度范围为%s到%s',
                    }
                }
            },
            lat7: {
                validators: {
                    notEmpty: {},
                    regexp: { //正则校验
                        regexp: /^(([1-9]{1}\d*)|(0{1}))(\.\d{4,6})$/,
                        message:'请精确到小数点后4位到6位'
                    },
                    between: {
                        min: 34.4167,
                        max: 48.1667,
                        message: '纬度范围为%s到%s',
                    }
                }
            }
        }
    });


});



function industrysmall(m_value){
    $("#industryId").empty();
    $("#industryId").append("<option disabled=''>请选择</option>");
    $.ajax({
        type:"post",
        dataType : "json",
        url : "/enterprise/getIndustrySmallByBigID", //要访问的后台地址
        data : {
            industrybigid:m_value
        }, //要发送的数据，采用josn格式

        success : function(list) { //list为返回的数据
            //使用jQuery的each方法遍历，index是下标。使用for循环遍历也可以。
            $.each(list,function (index,item) {
                var $option = $("<option></option>");
                $option.attr("value", item.industrySmall);
                $option.text(item.industryName);
                $("#industryId").append($option);
            });
            var m_indutrySmall=$("#getindustryId").text();
            $("#industryId option[value='"+m_indutrySmall+"']").attr("selected", true);


        },
        error : function(XMLResponse) {
            alert(XMLResponse.responseText);

        }
    });

}

function  changeCity(m_value,next,m_countyCode){

    $("#"+next).empty();
    $("#"+next).append("<option disabled=''>请选择</option>");
    $.ajax({
        type:"post",
        dataType : "json",
        url : "/enterprise/getCountryByCityCode", //要访问的后台地址
        data : {
            cityCode: m_value
        }, //要发送的数据，采用josn格式

        success : function(list) { //list为返回的数据
            //使用jQuery的each方法遍历，index是下标。使用for循环遍历也可以。
            $.each(list,function (index,item) {
                var $option = $("<option></option>");
                $option.attr("value", item.countyId);
                $option.text(item.countyName);
                $("#"+next).append($option);
            });

            $("#"+next+" option[value='"+m_countyCode+"']").attr("selected", true);

        },
        error : function(XMLResponse) {
            alert(XMLResponse.responseText);

        }
    });

}

function  checkvalue() {
    var ids = new Array("sourceType","industryBigid","industryId","legalperson",
        "factorySize","countyRegisterCity","countyidRegister",
        "addressRegister","countyCity","countyId","address",
        "factoryLongitude","factoryLatitude","totalOutput",
        "yearDays","daysHours","principalName","principalMobile",
        "principalEmail","lon1","lat1","lon2","lat2","lon3","lat3","lon4","lat4");
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

function addFactory() {
    var bootstrapValidator = $("#addPanel").data('bootstrapValidator');
    bootstrapValidator.validate();
    if(bootstrapValidator.isValid()){
        if (checkvalue()){
            var factoryName = document.getElementById("factoryName").value;
            var factoryUsedname = document.getElementById("factoryUsedname").value;
            var sourceType = document.getElementById("sourceType").value;
            var industryBigid = document.getElementById("industryBigid").value;
            var industryBigname=$("#industryBigid").find("option:selected").text();
            var industryId = document.getElementById("industryId").value;
            var industryName=$("#industryId").find("option:selected").text();
            var legalperson = document.getElementById("legalperson").value;
            var factorySize = document.getElementById("factorySize").value;
            var countyRegisterCity = document.getElementById("countyRegisterCity").value;
            var countyidRegister = document.getElementById("countyidRegister").value;//注册城市
            var addressRegister = document.getElementById("addressRegister").value;//注册区县
            var countyCity = document.getElementById("countyCity").value;
            var cityName=$("#countyCity").find("option:selected").text();//城市名称
            var countyRegisterCityDec=$("#countyRegisterCity").find("option:selected").text();//注册城市名称
            var countyidRegisterDec=$("#countyidRegister").find("option:selected").text();//注册区县名称
            var countyId = document.getElementById("countyId").value;
            var countyName=$("#countyId").find("option:selected").text();//区县名称
            var address = document.getElementById("address").value;
            var factoryLongitude = document.getElementById("factoryLongitude").value;
            var factoryLatitude = document.getElementById("factoryLatitude").value;
            var totalOutput = document.getElementById("totalOutput").value;
            var yearDays = document.getElementById("yearDays").value;
            var daysHours = document.getElementById("daysHours").value;
            var principalName = document.getElementById("principalName").value;
            var principalPhone = document.getElementById("principalPhone").value;
            var principalMobile = document.getElementById("principalMobile").value;
            var principalEmail = document.getElementById("principalEmail").value;
            var powerAmount = document.getElementById("powerAmount").value;
            var lon1 = document.getElementById("lon1").value;
            var lon2 = document.getElementById("lon2").value;
            var lon3 = document.getElementById("lon3").value;
            var lon4 = document.getElementById("lon4").value;
            var lon5 = document.getElementById("lon5").value;
            var lon6 = document.getElementById("lon6").value;
            var lon7 = document.getElementById("lon7").value;
            var lat1 = document.getElementById("lat1").value;
            var lat2 = document.getElementById("lat2").value;
            var lat3 = document.getElementById("lat3").value;
            var lat4 = document.getElementById("lat4").value;
            var lat5 = document.getElementById("lat5").value;
            var lat6 = document.getElementById("lat6").value;
            var lat7 = document.getElementById("lat7").value;

            $.ajax({
                type:"post",
                dataType : "json",
                url : "/enterprise/enterpriseUpdate", //要访问的后台地址
                data : {
                    cityName:cityName,
                    industryName:industryName,
                    factoryName:factoryName,
                    countyName:countyName,
                    industryBigname:industryBigname,
                    factoryUsedname:factoryUsedname,
                    powerAmount:powerAmount,
                    sourceType:sourceType,
                    industryBigid:industryBigid,
                    industryId:industryId,
                    legalperson:legalperson,
                    factorySize:factorySize,
                    countyRegisterCity:countyRegisterCity,
                    countyidRegister:countyidRegister,
                    countyRegisterCityDec:countyRegisterCityDec,
                    countyidRegisterDec:countyidRegisterDec,
                    addressRegister:addressRegister,
                    countyCity:countyCity,
                    countyId:countyId,
                    address:address,
                    factoryLongitude:factoryLongitude,
                    factoryLatitude:factoryLatitude,
                    totalOutput:totalOutput,
                    yearDays:yearDays,
                    daysHours:daysHours,
                    principalName:principalName,
                    principalPhone:principalPhone,
                    principalMobile:principalMobile,
                    principalEmail:principalEmail,
                    lon1:lon1,
                    lat1:lat1,
                    lon2:lon2,
                    lat2:lat2,
                    lon3:lon3,
                    lat3:lat3,
                    lon4:lon4,
                    lat4:lat4,
                    lon5:lon5,
                    lat5:lat5,
                    lon6:lon6,
                    lat6:lat6,
                    lon7:lon7,
                    lat7:lat7
                }, //要发送的数据，采用josn格式

                success : function(data) { //list为返回的数据
                    if(data.status==1){
                        $.niftyNoty({
                            type: "success",
                            container : "page",
                            title : "<br><p style='font-size: 18px;'>更新成功！！！企业信息已保存。。。</p>",
                            timer : 6000
                        });
                    }else{
                        if(data.status==0){
                            $.niftyNoty({
                                type: "warning",
                                container : "page",
                                title : "<br><p style='font-size: 18px;'>登录超时,企业信息保存失败！</p>",
                                timer : 6000
                            });
                        }else{
                            $.niftyNoty({
                                type: "warning",
                                container : "page",
                                title : "<br><p style='font-size: 18px;'>存在数据格式错误,企业信息保存失败！</p>",
                                timer : 6000
                            });
                        }
                    }
                },
                error : function() {
                    alert("请求失败！");
                }
            });
        }
    }
    else{
        //必填项有空值，不可以提交
        bootbox.alert("<p style='font-size: 17px;'>所填数据不符合要求，请按提示修改。</p>");
    }

}


/*

function addsaveinfo(page, target) {
    var m_alert = 0;

    $.post("ajax/ExhaustTemp/getinfo.do", {
        target : target
    }, function(data) {
        var json = eval("(" + data + ")");
        //alert(json.result);

        saveinfo(page, target, 'all', json.result);

    });

}


function ischanged(name) {
    document.getElementById("malert").value = 1;
    $('#m_alert').show();
}

*/
