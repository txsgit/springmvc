/******/



$.common_util = {
		
		_ajax:function(opts){
			var _this = this;
			var opt_setting = {
				type:'post',
				url:'/404.jsp',
				timeout:10000,
				async:true,
				cache:false,
				data:{},
				success:function(data,textStatus){
//					console.log('............. ajax success');
				},
				complete:function(XMLHttpRequest,textStatus){
					_this._ajax_complete(XMLHttpRequest, textStatus);
				}
			};
			opts = _this._extend(opt_setting, opts);
			$.ajax(opts);
		},
		_ajax_complete:function(XMLHttpRequest,textStatus){
//			console.log(XMLHttpRequest.status);
//			console.log(XMLHttpRequest.textStatus);
		},
		_extend:function(p1,p2){
			return $.extend(p1,p2||{});
		},
		
};

var fullscreen=function(){  
    elem=document.body;  
    if(elem.webkitRequestFullScreen){  
        elem.webkitRequestFullScreen();     
    }else if(elem.mozRequestFullScreen){  
        elem.mozRequestFullScreen();  
    }else if(elem.requestFullScreen){  
        elem.requestFullscreen();  
    }else{  
        //浏览器不支持全屏API或已被禁用  
    }  
}  
var exitFullscreen=function(){  
    var elem=document;  
    if(elem.webkitCancelFullScreen){  
        elem.webkitCancelFullScreen();      
    }else if(elem.mozCancelFullScreen){  
        elem.mozCancelFullScreen();  
    }else if(elem.cancelFullScreen){  
        elem.cancelFullScreen();  
    }else if(elem.exitFullscreen){  
        elem.exitFullscreen();  
    }else{  
        //浏览器不支持全屏API或已被禁用  
    }  
}



//异步请求登录拦截
function ajax_redirect_login(obj,fun){
	//debugger
    if(obj&&obj=='NO_LOGIN_STATE'){
        window.location.reload();
    }else{
        fun(obj);
    }


}


//关闭当前页面
function closeWebPage() {
    if (navigator.userAgent.indexOf("MSIE") > 0) {
        if (navigator.userAgent.indexOf("MSIE 6.0") > 0) {
            window.opener = null; window.close();
        }
        else {
            window.open('', '_top'); window.top.close();
        }
    }
    else if (navigator.userAgent.indexOf("Firefox") > 0) {
        window.location.href = 'about:blank '; //火狐默认状态非window.open的页面window.close是无效的
        //window.history.go(-2);
    }
    else {
        window.opener = null;
        window.open('', '_self', '');
        window.close();
    }
}


