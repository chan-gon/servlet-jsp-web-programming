<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.edu.beans.BookBean"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="name" value="Amy" />
	<c:out value="${name }" />
	<br>

	<c:remove var="name" />
	<c:out value="${name }" />
	<br>

	<%
	BookBean book = new BookBean("Davinci Code", "Dan Brown", "ABC");
	request.setAttribute("book", book);
	%>

	<c:set var="title" value="<%=book.getTitle()%>" />
	<c:out value="${title }" />
	<br>

	<c:set var="author" value="<%=book.getAuthor()%>" />
	<c:out value="${author }" />
	<br>


</body>
</html>