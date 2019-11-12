<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../layout/bootStrap.jsp"/>
</head>
<body>
<c:import url="../layout/nav.jsp" />
		<H1>notice Select Page</H1>
		
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
						<td>${dto.num}</td>
    					<td>${dto.title}</td>
    					<td>${dto.writer}</td>
    					<td>${dto.reg_date}</td>
    					<td>${dto.hit}</td>
    				</tr>
    			</table>  
    				<div>Contents: ${dto.contents}</div>
    			<br> 
    				    			 
  				</div>
  			<a href="./noticeUpdate?num=${dto.num}" class="btn btn-default">Update</a>
  			<a href="./noticeDelete?num=${dto.num}" class="btn btn-default">Delete</a>
  			</div>
  			
		
</body>
</html>