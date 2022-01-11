<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언문</title>
</head>
<body>

<%!
	public int sum(int a, int b) {
	return a + b;
}
%>

<h1><%= this.sum(1,1) %></h1>

</body>
</html>