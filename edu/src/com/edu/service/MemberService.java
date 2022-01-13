package com.edu.service;

import java.util.ArrayList;

import com.edu.dao.MemberDAO;
import com.edu.vo.MemberVO;

public class MemberService {
	
	/*
	 * 객체를 하나만 생성하고, getInstance() 메소드를 통해 외부에서 생성된
	 * 하나의 객체를 사용하도록 설정
	 */
	
	private static MemberService service = new MemberService();
	public MemberDAO dao = MemberDAO.getInstance();
	
	private MemberService() {}
	
	public static MemberService getInstance() {
		return service;
	}
	
	public void memberInsert(MemberVO member) {
		dao.memberInsert(member);
	}
	
	public MemberVO memberSearch(String id) {
		MemberVO member = dao.memberSearch(id);
		return member;
	}

	public void memberUpdate(MemberVO member) {
		dao.memberUpdate(member);
	}

	public void memberDelete(String id) {
		dao.memberDelete(id);
	}

	public ArrayList<MemberVO> memberList() {
		ArrayList<MemberVO> list = dao.memberList();
		return list;
	}

}
