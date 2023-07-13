<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!--  BOOTSTRAP -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/Forgot.css">


<title>Login</title>
</head>

<body>

	<!-- to prevent access before login and to prevent going back after logout-->
	<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");
	%>
	
	<!--  UPDATE PASSWORD-->
	<div id="login" >
	<div class = "container " id="child">
						<form action="Forget" method="post">
							<div>
								<h4>Forgot Password!</h4>
								<hr>
							</div>
							
							<h5 class="text-center text-info mt-2">GENERATE NEW PASSWORD</h5>
							
							<div class="form-group row ">
								<label for="username" class="col-sm-2 col-form-label">Username:</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" name="uname" id="uname"
										required>
								</div>
							</div>

							<div class="form-group row">
								<label for="password" class="col-sm-2 col-form-label">Enter New Password:</label>
								<div class="col-sm-6">
									<input type="password" name="pass" id="pass"
										class="form-control" required>
								</div>
							</div>

							<hr>

							<div class="form-group col-12 mt-4 text-center">
								<input type="submit" class="btn btn-outline-success "
									value="UPDATE NEW PASSWORD">
							</div>


						</form>
					</div>
				</div>



</body>
</html>