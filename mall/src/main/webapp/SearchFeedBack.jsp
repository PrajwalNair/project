<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feed-Back</title>
<link rel="icon" type="image/x-icon" href="https://image.pngaaa.com/560/25560-middle.png">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<style type="text/css">

body{
background-color: #D0D3D4;
}
.table_modification{
padding-right: 50%;
padding-left: 2%;
padding-top: 1%;

}
</style>

<script type="text/javascript">



</script>
</head>

<body>

	<nav class="navbar navbar-expand-lg navbar-dark " style="background-color: #34495E;">
		<img alt=""
			src="https://i0.wp.com/myjamnagar.com/wp-content/uploads/2020/09/shopping-online-e1600266149435.jpg?ssl=1"
			width="50" height="35"> <a class="navbar-brand" href="#"
			style="padding-left: 1.8%; font-weight: bolder; font-size: xx-large;">Mall</a>

		<div style="padding-left: 80%;" >
			<a href="Admin.jsp" style="color: white;font-size: large;">Admin</a>
		</div>
	</nav>

	<form action="feedback" method="post">
	<div style="padding-left: 75%; padding-top: 0.8%;">
		<label>Name</label> <input type="text" name="name"> <input
			class="btn " type="submit" value="search" role="button" style="background-color: #27AE60">
			</div>
		<div class="table_modification">
			<table class=" table-primary " >
				<thead class="table-danger ">
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
				<c:forEach items="${list}" var="dto">
					<tr>
						<td>${dto.feedback_id}</td>
						<td>${dto.purpose}</td>
						<td>${dto.ambience}</td>
						<td>${dto.visitedFoodCourt}</td>
						<td>${dto.visitedRestRooms}</td>
						<td>${dto.parkingExperience}</td>
						<td>${dto.totalExperience}</td>
						<td>${dto.feedBack}</td>

					</tr>
				</c:forEach>
			</table>
		</div>

		<p class="lead fw-normal mb-0 me-3"
			style="text-align: center; color: green; font-size: large; font-weight: bold;">${msg}</p>
		<p class="lead fw-normal mb-0 me-3"
			style="text-align: center; color: red; font-size: large; font-weight: bold;">${error}</p>

	</form>

</body>
</html>