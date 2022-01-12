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
if (request.getMethod().equals("POST")) { 
%>

<%
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

if (id.isEmpty() || pwd.isEmpty()) {
	request.setAttribute("error", "<h1 style='color:#BADA55'>ID or Password is incorrect</h1>");
	RequestDispatcher rd = request.getRequestDispatcher("logInOut.jsp");
	rd.forward(request, response);
	return;
}
if (session.isNew() || session.getAttribute("id") == null) {
	session.setAttribute("id", id);
	out.print("Login Successful");
} else {
	out.print("You have already logged in");
}
%>
<%= id %> / <%= pwd %>

<%
} else if (request.getMethod().equals("GET")) {
if (session != null && session.getAttribute("id") != null) {
	session.invalidate();
	out.print("LogOut Successful");
} else {
	out.print("You have already logged Out");
}
}
%>

<%
RequestDispatcher rd = request.getRequestDispatcher("logInOut.jsp");
rd.forward(request, response);
%>

</body>
</html>