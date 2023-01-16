<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Reset password</title>
<style type="text/css">
.forgetpassword {
	padding-left: 30%;
	padding-top: 2%;
	padding-right: 40%;
	padding-bottom: 2%;
	background-size: 100%;
}
</style>

<!-- <script type="text/javascript">
	function myFunction() {
		var x = document.getElementById("exampleInputPassword1");
		if (x.type === "password") {
			x.type = "text";
		} else {
			x.type = "password";
		}
	}
</script> -->
</head>
<body>


	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<img alt=""
			src="https://e7.pngegg.com/pngimages/483/254/png-clipart-creative-mall-public-toilet-logo-furniture-free-logo-design-template.png"
			width="50" height="50"> <a class="navbar-brand" href="#"
			style="padding-left: 1.8%; font-weight: bolder; font-size: xx-large;; font-variant: small-caps; font-style: italic;">Mall</a>

		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link"
					href="index.jsp">Home <span class="sr-only">(current)</span>
				</a></li>
			</ul>
		</div>
	</nav>
	<h1 style="text-align: center;font-size: x-large;font-weight: bolder;color: red;">Reset Password</h1>
	<p style="color: green;">${msg}</p>
	<p style="color: green;">${error}</p>
	<div class="forgetpassword">
		<form action="reset" method="post">
<div>
			<label class="form-label" for="form3Example4" style="font-size:large; font-style: normal;font-weight: normal;">Mall Name</label>
			<select name="mallName">
				<option selected>Choose...</option>
				<option value="LU LU">LU LU</option>
				<option value="Orion">Orion</option>
				<option value="Vega City">Vega City</option>
				<option value="Mantri">Mantri</option>
				<option value="Central">Central</option>
				<option value="Urban Oasis">Urban Oasis</option>
			</select>
</div>


			<button type="submit" class="btn btn-primary">send</button>
		</form>
	</div>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>