<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style>
 p{
   font-size : 2.0em;
 }
 span{
    color : red;
 }
</style>
<%
   //클라이언트 요청시 전달 되는 값을 받는다 
   
   //처리 (CRUD)한다 
   //처리결과를 가지고 응답데이타(text)를 만든다 
   
   request.setCharacterEncoding("UTF-8");
   
   String name = request.getParameter("name");
   String vage = request.getParameter("age");
 %>
 
 당신의 이름은  <%= name %> 이고 <br>
 나이는 <%= vage %>입니다 <br>
 <p><%= name %>님 <span>환영합니다</span></p>










