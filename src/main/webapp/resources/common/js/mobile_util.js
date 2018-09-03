var isChinaMobile = /^134[0-8]\d{7}$|^(?:13[5-9]|147|15[0-27-9]|178|172|18[2-478])\d{8}$/; //移动方面最新答复
var isChinaUnion  = /^(?:13[0-2]|145|15[56]|176|171|175|18[56])\d{8}$/; //向联通微博确认并未回复
var isChinaTelcom = /^(?:133|153|177|173|149|18[019])\d{8}$/; //1349号段 电信方面没给出答复，视作不存在
var isOtherTelphone   = /^170([059])\d{7}$/;//其他运营商

var isMobile = /^1[345789]\d{9}$/;
 
var mobile_utils = {
    checkMobile: function(telphone){
    	if(telphone==null || telphone==undefined){
    		return this.setReturnJson(false, '未检测到正确的手机号码')
    	}
        telphone = telphone.trim();
        if(telphone.length !== 11){
            return this.setReturnJson(false, '未检测到正确的手机号码');
        }
        else{
        	if(isMobile.test(telphone)){
                return this.setReturnJson(true, '');
            }else{
            	return this.setReturnJson(false, '未检测到正确的手机号码');
            }
        	
            /*if(isChinaMobile.test(telphone)){
                return this.setReturnJson(true, '移动', {name: 'ChinaMobile'});
            }
            else if(isChinaUnion.test(telphone)){
                return this.setReturnJson(true, '联通', {name: 'ChinaUnion'});
            }
            else if(isChinaTelcom.test(telphone)){
                return this.setReturnJson(true, '电信', {name: 'ChinaTelcom'});
            }
            else if(isOtherTelphone.test(telphone)){
                var num = isOtherTelphone.exec(telphone);
                return this.setReturnJson(true, '', {name: ''});
            }
            else{
                return this.setReturnJson(false, '未检测到正确的手机号码');
            }*/
        }
    },
    setReturnJson: function(status, msg, data){
        if(typeof status !== 'boolean' && typeof status !== 'number'){
            status = false;
        }
        if(typeof msg !== 'string'){
            msg = '';
        }
        return {
            'status': status,
            'msg': msg,
            'data': data
        };
    }
}