package kr.or.ddit.member.sevice;

import java.util.List;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;


public interface IMemberService {
	
	public List<ZipVO> selectBydong(String dong);
	public String checkById(String id);
	public String insertMember(MemberVO vo);
	
}
