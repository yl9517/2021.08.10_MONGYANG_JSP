package kr.or.mn.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import kr.or.mn.comm.DBConnection;
import kr.or.mn.dao.BoardDAO;
import kr.or.mn.dto.BoardDTO;

public class BoardService {

private static BoardService instance=new BoardService();
	
	public static BoardService getInstance() {
		return instance;
	}
	private BoardService() {}
	
	public List<BoardDTO> getList() {
		// TODO Auto-generated method stub
		DBConnection dbconn=DBConnection.getDBInstance();
		Connection conn=null;
		List<BoardDTO> list=new ArrayList<BoardDTO>();
		
		try {
			conn=dbconn.getConnection();
			BoardDAO dao=new BoardDAO();
			list=dao.getList(conn);
		}catch(SQLException|NamingException e) {
			System.out.println(e);
		}finally {
			if(conn!=null) try {conn.close();} catch(SQLException e) {}
		}
		return list;
	}
	
}
