<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://sargue.net/jsptags/time" prefix="javatime" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>책 상세정보</title>
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	    <h2 class="text-center">책 상세정보</h2>
		<table class="table table-bordered table table-hover">
			<tr><td>아이디 :</td><td>${book.id}</td></tr>
			<tr><td>타이틀 :</td><td>${book.title}</td></tr>
			<tr><td>작가 :</td><td>${book.author}</td></tr>
			<tr><td>넘버 :</td><td>${book.isbn}</td></tr>
			<tr><td>장르 :</td><td>${book.genre}</td></tr>
			<tr><td>등록날짜 :</td><td><javatime:format value="${book.createdAt}" pattern="yyyy-MM-dd"/></td></tr>
		</table>
		
	</div>
</body>
</html>












