<%@page import="javax.imageio.plugins.jpeg.JPEGImageWriteParam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pageContext</title>
</head>
<body>

	<%!public void work(String p, PageContext pc) {
		try {
			JspWriter out = pc.getOut();
			if (p.equals("include")) {
				out.print("Before include <br>");
				pc.include("test.jsp");
				out.print("After include <br>");
			} else if (p.equals("forward")) {
				pc.forward("test.jsp");
			}
		} catch (Exception e) {
			System.out.println("Error!");
		}
	}%>
	<%
	String p = request.getParameter("p");
	this.work(p, pageContext);
	%>

</body>
</html>