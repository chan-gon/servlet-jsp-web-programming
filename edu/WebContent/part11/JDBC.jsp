<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	Class.forName("oracle.jdbc.driver.OracleDriver");

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");

	Statement stmt = conn.createStatement();
	
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	PreparedStatement pstmt = conn.prepareStatement("insert into test values(?,?)");
	pstmt.setString(1, id);
	pstmt.setString(2, pwd);
	pstmt.executeUpdate();
	
	/* stmt.executeUpdate("create table test(id varchar2(5), pwd varchar2(5))");
	stmt.executeUpdate("insert into test values('aa','11')");
	stmt.executeUpdate("insert into test values('bb','22')");
	stmt.executeUpdate("insert into test values('cc','33')"); */
	
	ResultSet rs = stmt.executeQuery("select * from test");
	while (rs.next()) {
		out.print("<br>" + rs.getString("id") + " : " + rs.getString(2));
	}

	rs.close();
	stmt.close();
	conn.close();
	%>

</body>
</html>