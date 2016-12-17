<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    

    <title>新增產品</title>
    <!-- Bootstrap Core CSS -->
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
	<%@include file="user-sidebar.jspf" %>
    <%@include file="navbar.jspf" %>
	
	<div class="container theme-showcase" role="main">
    
      <div class="jumbotron" >    
        <h1>產品新增</h1>
      </div>
	<div class="container">

	
	
		<div class="row">
			<br>
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<form method="post" action="insertProduct" id="insertForm">
					<div class="form-group">
						類別:<select class="form-control" name="category">
  						<option>新品</option>
  						<option>特價</option>
  						<option>女裝</option>
  						<option>飾品</option>
						</select>
					</div>
					<div class="form-group">
						<label>描述:</label>
						<input type="text" name="desc" placeholder="輸入產品敘述" required>
						<p class="help-block">產品敘述</p>
					</div>
					<div class="form-group">
						<label>價格:</label>
						<input type="text" name="price" value=${product.price}>
						<p class="help-block">商品價格</p>
					</div>
					<div class="form-group">
						 尺寸:<select class="form-control" name="size">
  						<option>XS</option>
  						<option>S</option>
  						<option>M</option>
  						<option>L</option>
  						<option>XL</option>
  						<option>F</option>
						</select>
						<p class="help-block">目前庫存尺寸</p>
					</div>
					<div class="form-group">
						<label>顏色:</label>
						<input type="text" name="color" value=${product.color}>
						<p class="help-block">目前庫存顏色</p>
					</div>
					<div class="form-group">
						<label>庫存量:</label>
						<input type="number" name="inventory" placeholder="0" min="0" required>
						<p class="help-block">目前庫存數量</p>
					</div>
					<div class="form-group">
						<label>安全存量:</label>
						<input type="number" name="reorderPoint" placeholder="0" required>
						<p class="help-block">當目前庫存數量低於此數字就應該進貨</p>
					</div>
			  		<button type="submit" class="btn btn-default">新增</button>
				</form>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
	</div><!-- /.container -->
	    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/resources/js/jquery.validate.js" />"></script>
    <script src="<c:url value="/resources/js/additional-methods.js" />"></script>
    <script src="<c:url value="/resources/js/messages_zh_TW.js" />"></script>
	<script>
	$("#insertForm").validate();
	</script>
    
</body>
</html>
