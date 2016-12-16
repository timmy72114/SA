<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>產品管理</title>
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
<%@include file="user-sidebar.jspf"%>
<%@include file="navbar.jspf" %>
<div class="container">
	<div class="row">
		<div class="col-md-6">
		 
		</div>
		<div class="col-md-6">
	
		</div>
	</div>
	<!-- 固定欄位寬度為300px -->
	<div class="col-fixed">
		固定寬度300px
	</div>
    <!-- 固定欄位寬度為300px end-->
</div>

    <div class="container theme-showcase" role="main" style="margin-left: 235px">
    
      <div class="jumbotron" >    
        <h1>產品上架管理</h1>
      </div>
	<div class="container">
	
		
	
	
		<div class="row">
			<br>
			<div class="col-md-12">
	  			<a class="btn btn-primary" href="insertProduct">新增</a>
				<table class="table">
				  	<tr>
				  		<th>編號</th>
				  		<th>圖片</th>
				  		<th>類別</th>
				  		<th>商品名稱</th>
				  		<th>價格</th>
				  		<th>尺寸</th>
				  		<th>顏色</th>
				  		<th>庫存量</th>
				  		<th>安全存量</th>
				  		<th>編輯</th>
				  	</tr>
				  	<c:forEach items="${productList}" var="product">
					  	<tr>
	
					  		<td>${product.id}</td>
					  		<td>    ${message}<p>
                                <a href="profile">
                                <img src="resources//fileUpload//${product.id}.jpg" style="width: 300px; height:300px ;" ></td>
					  		</a>
					  		<td>${product.category}</td>
					  		<td>${product.desc}</td>
					  		<td>${product.price}</td>
					  		<td>${product.size}</td>
					  		<td>${product.color}</td>
					  		<td>${product.inventory}</td>
					  		<td>${product.reorderPoint}</td>
					  		
					  		<td>
					  			<a class="btn btn-default" href="modifyProduct?id=${product.id}">修改</a>
					  			<a class="btn btn-sm btn-danger deleteBtn" href="deleteProduct?id=${product.id}">刪除</a>
					  		
					  			<form method="POST" action="uploadFile" enctype="multipart/form-data">
					  			   <input type="hidden" name = "id" value ="${product.id}">
                                   <input type="file" name="file"><br /> 
                                   <input type="submit" value="Upload"> 
                        </form>
					  		
					  		</td>
					  	</tr>
				  	</c:forEach>
				</table>
			</div>
		</div>
	</div>
	

    </div><!-- /.container -->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</body>
</html>
