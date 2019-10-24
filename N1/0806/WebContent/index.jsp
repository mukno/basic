<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="<c:url value='/js/jquery-3.4.1.min.js'/>"></script>
<link rel="stylesheet" href="<c:url value='/css/common/reset.css'/>" media="all"/>
<link rel="stylesheet" href="<c:url value='/css/common/header.css'/>" media="all"/>
<link rel="stylesheet" href="<c:url value='/css/common/footer.css'/>" media="all"/>
<link rel="stylesheet" href="<c:url value='/css/content/index.css'/>" media="all"/>

</head>
<body>
<div id="wrap">
	<c:import url="/commens/header.jsp"/>
	<c:import url="/content/indexContent.jsp"/>
	<c:import url="/commens/footer.jsp"></c:import>
</div>
<script>

	var idx=0;
	function autoGallery(){
		
		var $in1=$('.in1');

		$in1.eq(idx).fadeIn().siblings().fadeOut();
		
		if(idx>8)idx=-1;
		
		idx++;
	}
	setInterval(autoGallery,3000);

</script>

</body>
</html>