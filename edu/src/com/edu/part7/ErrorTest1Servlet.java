package com.edu.part7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/errorTest1")
public class ErrorTest1Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();

		try {
			String getQuery = req.getQueryString();
			out.println("Query = " + getQuery);
			out.print(getQuery.length());

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			out.close();
		}
	}
}
