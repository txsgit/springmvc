<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <c:set var="BASE" value="${pageContext.request.scheme }://${pageContext.request.serverName }:${pageContext.request.serverPort }${pageContext.request.contextPath}"/>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

 <script type="text/javascript"
            src="${BASE}/resources/common/js/jquery.js"></script>
 <script type="text/javascript"
            src="${BASE}/resources/common/js/pagenav1.1.min.js"></script>

<title>Insert title here</title>
</head>
<body>
hello,world!!  <br>
<table border="1">
 <tbody>
 <c:forEach items="${pageInfo.list }" var="item">
    <tr>
      <td>${item.courseId }</td>
      <td>${item.courseName }</td>
      <td>${item.enterpriseId }</td>
     <%--  <td>${item.phone }</td>
      <td>${item.email }</td>
      <td>${item.password }</td>
      <td>${item.enterpriseId }</td> --%>
   </tr>
</c:forEach>
 </tbody>
</table>

 
    <!-- 分页开始 -->
    <c:if test="${pageInfo.pages > 1 }">
        <div  id="pageID"></div>
        <%--//初始化页脚分页--%>
       
    </c:if>
    <!-- 分页结束 -->
    
<script>
//分页
pageNav.pre="上一页";
pageNav.next="下一页";
pageNav.fn = function(p,pn){
	window.location="${BASE}/user/showCourse.do?pageNum="+p;    
	};
 pageNav.go = function(p,pn){
	//alert("点击页面跳转时当前页   "+p+"   总页数"+pn);
    	if(null!=pageNav.fn){
    		pageNav.fn(p,pn);
    	}
	}; 
    $(function(){
    	var pageNavHtml=pageNav.nav(parseInt('${pageInfo.pageNum}'),parseInt('${pageInfo.pages}'))

    	$("#pageID").html(pageNavHtml);
    });
</script> 
</body>
</html>