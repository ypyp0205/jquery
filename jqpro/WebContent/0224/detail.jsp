<%@page import="kr.or.ddit.buyer.vo.BuyerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
  BuyerVO  vo =(BuyerVO)request.getAttribute("buyerVO");
%> 
{
   "id"    : "<%= vo.getBuyer_id() %>",
   "lgu"   : "<%= vo.getBuyer_lgu() %>",
   "name"  : "<%= vo.getBuyer_name() %>",
   "mail"  : "<%= vo.getBuyer_mail() %>",
   "bank"  : "<%= vo.getBuyer_bank() %>",
   "bname" : "<%= vo.getBuyer_bankname() %>",
   "bno"   : "<%= vo.getBuyer_bankno() %>",
   "zip"   : "<%= vo.getBuyer_zip() %>",
   "add1"  : "<%= vo.getBuyer_add1() %>",
   "add2"  : "<%= vo.getBuyer_add2() %>"
}   












