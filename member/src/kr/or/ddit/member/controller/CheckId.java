package kr.or.ddit.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.sevice.IMemberService;
import kr.or.ddit.member.sevice.MemberServiceImpl;

/**
 * Servlet implementation class CheckId
 */
@WebServlet("/CheckId")
public class CheckId extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckId() {
        super();
        
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0.요청시 클라이언트에서 값을 전달 - 입력한 ID
		
		String inId = request.getParameter("id");
		
		//1.service 객체 얻기
		IMemberService service = MemberServiceImpl.getService();
		
		//2. service메소드 호출 - 결과값 받기
		String resId = service.checkById(inId);
		
		//3. 결과값을 request에 저장
		request.setAttribute("resId", resId);
		request.setAttribute("inId", inId);
		//4. 결과값을 출력 (json데이터 생성) - view페이지 이동(forword)
		RequestDispatcher disp = request.getRequestDispatcher("member/checkId.jsp");
		
		disp.forward(request, response);
	}

}
