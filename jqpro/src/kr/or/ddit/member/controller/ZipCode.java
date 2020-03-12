package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.ZipVO;

/**
 * Servlet implementation class ZipCode
 */
@WebServlet("/ZipCode")
public class ZipCode extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ZipCode() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 0.
		request.setCharacterEncoding("UTF-8");
		String dong = request.getParameter("dong");
		
		
		// 1. 서비스얻기
		IMemberService service = MemberServiceImpl.getService();
		
		
		// 2. 서비스 메소드 호출
		List<ZipVO> list = service.selectByDong(dong);
		
		
		// 3. 결과값 저장한다.
		request.setAttribute("list", list);
		
		
		// 4.
		request.getRequestDispatcher("0226/zipsearch.jsp").forward(request, response);
		
		
		
	}

}
