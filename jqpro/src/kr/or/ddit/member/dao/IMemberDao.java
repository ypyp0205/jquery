package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;

public interface IMemberDao {
	 public String checkById(String id) throws SQLException;
	 public List<ZipVO>  selectByDong(String dong) throws SQLException;
	 public String insertMember(MemberVO vo) throws SQLException;
}
