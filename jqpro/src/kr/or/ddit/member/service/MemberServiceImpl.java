package kr.or.ddit.member.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;

public class MemberServiceImpl implements IMemberService{

	private IMemberDao  dao;
	private static IMemberService  service;
	
	private MemberServiceImpl(){
		dao = MemberDaoImpl.getDao();
	}
	
	public static IMemberService getService(){
		if(service == null) service = new MemberServiceImpl();
		return service;
	}
	@Override
	public String checkById(String id) {
		String memId = null;
		try {
			memId = dao.checkById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return memId;
	}

	@Override
	public List<ZipVO> selectByDong(String dong) {
		List<ZipVO>  list = null;
		
		try {
			list = dao.selectByDong(dong);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public String insertMember(MemberVO vo) {
		String memId = null;
		
		try {
			memId = dao.insertMember(vo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return memId;
	}

}
