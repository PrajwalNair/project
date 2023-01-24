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
<title>Admin-Success</title>
<link rel="icon" type="image/x-icon" href="https://www.freeiconspng.com/thumbs/success-icon/success-icon-19.png">
<style type="text/css">
.forgetpassword {
	padding-left: 35%;
	padding-top: 4%;
	padding-right: 20%;
	padding-bottom: 2%;
	background-size: 100%;
}
body {
	/* background-image: url("https://png.pngtree.com/thumb_back/fh260/background/20200714/pngtree-modern-double-color-futuristic-neon-background-image_351866.jpg");
	background-repeat: no-repeat;
	background-size: 100%; */

background-color: #D0D3D4;

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
</head>
<body>


	<nav class="navbar navbar-expand-lg navbar-dark " style="background-color: #34495E;">
		<img alt=""
			src="https://i0.wp.com/myjamnagar.com/wp-content/uploads/2020/09/shopping-online-e1600266149435.jpg?ssl=1"
			width="50" height="35"> <a class="navbar-brand" href="#"
			style="padding-left: 1.8%; font-weight: bolder; font-size: xx-large;">Mall</a>

		<div style="padding-left: 75%;" >
			<a href="index.jsp" style="color: white;font-size: large;">Home</a>&nbsp;&nbsp;&nbsp;
			<a href="Admin.jsp" style="color: white;font-size: large;">Admin</a>
		</div>
	</nav>
			
		
	<marquee style="font-size: xx-large;color: black;" scrollamount="20" direction="right">Welcome</marquee>
	<div style="padding-top: 3%;">
	<p style="text-align: center;font-size: x-large;color: black;">Mall Name  : ${dto.mallName}</p> 
	<p style="text-align: center;font-size: x-large;color: black;">Admin Name : ${dto.name}</p>
	</div>
	<div class="forgetpassword">
		<a class="btn btn" href="Customer.jsp" role="button" style="background-color: #27AE60 ;color: white;">Take Customer FeedBack</a>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	
		<a class="btn btn" href="SearchFeedBack.jsp" role="button" style="background-color: #27AE60 ;color: white;">Search FeedBack</a>	
	</div>
	
		<footer>
		<p style="font-size:small; ;padding-top: 0.7%;color: white;">
			© Created By : Prajwal Nair &nbsp; <a
				href="#" style="font-size: small;color: blue;"><u> prajwalnair.xworkz@gmail.com</u></a>
		</p>
	</footer>

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