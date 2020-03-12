package kr.or.ddit.lprod.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.buyer.dao.IBuyerDao;
import kr.or.ddit.buyer.service.BuyerServiceImpl;
import kr.or.ddit.buyer.service.IBuyerService;
import kr.or.ddit.buyer.vo.BuyerVO;
import kr.or.ddit.lprod.dao.ILprodDao;
import kr.or.ddit.lprod.dao.LprodDaoImpl;
import kr.or.ddit.lprod.vo.LprodVO;

public class LprodServiceImpl implements ILprodService{

	private static ILprodService service;
	private ILprodDao dao;
	
	// 생성자 - dao객체얻기
	private LprodServiceImpl(){
		
		dao = LprodDaoImpl.getDao();
	}
	
	//service 객체생성, 리턴
	public static ILprodService getService(){
		if(service == null)service = new LprodServiceImpl();
		return service;
	}
	
	
	
	@Override
	public List<LprodVO> listLprod() {
		
		//1. 변수선언
		
		//2. dao메소드 실행
		
		//3. return null;
	List<LprodVO> list = null;
		

		try {
			list = dao.listLprod();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	
	
}
