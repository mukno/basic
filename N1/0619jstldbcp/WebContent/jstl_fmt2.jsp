<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="now" value="<%=new Date() %>"/>
현재 날짜:<c:out value="${now }"/><br>
현재 시간:<fmt:formatDate value="${now }" type="time"/><br>
오늘 날짜:<fmt:formatDate value="${now }" type="date"/><br>
오늘 날짜:<fmt:formatDate value="${now }" type="both"/><br><br>

오늘 날짜:<fmt:formatDate value="${now }" type="both" dateStyle="short"/><br>
오늘 날짜:<fmt:formatDate value="${now }" type="both" timeStyle="short"/><br>
오늘 날짜:<fmt:formatDate value="${now }" type="both" dateStyle="short" timeStyle="short"/><br><br>

오늘 날짜:<fmt:formatDate value="${now }" type="both" dateStyle="medium" /><br>
오늘 날짜:<fmt:formatDate value="${now }" type="both" timeStyle="medium"/><br>
오늘 날짜:<fmt:formatDate value="${now }" type="both" dateStyle="medium" timeStyle="medium"/><br><br>



오늘 날짜:<fmt:formatDate value="${now }" type="both" dateStyle="long" /><br>
오늘 날짜:<fmt:formatDate value="${now }" type="both" timeStyle="long"/><br>
오늘 날짜:<fmt:formatDate value="${now }" type="both" dateStyle="long" timeStyle="long"/><br><br>

오늘 날짜:<fmt:formatDate value="${now }" pattern="yyyy-mm-dd"/><br>
오늘 날짜:<fmt:formatDate value="${now }" pattern="yyyy/mm/dd"/><br>
오늘 날짜:<fmt:formatDate value="${now }" pattern="yyyy-mm-dd hh:kk:ss"/><br>

<c:set var="i" value="0619"/>
<fmt:parseDate var="i2" value="${i }" pattern="hhmm"/>
<c:out value="${i2 }"/>



</body>
</html>