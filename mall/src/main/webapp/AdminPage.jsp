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
<title>Admin-Login</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-secondary">
		<img alt=""
			src="https://e7.pngegg.com/pngimages/483/254/png-clipart-creative-mall-public-toilet-logo-furniture-free-logo-design-template.png"
			width="150" height="100"> <a class="navbar-brand" href="#"
			style="padding-left: 1.8%; font-weight: bolder; font-size: xx-large;; font-variant: small-caps; font-style: italic;">Mall</a>

		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link"
					href="index.jsp">Home <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Features</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Pricing</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#"
					id="navbarDropdownMenuLink" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false"> Dropdown link </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
						<a class="dropdown-item" href="#">Action</a> <a
							class="dropdown-item" href="#">Another action</a> <a
							class="dropdown-item" href="#">Something else here</a>
					</div></li>
			</ul>
		</div>

		<div>
			<a href="#" style="color: white;">AboutUs</a> <a href="#"
				style="color: white;">Contact</a>

		</div>
	</nav>
<p style="text-align: center; color: green;">${msg}</p>
<p style="text-align: center;color: red;">${error}</p>
	<div class="infopage">
		<form action="admin" method="get">
			<div class="form-group row">
				<label for="inputEmail3" class="col-sm-2 col-form-label">Admin
					Name:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="name"
						 placeholder="Name" required="required">
				</div>
			</div>
			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-2 col-form-label">Password:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="password"
						 placeholder="Password" required="required">
				</div>
			</div>

			

			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<label class="input-group-text" for="inputGroupSelect01">Mall Name</label>
				</div>
				<select class="custom-select" name="mallName">
					<option selected>Choose...</option>
					<option value="Lu Lu">Lu Lu</option>
					<option value="Orion">Orion</option>
					<option value="Forrum">Forrum</option>
					<option value="Vega City">Vega City</option>
				</select>
			</div>
			
			<div class="form-group row">
				<div class="col-sm-10">
					<button type="submit" class="btn btn-success">Send</button>
				</div>
			</div>
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