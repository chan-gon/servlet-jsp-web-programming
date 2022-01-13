package com.edu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.service.MemberService;
import com.edu.util.HttpUtil;

public class MemberDeleteController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");

		MemberService service = MemberService.getInstance();
		service.memberDelete(id);

		request.setAttribute("id", id);
		HttpUtil.forward(request, response, "/result/memberDeleteOutput.jsp");
	}

}
