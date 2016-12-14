<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>註冊</title>
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

	<button type="submit" class="btn btn-danger">送出</button>
	<label class="label label-warning">${message} ${account.username}</label>
</form>

</body>
<li>
          <a href="/springTest/success"  role="button" >送出</a>
          </li>
</html> 