package kr.or.ddit.lprod.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.lprod.vo.LprodVO;

public interface ILprodDao {
	public List<LprodVO> listLprod() throws SQLException;
}
