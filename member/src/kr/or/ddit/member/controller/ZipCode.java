package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.sevice.IMemberService;
import kr.or.ddit.member.sevice.MemberServiceImpl;
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
       
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0
		request.setCharacterEncoding("UTF-8");
		String dong = request.getParameter("dong");
		
		//1
		IMemberService service = MemberServiceImpl.getService();
		
		//2
		List<ZipVO> list = service.selectBydong(dong);
		
		//3
		request.setAttribute("list", list);
		
		//4
		request.getRequestDispatcher("member/zipsearch.jsp").forward(request, response);
		
	}
	

}
