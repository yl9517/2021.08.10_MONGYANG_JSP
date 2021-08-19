package kr.or.mn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.mn.comm.Action;
import kr.or.mn.comm.Forward;

public class BoardInsertAction implements Action {

	@Override
	public Forward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String boardType=request.getParameter("boardType");
		
		Forward forward=new Forward();
		forward.setForward(true);
		forward.setPath("/view.jsp?page=board/boardInsert.jsp?boardType="+boardType);
		
		return forward;
	}

}
