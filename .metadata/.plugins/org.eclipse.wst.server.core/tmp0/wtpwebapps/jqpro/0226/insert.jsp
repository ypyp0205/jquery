<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  String resid= (String)request.getAttribute("resid");
  String mid= (String)request.getAttribute("mid");
  if(resid != null){  //성공
%>
   {
     "sw"  : "<%= mid %>님 가입을 축하합니다"
   }
	  
<%  }else { //실패  %>

   {
     "sw"  : "<%= mid %>님 가입시 오류 발생"
   }
<%	  
  }
%>







