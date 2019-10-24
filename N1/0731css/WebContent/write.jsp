<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="writeOk.bo">
ID: <input type="text" name="userId" id="userId" /><br>
PW: <input type="password" name="bPw" id="bPw" /><br>
NICKNAME: <input type="text" name="bNickname" id="bNickname" /><br>
TITLE: <input type="text" name="bTitle" id="bTitle" /><br>
MEMO: <br>
<textarea name="bMemo" id="" cols="30" rows="10"></textarea><br>

<input type="reset" value="초기화" />
<input type="submit" value="글작성" />

</form>

</body>
</html>