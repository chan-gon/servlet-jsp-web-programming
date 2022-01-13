<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:import url="exam01.jsp" var="url" />

<h1>${url }</h1>

<c:set var="num" value="${50 }" />
Score<c:out value="${num }" />는 

<c:if test="${num >= 60 }">
	합격
</c:if>

<br>

Score<c:out value="${num }" />는
<c:choose>
	<c:when test="${num >=90 }">A</c:when>
	<c:when test="${num >=80 }">B</c:when>
	<c:when test="${num >=70 }">C</c:when>
	<c:when test="${num >=60 }">D</c:when>
	<c:otherwise>F</c:otherwise>
</c:choose>

</body>
</html>