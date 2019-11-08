<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../layout/bootStrap.jsp" />
</head>
<body>
<c:import url="../layout/nav.jsp" />


	<div class="container">
  		
  		<form action="./noticeUpdate" method="post">
  		<h1>Update Your List</h1>
  			<input type="hidden" name="num" value="${dto.num}">
  		
    		<div class="form-group">
      			<label for="title">title:</label>
      			<input type="text" class="form-control" id="title"  value ="${dto.title}" placeholder="Enter title" name="title">
    		</div><br>
    		
    		<div class="contents">
      			<label for="contents">contents:</label>
      			<textarea class="form-control" id="contents"  placeholder="Enter contents" name="contents">${dto.contents}</textarea>
    		</div><br>
    		
    		
    			<button type="submit" class="btn btn-default">Submit</button>
  			</form>
				</div>

</body>
</html>