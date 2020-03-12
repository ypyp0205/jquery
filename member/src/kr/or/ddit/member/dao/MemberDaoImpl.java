package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;



public class MemberDaoImpl implements IMemberDao{
	
	private SqlMapClient client;
	private static IMemberDao dao;
	
	private MemberDaoImpl(){
		client = SqlMapClientFactory.getSMClient();
	}
	
	public static IMemberDao getDao(){
		if(dao==null)
			dao = new MemberDaoImpl();
		return dao;
	}
	

	@Override
	public List<ZipVO> selectBydong(String dong) throws SQLException {
		
		return client.queryForList("member.selectBydong", dong);
	}

	@Override
	public String checkById(String id) throws SQLException {
		
		return (String)client.queryForObject("member.checkById", id);
	}

	@Override
	public String insertMember(MemberVO vo) throws SQLException {
		
		return (String)client.insert("member.insertMember", vo);
	}

}
