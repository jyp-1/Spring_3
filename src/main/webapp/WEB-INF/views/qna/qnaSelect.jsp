<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../layout/bootStrap/bootStrap.jsp"/>
</head>
<body>
<c:import url="../layout/nav.jsp" />
		<H1>QnA Select Page</H1>
		
		<div class="container">
  			<div>
    
    			<table class="table">
    				<tr>
						<td>NUM</td>
						<td>Title</td>
						<td>Writer</td>
						<td>Date</td>
						<td>Hit</td>
					</tr>
					<tr>
						<td>${qs.num}</td>
    					<td>${qs.title}</td>
    					<td>${qs.writer}</td>
    					<td>${qs.reg_date}</td>
    					<td>${qs.hit}</td>
    				</tr>
    			</table>  
    				<div>Contents: ${qs.contents}</div>
    			<br> 
    				    			 
  				</div>
  			<a href="./qnaUpdate?num=${qs.num}" class="btn btn-default">Update</a>
  			<a href="./qnaDelete?num=${qs.num}" class="btn btn-default">Delete</a>
  			<a href="./qnaReply?num=${qs.num}" class="btn btn-default">Reply</a>
  			</div>
  			
		
</body>
</html>