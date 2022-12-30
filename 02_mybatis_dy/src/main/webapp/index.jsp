<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp</title>
</head>
<body>
	<h2>사원 출력하기</h2>
	<h4><a href="${path}/emp/selectEmpAllMap.do">사원 조회</a></h4>
	<h2>
		<a href="${path}/selectDept.do?deptId=D5">부서조회</a>
	</h2>
	<h2>
		<a href="${path}/boardView.do?boardNo=31">게시글조회</a>
	</h2>
</body>
</html>