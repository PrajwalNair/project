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
	padding-left: 35%;
	padding-top: 7%;
	padding-right: 20%;
	padding-bottom: 2%;
	background-size: 100%;
}
</style>
</head>
<body style="background-color:buttonface;">


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
	<p style="text-align: center;font-size: x-large;font-weight: bolder;">Mall Name  : ${dto.mallName}</p> 
	<p style="text-align: center;font-size: x-large;font-weight: bolder;">Admin Name : ${dto.name}</p>
	<div class="forgetpassword">
		<a class="btn btn-success" href="Customer.jsp" role="button">Take Customer FeedBack</a>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	
		<a class="btn btn-success" href="SearchFeedBack.jsp" role="button">Search FeedBack</a>	
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