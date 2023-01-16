<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>info</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style type="text/css">
.table_modification{
padding-left: 20%;
padding-right: 20%;
padding-top: 3%;
}
</style>	
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<img alt=""
			src="https://e7.pngegg.com/pngimages/483/254/png-clipart-creative-mall-public-toilet-logo-furniture-free-logo-design-template.png"
			width="50" height="50"> <a class="navbar-brand" href="#"
			style="padding-left: 1.8%; font-weight: bolder; font-size: xx-large;; font-variant: small-caps; font-style: italic;">Mall</a>
		<div class="collapse navbar-collapse" id="navbarNavDropdown"></div>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<a class="nav-link" href="index.jsp"
				style="padding-left: 85%; color: white; font-size: x-large;"
				role="button">Home </a>
		</div>
	</nav>
	<p style="text-align: center;font-size: x-large;font-weight: bolder;font-style: italic;">${message}</p>
	<form action="customer" method="post">
		<div class="table_modification">
			<table class="table table-striped table-dark">
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>E-Mail</th>
						<th>Contact No.</th>
						<th>Age</th>
						<th>Country</th>
						<th>State</th>
						<th>City</th>
						<th>Pincode</th>
					</tr>
				</thead>
				<tr>
					<td>${dto.customer_id}</td>
					<td>${dto.name}</td>
					<td>${dto.email}</td>
					<td>${dto.mobileNo}</td>
					<td>${dto.age}</td>
					<td>${dto.country}</td>
					<td>${dto.state}</td>
					<td>${dto.city}</td>	
					<td>${dto.pincode}</td>
					
				</tr>
			</table>
		</div>
		<div class="table_modification">
			<table class="table table-striped table-dark">
				<thead>
					<tr>
						<th>Id</th>
						<th>Purpose</th>
						<th>Ambience</th>
						<th>Visited Food Court</th>
						<th>Visited Rest Rooms</th>
						<th>Parking Experience</th>
						<th>Total Experience</th>
						<th>Feedback</th>
					</tr>
				</thead>
				<tr>
					<td>${dto1.feedback_id}</td>
					<td>${dto1.purpose}</td>
					<td>${dto1.ambience}</td>
					<td>${dto1.visitedFoodCourt}</td>
					<td>${dto1.visitedRestRooms}</td>
					<td>${dto1.parkingExperience}</td>
					<td>${dto1.totalExperience}</td>
					<td>${dto1.feedBack}</td>
				</tr>
			</table>
		</div> 
	</form>
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