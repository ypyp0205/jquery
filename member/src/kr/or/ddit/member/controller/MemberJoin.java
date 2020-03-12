package kr.or.ddit.member.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import kr.or.ddit.member.sevice.IMemberService;
import kr.or.ddit.member.sevice.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;

/**
 * Servlet implementation class MemberJoin
 */
@WebServlet("/MemberJoin")
public class MemberJoin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberJoin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//0. 클라이언트 요청시 (전송) 전달값 받기
		
		MemberVO vo = new MemberVO();
		
		try {
			BeanUtils.populate(vo, request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		
//			String mid = request.getParameter("mem_id");
//			String mpass = request.getParameter("mem_pass");
//			String mname = request.getParameter("mem_name");
//			String mhp = request.getParameter("mem_hp");
//			String mzip = request.getParameter("mem_zip");
//			String madd1 = request.getParameter("mem_add1");
//			String madd2 = request.getParameter("mem_add2");
//			String mmail = request.getParameter("mem_mail");
//			String mbir = request.getParameter("mem_bir");
//			
//			//vo에 저장하기
//			

//			vo.setMem_add1(madd1);
//			vo.setMem_add2(madd2);
//			vo.setMem_bir(mbir);
//			vo.setMem_hp(mhp);
//			vo.setMem_id(mid);
//			vo.setMem_mail(mmail);
//			vo.setMem_name(mname);
//			vo.setMem_pass(mpass);
//			vo.setMem_zip(mzip);
//			
		//1. service 객체 얻기
			IMemberService service = MemberServiceImpl.getService();
			
		//2. service 메소드 호출 - 결과값 받기
			//결과값 받기 : 저장성공 : 저장한ID ,  저장실패 : null
			
			String resId = service.insertMember(vo);
			
		//3. 결과값을 request에 저장
			
			request.setAttribute("resId", resId);
			request.setAttribute("mid", vo.getMem_id());
		
		//4. view 페이지 이동
		
			request.getRequestDispatcher("member/insert.jsp").forward(request, response);
		
	}

}
