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

			<form id="frm" action="./noticeList" method="get">
				<input type="hidden" id="curPage" value="1" name="curPage">
				<select name="kind">
					<option id="kt" value="kt">Title</option>
					<option id="kw" value="kw">Writer</option>
					<option id="kc" value="kc">Contents</option>
				</select> 
				
				<input type="text" name="search" value="${pager.search}">
				<button>search</button>
			</form>


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



			<c:if test="${pager.curBlock gt 1}">
				<span id="${pager.startNum-1}" class="list">[이전]</span>
			</c:if>
			<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
				<span id="${i}" class="list">${i}</span>
			</c:forEach>
			<c:if test="${pager.curBlock lt pager.totalBlock }">
				<span id="${pager.lastNum+1}" class="list">[다음]</span>
			</c:if>
			


			<script type="text/javascript">
					var kind ='${pager.kind}'
					if(kind==''){
						kind='kt'
					}
					$("#"+kind).prop("selected", true);
					$(".list").click(function() {
						$("#curPage").val($(this).attr("id"));
						$("#frm").submit();
					});
					
				</script>
				
			<a href="./noticeWrite">Write</a>
		</div>



	</div>

</body>
</html>