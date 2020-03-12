package kr.or.ddit.member.sevice;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;


public class MemberServiceImpl implements IMemberService {
	
	private IMemberDao dao;
	private static IMemberService service;
	
	private MemberServiceImpl(){
		dao = MemberDaoImpl.getDao();
	}
	
	public static IMemberService getService(){
		if(service==null)
			service = new MemberServiceImpl();
		return service;
	}

	@Override
	public List<ZipVO> selectBydong(String dong) {
		List<ZipVO> list = null;
		
		try {
			list = dao.selectBydong(dong);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public String checkById(String id) {
		String vo = null;
		
		try {
			vo = dao.checkById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public String insertMember(MemberVO vo) {
		String ivo = null;
		
		try {
			ivo = dao.insertMember(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ivo;
	}

}
