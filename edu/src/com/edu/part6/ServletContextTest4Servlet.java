package com.edu.part6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/context4")
public class ServletContextTest4Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		
		/*
		 * Web Application 당 하나의 ServletContext가 생성됨.
		 * 따라서 ServletContextTest3Servlet, ServletContextTest4Servlet는
		 * 동일한 객체를 반환
		 */
		ServletContext sc = this.getServletContext();
		
		/*
		 * getAttribute는 Object 타입으로 반환하기 때문에
		 * 원래 데이터 타입으로 타입 캐스팅을 해야 한다.
		 */
		ShareObject obj1 = (ShareObject) sc.getAttribute("data1");
		ShareObject obj2 = (ShareObject) sc.getAttribute("data2");
		
		out.print("data1 : " + obj1.getCount() + " / " + obj1.getStr() + "<br/>");
		out.print("data2 : " + obj2.getCount() + " / " + obj2.getStr());
	}
}
