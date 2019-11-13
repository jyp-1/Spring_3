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
				
			
			<div class="container">
  			<h2>QnA Reply Page</h2>
  			<form action="./qnaReply" method="POST">
  		
  			<input type="hidden" name="num" value="${num}">
  		
    		<div class="form-group">
      			<label for="title">title:</label>
      			<input type="text" class="form-control" id="title" placeholder="Enter title" name="title">
    		</div><br>
    		
    		<div class="writer">
      			<label for="writer">writer:</label>
      			<input type="text" class="form-control" id="writer" placeholder="Enter writer" name="writer">
    		</div><br>
    		
    		<div class="contents">
      			<label for="contents">contents:</label>
      			<textarea class="form-control" id="contents" placeholder="Enter contents" name="contents"></textarea>
    		</div><br>
    		
    		
    			<button type="submit" class="btn btn-default">Submit</button>
    			<a href="./qnaList.jsp" class="btn btn-info">Go list</a>
  			</form>
			
				</div>
		
		
		
		
</body>
</html>