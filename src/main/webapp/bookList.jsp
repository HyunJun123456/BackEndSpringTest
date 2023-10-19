<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://sargue.net/jsptags/time" prefix="javatime" %>
<html>
<head>
<title>책 관리</title>
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<h2 class="text-center">책 목록</h2>
		<table class="table table-bordered table table-hover"> 
			<thead> 
				<tr> 
					<th>아이디</th> 
					<th>타이틀</th> 
					<th>작가</th>
					<th>넘버</th>
					<th>장르</th>
					<th>등록날짜</th>
				</tr> 
		</thead> 
		<tbody> 
			<c:forEach var="book" items="${bookList}">
				<tr>
					<td>
					 	<a href="getBook.do?id=${book.id}">${book.id}</a>
					 </td>
					<td>${book.title}</td>
					<td>${book.author}</td>
					<td>${book.isbn}</td>
					<td>${book.genre}</td>
					<td><javatime:format value="${book.createdAt}" pattern="yyyy-MM-dd"/></td>
					<%-- <td>${book.createdAt}</td> --%>
					<%-- <td><fmt:formatDate value="${book.createdAt}" pattern="yyyy-MM-dd" /><td> --%>
				</tr>
			</c:forEach>
		</tbody> 
	</table>
	</div>
</body>
</html>

































