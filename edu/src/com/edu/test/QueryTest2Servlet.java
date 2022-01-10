package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest2")
public class QueryTest2Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();

		out.print("<html><head><title>Query 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>POST 방식으로 요청</h1>");
		ServletInputStream input = req.getInputStream();
		out.print("input = " + input + "<br/>");

		int len = req.getContentLength();
		out.print("len = " + len + "<br/>");

		byte[] buf = new byte[len];
		out.print("buf = " + buf + "<br/>");

		input.readLine(buf, 0, len);
		String s = new String(buf);

		out.print("전체 문자열 = " + s);
		out.print("<br/>");
		out.println("</body></html>");
		out.close();
	}
}
