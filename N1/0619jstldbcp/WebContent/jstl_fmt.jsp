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

숫자: <fmt:formatNumber value="12345" type="number"/><br>
숫자: <fmt:formatNumber value="12345" type="currency" currencySymbol="￦"/><br>
숫자: <fmt:formatNumber value="0.1" type="percent"/><br>
숫자: <fmt:formatNumber value="12.3656" pattern=".0"/><br>
<c:set var="num" value="12.0005"/>
<fmt:parseNumber var="i" integerOnly="true" type="number" value="${num }"/>
<c:out value="${i }"/>
</body>
</html>