<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생성</title>
</head>
<body>
<h3>회원 가입</h3>

${error }

<form action="memberInsert.do" method="post">
	ID : <input type="text" name="id"> <br>
	PWD : <input type="password" name="passwd"> <br>
	NAME : <input type="text" name="name"> <br>
	EMAIL : <input type="text" name="mail"> <br>
	<input type="submit" value="가입">
</form>

</body>
</html>