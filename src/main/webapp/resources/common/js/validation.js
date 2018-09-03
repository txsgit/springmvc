/**
 * js校验
 * wangwei
 */
var validation = function(){
	
	return{
		
		//判断是否为空
		isNotNull:function(elementId){
			
			var element = $("#"+elementId);
			if(element.length > 0){
				
				var val = element.val();
				
				if((val==null)||(val==undefined)||(val.length==0)){
					return false;
				}
				val = val.replace(/(^\s*)|(\s*$)/g, "");
				if(val.length==0){
					return false;
				}
				
				return true;
				
			}else{
				return true;
			}

		},
		
		//提现页面（姓名，支付宝等）判断是否为空
		tixianIsNotNull:function(element){
			
			if(element.length > 0){
				
				val = element.replace(/(^\s*)|(\s*$)/g, "");
				if(val.length==0){
					return false;
				}
				
				return true;
				
			}else{
				return false;
			}

		},
		
		//判断是否为数字
		isNumber:function(elementId){
			
			var element = $("#"+elementId);
			if(element.length > 0){
				
				var val = element.val();
				var re = /^[0-9]+.?[0-9]*$/; 
				if (re.test(val)){
			        return true;
			    }else{
			    	return false;
			    }
				
			}else{
				
				return true;
				
			}

		},
	    //判断是否是邮箱
		isEmail:function(elementId){
			
			var element = $("#"+elementId);
			if(element.length > 0){

				var val = element.val();
				
				if (val.search(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/) != -1){
					return true;
				}else{
					return false;
				}				
				
			}else{
				
				return true;
				
			}

		},
		//身份证
		isIdCard:function(elementId){
			
			var element = $("#"+elementId);
			if(element.length > 0){
				
				//15位身份证号
				var reg1=/^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$/;
				//18位身份证号
				var reg2=/^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])(\d{3})(\d|[X]|[x])$/;
				
				var val = element.val();
				if((reg1.test(val))&&(reg2.test(val))){
					return true;
				}else{
					return false;
				}				
				
			}else{
				
				return true;
				
			}
			
		},
		//手机
		isPhone:function(elementId){
			
			var element = $("#"+elementId);
			if(element.length > 0){
				//去掉空格
				
				var val = element.val();
				var reg=/^1[3-9]\d{9}$/;
				if(reg.test($.trim(val))){
					return true;
				}else{
					return false;
				}				
				
			}else{
				
				return true;
				
			}

		},
		//固定电话
		isTel:function(elementId){
			
			var element = $("#"+elementId);
			if(element.length > 0){
			
				var val = element.val();
				var reg=/^(\d{3,4}\-){1}\d{6,8}$/;
				if(reg.test(val)){
					return true;
				}else{
					return false;
				}
				
			}else{
				
				return true;
				
			}
			
		}
		
	}
	
}();


