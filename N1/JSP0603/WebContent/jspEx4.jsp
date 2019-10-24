<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

response.setContentType("text/html;charset=utf8");
response.setCharacterEncoding("charset=utf8");

out.print("클라이언트에 응답");
out.isAutoFlush();//자동으로 버퍼가차면비운다.

//out.flush();//out 모두 출력후 종료
//out.clear();//out삭제
out.close();//out 출력후 바로 종료 밑으로안감

%>
버퍼의크기:<%=out.getBufferSize() %>


</body>
</html>