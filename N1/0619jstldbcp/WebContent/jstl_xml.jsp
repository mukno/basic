<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="xmlTxt1">
	<javastudy>
		<java>
			<version>1.8</version>
			<encoding>UTF-8</encoding>
			<database>MYSQL</database>
		</java>
		<servelt>
			<version>2.3</version>
			<target>MODEL2</target>
			<position>Controller</position>
		</servelt>
	</javastudy>
</c:set>
<x:parse var="javastudy" xml="${xmlTxt1 }"/>
<x:set var="java" select="javastudy/java"/>
<c:out value="${java }"/>
</body>
</html>