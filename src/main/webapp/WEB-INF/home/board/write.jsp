<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>글쓰기 테스트</h1>

<form action="/write.do" method="post">
<input type="hidden" name="writer" value="test1">
<input type="text" name="title" placeholder="제목을 입력하세요"> 
<textarea rows="5" cols="50" name="content"></textarea>
<button type="submit">제출</button>
</form>

</body>
</html>