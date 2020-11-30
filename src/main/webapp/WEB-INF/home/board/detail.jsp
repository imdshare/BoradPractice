<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>상세목록 테스트</h1>

<ul>
<li>${list.title}</li>
<li>${list.contents}</li>
</ul>

<a href="/update/${list.idx}">수정</a> <!-- 내가 적은 모델의 변수 -->
<a href="/delete/${list.idx}">삭제</a>

</body>
</html>