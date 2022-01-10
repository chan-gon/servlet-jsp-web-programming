package com.edu.part6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/context1")
public class ServletContextTest1Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		/*
		 * this는 현재 객체, ServletContextTest1Servlet 객체를 가리킨다.
		 * 즉 ServletContextTest1Servlet 객체의 getServletContext() 메소드를 호출한다.
		 */
		ServletContext sc = this.getServletContext(); 
		/*
		 * out.print("this : " + this.getServletName() + "<br/>");
		 * out.print("Context : " + sc);
		 */
		
		String location = sc.getInitParameter("contextConfig");
		out.print("location : " + location);
		out.close();
	}
}
