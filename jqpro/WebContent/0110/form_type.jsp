<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSP : Java Server Page</h1>
<h2>클라이언트에서 전송(제출/요청request)시 입력되어진 값들을 전송받는다.</h2>
<h3>전송받은 값들을 이용해서 어떤 처리(DB)를 한다. (거의 100%펀센트 DB처리를한다.)</h3>
<h4>처리된 결과를 이용하여 응답(response)페이지를 작성한다.</h4>
<h4>요청시 값 받기 : request.getParameter("name")</h4>
<%
	request.setCharacterEncoding("UTF-8");

	String uid = request.getParameter("id");
	String upass = request.getParameter("pass");
	String uname = request.getParameter("name");
	String ugender = request.getParameter("gender");
	String ufile = request.getParameter("file");
	
	
	String ulike[] = request.getParameterValues("like");
	String str = "";
 	for(int i = 0; i < ulike.length; i++){
		str += ulike[i] + " ";
	} 
	
%>
<h1>결과</h1>
<div>
아이디 : <%= uid %><br>
이름 : <%= uname %><br>
성별 : <%= ugender %><br>
관심분야 : <%= str %><br>
첨부파일 : <%= ufile %><br>
</div>
</body>
</html>