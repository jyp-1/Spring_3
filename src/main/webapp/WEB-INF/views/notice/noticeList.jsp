<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../layout/bootStrap.jsp" />
</head>
<body>
	<c:import url="../layout/nav.jsp" />

	<div>
		<div class="container">
			<h1>Notice List</h1>
			<table class="table">
				<tr>
					<td>NUM</td>
					<td>Title</td>
					<td>Writer</td>
					<td>Date</td>
					<td>Hit</td>
				</tr>
				<c:forEach items="${list}" var="dto" varStatus="st">
					<tr>
						<td>${dto.num}</td>
						<td><a href="noticeSelect?num=${dto.num}">${dto.title}</td>
						<td>${dto.writer}</td>
						<td>${dto.reg_date}</td>
						<td>${dto.hit}</td>
					</tr>
				</c:forEach>

			</table>


			<div>
				<ul class="pagination">
				<c:if test="${pager.curBlock gt 1}">
					<li><a href="./noticeList?curPage=${pager.startNum-1}">이전</a></li>
				</c:if>
						<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
							<li><a href="./noticeList?curPage=${i}">${i}</a></li>
						</c:forEach>
				<c:if test="${pager.curBlock lt pager.totalBlock }">
					<li><a href="./noticeList?curPage=${pager.lastNum+1}">다음</a></li>
				</c:if>
				</ul>
			</div>
			
			<a href="./noticeWrite">Write</a>
			
		</div>
	</div>
</body>
</html>