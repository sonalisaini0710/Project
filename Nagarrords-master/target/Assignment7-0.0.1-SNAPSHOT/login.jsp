<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/login.css">

<title>Login</title>
</head>
<body>
<!-- to prevent access before login and to prevent going back after logout-->
<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");

	%>
<div id="login" >
	<div class = "container " id="child">
						<form action="Login" method="post">
							<div>
								<h4>Login</h4>
								<hr>
							</div>

							<div class="form-group row ">
								<label for="username" class="col-sm-2 col-form-label">Username:</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" name="uname" id="uname"
										required>
								</div>
							</div>

							<div class="form-group row">
								<label for="password" class="col-sm-2 col-form-label">Password:</label>
								<div class="col-sm-6">
									<input type="password" name="pass" id="pass"
										class="form-control" required>
								</div>
							</div>

							<div class="form-group col-12 mt-4 text-center ">
								<a href="ForgetPassword.jsp" class="  text-info ">Forgotten
										your password?</a> <br>
							</div>

							<hr>

							<div class="form-group col-12 mt-4 text-center">
								<input type="submit" class="btn btn-outline-success "
									value="Login">
							</div>


						</form>
					</div>
				</div>



</body>
</html>