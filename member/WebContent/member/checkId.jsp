<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String id = (String)request.getAttribute("resId");
	//a001, null
	String inId = (String)request.getAttribute("inId");
	
	if(id == null){		
		//사용가능 - korea를 입력한 경우

%>		
	{
		"sw" : "<%= inId%>사용 가능 합니다"
	}
	
		
<%	}else{
		//사용 불가능 = a001를 입력한 경우
	
%>
	{
		"sw" : "<%= inId%> 사용 불가능 합니다"
	}

<%
}
%>