//GMT(Greenwich Mean Time)代表格林尼治标准时间，这个大家都知道。  
//而CST却同时可以代表如下 4 个不同的时区：  
//Central Standard Time (USA) UT-6:00 
//Central Standard Time (Australia) UT+9:30 
//China Standard Time UT+8:00 
//Cuba Standard Time UT-4:00  

 //计算时间参数距今为止的大致时间描述
 function reviewTimeValue(time){
	 
	 //当前时间
	  var date = new Date();
	  var timeTmp = new Date(time);
	  var convertedTime = Date.parse(timeTmp); 
	  var convertedDate = Date.parse(date); 

	  //如果出现当前时间小于发布时间，那么该课程最有可能是刚刚发布
	  if(convertedDate < convertedTime)
	  {
		  return "刚刚";
	  }
	 
	  var value = reviewTimeYy(convertedTime,convertedDate);

	  var timeValue;
	  //如果距今已有数年
	  if(value > 0){
		  timeValue = value + "年前";  
	  }else{
		  //如果距今已有数月
		  value = reviewTimeMo(convertedTime,convertedDate);
		  if(value > 0){
			  timeValue = value + "个月前"; 
		  }else{
			  //如果距今已有数天
			  value = reviewTimeDay(convertedTime,convertedDate);
			  if(value > 0){
				  timeValue = value + "天前"; 
			  }else{
				  //如果距今已有数小时
				  value = reviewTimeHh(convertedTime,convertedDate);
				  if(value > 0){
					  timeValue = value + "小时前"; 
				  }else{
					  //如果距今已有数分钟
					  value = reviewTimeMi(convertedTime,convertedDate);
					  if(value > 0){
						  timeValue = value + "分钟前"; 
					  }else{
						  timeValue = "刚刚"; 
					  }
				  }
			  }
		  }

		}

	  return timeValue;
		  
	  }
 
 
 function reviewTimeMi(time,date){
	  //因为不够整数的话，取整会有问题
	  if((1000 * 60) > (date - time))
	  {
		  return 0;
	  }
	  var mi = parseInt((date - time)/(1000 * 60));
	  return mi;
	  }
 function reviewTimeHh(time,date){
	  //因为不够整数的话，取整会有问题
	  if((1000 * 60 * 60) > (date - time))
	  {
		  return 0;
	  }
	  var hh = parseInt((date - time)/(1000 * 60 * 60));
	  return hh;
	  }
 function reviewTimeYy(time,date){
	  //因为不够整数的话，取整会有问题
	  if((1000 * 60 * 60 * 24 * 365) > (date - time))
	  {
		  return 0;
	  }
	  var yy = parseInt((date - time)/(1000 * 60 * 60 * 24 * 365));

	  return yy;
	  }
 function reviewTimeMo(time,date){
	  //因为不够整数的话，取整会有问题
	  if((1000 * 60 * 60 * 24 * 30) > (date - time))
	  {
		  return 0;
	  }
	  var mo = parseInt((date - time)/(1000 * 60 * 60 * 24 * 30));
	  return mo;  
	  }
 function reviewTimeDay(time,date){
	  //因为不够整数的话，取整会有问题
	  if((1000 * 60 * 60 * 24) > (date - time))
	  {
		  return 0;
	  }
	  var dd = parseInt((date - time)/(1000 * 60 * 60 * 24));
	  return dd;
	  }
 
//new Date().format('yyyy-MM-dd');
Date.prototype.format = function(format) {
	var o = {
		"M+" : this.getMonth() + 1, // month
		"d+" : this.getDate(), // day
		"h+" : this.getHours(), // hour
		"m+" : this.getMinutes(), // minute
		"s+" : this.getSeconds(), // second
		"q+" : Math.floor((this.getMonth() + 3) / 3), // quarter
		"S" : this.getMilliseconds()
	// millisecond
	}
	if (/(y+)/.test(format))
		format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	for ( var k in o)
		if (new RegExp("(" + k + ")").test(format))
			format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
	return format;
}

/*
*   功能:实现VBScript的DateAdd功能.
*   参数:interval,字符串表达式，表示要添加的时间间隔.
*   参数:number,数值表达式，表示要添加的时间间隔的个数.
*   参数:date,时间对象.
*   返回:新的时间对象.
*   var now = new Date();
*   var newDate = DateAdd( "d", 5, now);
*   var now = new Date();
//加五天.
var newDate = DateAdd("d ", 5, now);
alert(newDate.toLocaleDateString())
//加两个月.
newDate = DateAdd("m ", 2, now);
alert(newDate.toLocaleDateString())
//加一年
newDate = DateAdd("y ", 1, now);
alert(newDate.toLocaleDateString())

*---------------   DateAdd(interval,number,date)   -----------------
*/
function DateAdd(interval, number, date) {
   switch (interval) {
   case "y ": {
       date.setFullYear(date.getFullYear() + number);
       return date;
       break;
   }
   case "q ": {
       date.setMonth(date.getMonth() + number * 3);
       return date;
       break;
   }
   case "m ": {
       date.setMonth(date.getMonth() + number);
       return date;
       break;
   }
   case "w ": {
       date.setDate(date.getDate() + number * 7);
       return date;
       break;
   }
   case "d ": {
       date.setDate(date.getDate() + number);
       return date;
       break;
   }
   case "h ": {
       date.setHours(date.getHours() + number);
       return date;
       break;
   }
   case "m ": {
       date.setMinutes(date.getMinutes() + number);
       return date;
       break;
   }
   case "s ": {
       date.setSeconds(date.getSeconds() + number);
       return date;
       break;
   }
   default: {
       date.setDate(d.getDate() + number);
       return date;
       break;
   }
   }
}

