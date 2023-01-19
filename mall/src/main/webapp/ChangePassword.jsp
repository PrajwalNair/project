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
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<title>Change-password</title>
<link rel="icon" type="image/x-icon" href="https://www.freeiconspng.com/thumbs/login-icon/login-key-icon-lock-locked-login-15.png">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<style type="text/css">
/* .forgetpassword {
	padding-left: 30%;
	padding-top: 2%;
	padding-right: 40%;
	padding-bottom: 2%;
	background-size: 100%;
} */
.pass_show {
	position: relative
}

.pass_show .ptxt {
	position: absolute;
	top: 50%;
	right: 10px;
	z-index: 1;
	color: #f36c01;
	margin-top: -10px;
	cursor: pointer;
	transition: .3s ease all;
}

.pass_show .ptxt:hover {
	color: #333333;
}
footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	height:7%;
	background-color: #34495E;
	color: black;
	text-align: center;
}
</style>

<script type="text/javascript">
	$(document).ready(function() {
		$('.pass_show').append('<span class="ptxt">Show</span>');
	});

	$(document).on('click', '.pass_show .ptxt', function() {

		$(this).text($(this).text() == "Show" ? "Hide" : "Show");

		$(this).prev().attr('type', function(index, attr) {
			return attr == 'password' ? 'text' : 'password';
		});

	});
</script>
</head>
<body>


	<nav class="navbar navbar-expand-lg navbar-dark " style="background-color: #34495E;width: 100%;">
		<img alt=""
			src="https://i0.wp.com/myjamnagar.com/wp-content/uploads/2020/09/shopping-online-e1600266149435.jpg?ssl=1"
			width="50" height="35"> <a class="navbar-brand" href="#"
			style="padding-left: 1.8%; font-weight: bolder; font-size: xx-large;">Mall</a>

		<div style="padding-left: 83%;" >
			<a href="index.jsp" style="color: white;font-size: large;">Home</a>
		</div>
	</nav>
	<%-- <p style="color: green;">${msg}</p>
<p style="color: green;">${error}</p>
<p style="color: green;text-align: center;font-size: x-large;font-weight: bolder;">${dto.name}</p>
	<div class="forgetpassword">
		<form action="forgotPassword" method="post">
			
			<div class="form-group">
				<label >Generated Password</label> <input
					type="text" class="form-control" name="generatedPassword" 
					placeholder="Generated Password">
			</div>
			<div class="form-group">
				<label >New Password</label> <input
					type="password" class="form-control" name="password" 
					placeholder="New Password" >
					
			</div>
			<div class="form-group">
				<label >Confirm Password</label> <input
					type="password" class="form-control" name="password1" 
					placeholder="Confirm Password">
			</div>
			<div class="form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1">Check me
					out</label>
			</div>
			<button type="submit" class="btn btn-primary">click</button>
		</form>
	</div> --%>
<p style="color: green;text-align: center;font-size: xx-large;font-weight: bolder;">${msg}</p>
<p style="color: green;">${error}</p>	
	<div class="container">
		<form action="forgotPassword" method="post">
			<div class="row">
				<div class="col-sm-4">

					<label>Generated Password</label>
					<div class="form-group pass_show">
						<input type="password" class="form-control"
							name="generatedPassword" placeholder="Generated Password">
					</div>
					<label>New Password</label>
					<div class="form-group pass_show">
						<input type="password" class="form-control" name="password"
							placeholder="New Password">
					</div>
					<label>Confirm Password</label>
					<div class="form-group pass_show">
						<input type="password" class="form-control" name="password1"
							placeholder="Confirm Password">
					</div>
					<button type="submit" class="btn btn-primary">submit</button>
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
		
		<footer>
		<p style="font-size:small; ;padding-top: 0.7%;color: white;">
			© Created By : Prajwal Nair &nbsp; <a
				href="#" style="font-size: small;color: blue;"><u> prajwalnair.xworkz@gmail.com</u></a>
		</p>
	</footer>
</body>
</html>