<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">


<title>產品管理</title>
 <!-- Custom CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css.css" rel="stylesheet">
     <link href="<c:url value="/resources/css/simple-sidebar.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/bootstrap.min.css/" />" rel="stylesheet">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<%@include file="sidebar.jspf"%>
<%@include file="cus-navbar.jspf"%>

	<div class="container theme-showcase" role="main" style="margin-left:250px">

		<div class="jumbotron">
			<h1><font size="6">顧客頁面</font></h1>
		</div>
		<div class="form-group">
			分類:<select class="form-control" name="category"
				value=${product.category}>
				
				<option>xx</option>
				<option>xx</option>
				<option>依價格排序</option>
			</select> <a class="btn btn-sm btn-danger deleteBtn" href="pricesearch">確定</a>

		</div>

		<div class="container">




			<!--  -->
			<div class="row">
				<div class='box'>
					<div class="row">
						<c:forEach items="${productList}" var="product2">
							<div class="col-sm-4 col-md-4">
								<div class="thumbnail" style="border: 0;">
									<a href="profile"><img
										src="resources//fileUpload//${product2.id}.jpg"
										style="width: 300px; height: 300px;"></a>
									</td> 
									<p>${product2.price}</p>
									<div class="caption">
										<p>${product2.id}</p>
										<a href="product">${product2.desc}</a>
										<p>
											<a href="product" class="btn btn-primary" role="button">Button</a>
											<a href="#" class="btn btn-default" role="button">Button</a>
										</p>
									</div>
								</div>
							</div>
						</c:forEach>
						<br>
						<div class="col-md-12">

							<table class="table">
								<tr>
									<th>圖片</th>
									<th>編號</th>
									<th>類別</th>
									<th>商品名稱</th>
									<th>價格</th>
									<th>顏色</th>
									<th>尺寸</th>
									<th>庫存量</th>


								</tr>
								<c:forEach items="${productList}" var="product">
									<tr>
										<td><img src="resources//fileUpload//${product.id}.jpg"
											width="30%"></td>
										<td>${product.id}</td>
										<td>${product.category}</td>
										<td>${product.desc}</td>
										<td>${product.price}</td>
										<td>${product.color}</td>
										<td>${product.size}</td>
										<td>${product.inventory}</td>

										<%-- <td>
					  		<a class="btn btn-default" href="updateProduct?id=${product.id}">修改</a>
					  		<a class="btn btn-sm btn-danger deleteBtn" herf="deleteProduct?id=${product.id}" >刪除</a>
					  		</td>  --%>


									</tr>
								</c:forEach>
							</table>
						</div>

					</div>
				</div>
			</div>
			<!--  -->
		</div>



	</div>
	<!-- /.container -->

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	
</body>

</html>
