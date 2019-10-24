<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="str" value="java jsp spring html css"/>
<c:out value="${fn:contains(str,'java') }"/><br>

<c:if test="${fn:contains(str,'java') }">
	<div>java가 포함되어 있습니다.</div>
</c:if>

${fn:indexOf(str,'jsp') }<br>

${fn:length(str) }<br>


${fn:replace(str,'jsp','MMM')}<br>

<c:set var="str3" value="java jsp spring"/>
${fn:split(str3,' ') }<br>
<c:set var="str3Arr" value="${fn:split(str3,' ') }"/>
${str3Arr }<br>
<c:forEach var="i" items="${str3Arr }">
 ${i }<br>
</c:forEach>
<!-- 구분자를 이용해서 문자열을 합친다. -->
<c:set var="str3Join" value="${fn:join(str3Arr,'-') }"/>
${str3Join }<br>


<c:set var="str5" value="java jsp html"/>
${str5 }:${fn:substring(str5,0,1 )}<br>

<c:set var="uri" value="<%=request.getRequestURI() %>"/><br>
<c:set var="path" value="<%=request.getContextPath() %>"/><br>
${uri }<br>
${path }<br>
<c:set var="size" value="${fn:length(path) }"/>
<c:set var="size1" value="${fn:length(uri) }"/>
<c:set var="baseURL" value="${fn:substring(uri,size,size1) }"/>
111<br>
${fn:substring(uri,fn:length(path) ,fn:length(uri) ) }<br>
<br>
<c:out value="${baseURL }"/><br>
${baseURL }<br>


<c:set var="s1" value="abcdeDsSEQf"/>
${fn:toUpperCase(s1) }<br>

<c:set var="s2" value="ABCDddsEF"/>
${fn:toLowerCase(s2) }<br>

<c:set var="s3" value=" mmm mm m .   . "/>
${fn:length(s3) }<br>
<c:set var="s4" value="${fn:trim(s3) }"/><br>
${fn:length(s4) }<br>






</body>
</html>