<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page errorPage="" %>  <!--  specify error page -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Black Jack Project</title>
	<link href="~/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
	<link href="~/metro-bootstrap-master/css/metro-bootstrap.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<%@include file="_header.jsp"%>
	<div>
		<div class="container">
			<h1>Home</h1>
			
			<div class="row-fluid">
				<div class="col-md-3">Sidebar</div>
				<div class="col-md-9">
					<div>
						<div>
							<div>
								<form action="Home" method="post">
									<p>
										NAME: <input type="text" name="name"/>
									</p>
									<p>
										<input type="submit" value="Enter name">
									</p>
								</form>				
							</div>
						</div>
						<div>
							Yet More Static Content
						</div>
					</div>
				</div>
				</div>
			</div>		
	</div>
	<script src="~/bootstrap/js/bootstrap.js"></script>
</body>
</html>