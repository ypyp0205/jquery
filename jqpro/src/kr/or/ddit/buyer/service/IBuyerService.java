package kr.or.ddit.buyer.service;

import java.util.List;

import kr.or.ddit.buyer.vo.BuyerVO;

public interface IBuyerService {

	public List<BuyerVO> nameList();
	public BuyerVO buyerDetail(String id);
	
}
