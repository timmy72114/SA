<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	

<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>註冊</title>
<!-- 最新編譯和最佳化的 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

<!-- 選擇性佈景主題 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

<!-- 最新編譯和最佳化的 JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<h1>
	註冊
</h1>

<form action="newuser" method ="post">
	帳號:<input type="text" name ="name"/><br>
	電話:<input type="text" name ="phone"/><br>
	地址:<input type="text" name ="address"/><br>
	密碼:<input type="password" name ="password"/>

	<a href="/springTest/success"  role="button" ><button type="button" class="btn btn-danger">送出</button></a>
	
<%-- 	<label class="label label-warning">${message} ${account.username}</label> --%>
</form>

</body>

</html> 