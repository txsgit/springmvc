/**
 * 处理字符串工具
 * aaa,bbb,ccc
 */

//删除一个元素，逗号分隔 	
function delElement(strs,str){
	
	var a = new Array();
	var astr = "";
	a = strs.split(",");
	for(var i=0; i<a.length; i++){
		var last = a[a.length-1];
		if(a[i] != str){
			if(a[i] == last){
				astr += a[i]; 
			}else{
				astr += a[i]+","; 
			}
		}
	}
	
	return astr;
	
}

//删除指定位置的元素 
function delElement(strs, index){
	
	var a = new Array();
	var astr = "";
	a = strs.split(",");
	
	for(var i=0; i<a.length; i++){
		
		if(i!=index){
			astr += a[i]+",";
		}
		
	}
	
	var astr2 = "";
	var b = new Array();
	astr = removeComma(astr);
	b = astr.split(",");
	for(var j=0; j<b.length; j++){
		
		if(b[j]==""){
			continue;
		}
		
		var last2 = b[b.length-1];
 		if(last2 != b[j]){
 			astr2 += b[j]+",";
 		}else{
 			astr2 += b[j];
 		}	
		
	}
	
	return astr2;
	
}


//修改指定位置的元素
function updateElement(strs,newstr, index){
	
	var a = new Array();
	var astr = "";
	a = strs.split(",");
	
	for(var i=0; i<a.length; i++){
		
		if(i ==index){
			a[i]=newstr;
		}
		
	}
	
	
	
	return a.toString();
	
}

function removeComma(strs){
	var astr = "";
	if(strs!="" && strs!=null){
		var index = strs.lastIndexOf(",");
		if(index == (strs.length - 1)){
			astr = strs.substr(0,strs.length-1);
		}		
	}
	return astr;
}
	
//添加一个元素，逗号分隔 
function addElement(strs, addStr){
	var astr = "";
	if(strs=="" || strs==null){
		astr += addStr;
	}else{
		astr += strs + "," + addStr;
	}
	
	return astr;
	
}	
	
//获得一个元素的位置 
function strIndexOf(strs, str){
	var a = new Array();
	a = strs.split(",");
	 
	for(var i=0; i<a.length; i++){
		if(str == a[i]){
			return i;
		}
	}	
	return -1;
}	