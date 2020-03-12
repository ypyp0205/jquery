package kr.or.ddit.buyer.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.buyer.vo.BuyerVO;
import kr.or.ddit.ibatis.config.SqlMapClientFactory;


/*
 	dao객체 생성
 	get() return dao객체
 	
 	sqlMapClient객체 얻기
 	mapper의 sql문 실행
 */


public class BuyerDaoImpl implements IBuyerDao {

	private SqlMapClient client;
	private static IBuyerDao dao;
	
	private BuyerDaoImpl(){
		client = SqlMapClientFactory.getSMClient();
	}
	
	public static IBuyerDao getDao(){
		if (dao == null)dao = new BuyerDaoImpl();
		
		return dao; 
	}
	
	@Override
	public List<BuyerVO> nameList() throws SQLException {
		// TODO Auto-generated method stub
		return client.queryForList("buyer.nameList");
	}

	@Override
	public BuyerVO buyerDetail(String id) throws SQLException {
		// TODO Auto-generated method stub
		return (BuyerVO) client.queryForObject("buyer.buyerDetail", id);
	}

}
