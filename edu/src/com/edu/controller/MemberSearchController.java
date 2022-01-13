package com.edu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.service.MemberService;
import com.edu.util.HttpUtil;
import com.edu.vo.MemberVO;

public class MemberSearchController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String job = request.getParameter("job");
		String path = null;

		if (job.equals("search")) {
			path = "/memberSearch.jsp";
		} else if (job.equals("update")) {
			path = "/memberUpdate.jsp";
		} else if (job.equals("delete")) {
			path = "/memberDelete.jsp";
		}

		if (id.isEmpty()) {
			request.setAttribute("error", "ID를 입력하세요.");
			HttpUtil.forward(request, response, path);
			return;
		}

		MemberService service = MemberService.getInstance();
		MemberVO member = service.memberSearch(id);

		if (member == null) {
			request.setAttribute("result", "검색된 정보가 없습니다.");
		}
		request.setAttribute("member", member);
		if (job.equals("search")) {
			path = "/result/memberSearchOutput.jsp";
		}
		HttpUtil.forward(request, response, path);
	}

}
