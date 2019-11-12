<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>QNA</title>
<c:import url="../layout/bootStrap/bootStrap.jsp" />
</head>
<body>
		<c:import url="../layout/nav.jsp" />

<div>
		<div class="container">
			<h1>QnA List</h1>
			
			<table class="table">
				<tr>
					<td>NUM</td>
					<td>Title</td>
					<td>Writer</td>
					<td>Date</td>
					<td>Hit</td>
				</tr>
				
				<c:forEach items="${list}" var = "vo">
					<tr>
					<td>${vo.num}</td>
					<td><a href="./qnaSelect?num=${vo.num}">${vo.title}</a></td>
					<td>${vo.writer}</td>
					<td>${vo.reg_date}</td>
					<td>${vo.hit}</td>
				</tr>
				</c:forEach>	
					
			</table>
			
			<c:if test="./qnaList?curPage=${pager.curBlock gt 1}"><a href ="./qnaList?curPage=${pager.startNum-1}">[이전]</a>
			</c:if>
			<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
			<a href="./qnaList?curPage=${i}">${i}</a>
			</c:forEach>
			<c:if test="${pager.curBlock lt pager.totalBlock}">
			<a href="./qnaList?curPage=${pager.lastNum+1}">[다음]</a>
			</c:if>
			
		</div>
	</div>





</body>
</html>