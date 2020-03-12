package kr.or.ddit.buyer.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.buyer.vo.BuyerVO;

public interface IBuyerDao {
	public List<BuyerVO> nameList() throws SQLException;
	public BuyerVO buyerDetail(String id) throws SQLException;
}
