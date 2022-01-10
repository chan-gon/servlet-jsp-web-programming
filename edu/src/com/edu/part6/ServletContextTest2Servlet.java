package com.edu.part6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/context2")
public class ServletContextTest2Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		ServletContext sc = this.getServletContext();
		
		out.print("Servlet version : " + sc.getMajorVersion() + "." + sc.getMinorVersion());
		out.print("<br>Server info : " + sc.getServerInfo());
		out.print("<br>Web Application Path : " + sc.getContextPath());
		out.print("<br>Web Application Name : " + sc.getServletContextName());
		out.print("<br>File Path : " + sc.getRealPath("/name.html"));
		sc.log("log write");
		
		out.close();
	}
	
}
