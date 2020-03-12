<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String resId = (String)request.getAttribute("resId");
	String mid = (String)request.getAttribute("mid");
	if(resId != null){//성공
		
%>
	{
	
		"sw" : "<%= resId %>님 가입을 축하 합니다"
	
	}
		
<%  }else{   %>
	
	{
	
		"sw" : "<%= mid %>님 가입 오류 발생"
	
	}
<%	
	}
	
%>	