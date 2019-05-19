(function( factory ) {
	if ( typeof define === "function" && define.amd ) {
		define( ["jquery", "../jquery.validate"], factory );
	} else {
		factory( jQuery );
	}
}(function( $ ) {

/*
 * Translated default messages for the jQuery validation plugin.
 * Locale: ZH (Chinese, 中文 (Zhōngwén), 汉语, 漢語)
 */
$.extend($.validator.messages, {
	required: "这是必填项",
	remote: "请修正此项",
	email: "请输入有效的电子邮件地址",
	url: "请输入有效的网址",
	date: "请输入有效的日期",
	dateISO: "请输入有效的日期 (YYYY-MM-DD)",
	number: "请输入有效的数字",
	digits: "只能输入数字",
	creditcard: "请输入有效的信用卡号码",
	equalTo: "你的输入不相同",
	extension: "请输入有效的后缀",
	maxlength: $.validator.format("最多输入{0}个字符"),
	minlength: $.validator.format("最少需要{0}个字符"),
	rangelength: $.validator.format("长度必须在{0}到{1}之间"),
	range: $.validator.format("请输入{0}到{1}之间的数值"),
	max: $.validator.format("请输入小于{0}的数值"),
	min: $.validator.format("请输入大于{0}的数值")
});

}));