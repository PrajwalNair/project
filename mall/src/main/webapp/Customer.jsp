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
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.2.1/css/fontawesome.min.css">

<title>Customer-info</title>
<link rel="icon" type="image/x-icon" href="https://cdn-icons-png.flaticon.com/512/174/174197.png">
<style type="text/css">
/* body {
	background-image:
		url("https://img.freepik.com/premium-vector/welcome-sign-letters-with-confetti-background-celebration-greeting-holiday-illustration-banner-confetti-decoration_41737-257.jpg?w=2000");
	background-repeat: no-repeat;
	background-size: 100%;
} */
@media ( min-width : 1025px) {
	.h-custom {
		height: 100vh !important;
	}
}

.card-registration .select-input.form-control[readonly]:not([disabled])
	{
	font-size: 1rem;
	line-height: 2.15;
	padding-left: .75em;
	padding-right: .75em;
}

.card-registration .select-arrow {
	top: 13px;
}

.gradient-custom-2 {
	/* fallback for old browsers */
	/* background: #a1c4fd; */
	/* Chrome 10-25, Safari 5.1-6 */
	/*  background: -webkit-linear-gradient(to right, rgba(161, 196, 253, 1), rgba(194, 233, 251, 1)); */
	/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
	/* background: linear-gradient(to right, rgba(161, 196, 253, 1), rgba(194, 233, 251, 1)) */
	
}

.bg-indigo {
	background-color: #4835d4;
}

@media ( min-width : 992px) {
	.card-registration-2 .bg-indigo {
		border-top-right-radius: 15px;
		border-bottom-right-radius: 15px;
	}
}

@media ( max-width : 991px) {
	.card-registration-2 .bg-indigo {
		border-bottom-left-radius: 15px;
		border-bottom-right-radius: 15px;
	}
}

<!--
css






 






for






 






rating






 






in






 






star







 







-->#area {
	display: none;
}

body{
background-color: #D0D3D4;
}

label {
	font-size: large;
	font-style: italic;
	font-weight: bold;
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
		$("#input-1").rating({
			min : 0,
			max : 6,
			step : 0.1,
			stars : 6,
			// showCaption:false,
			starCaptions : function(val) {
				if (val < 3) {
					return "Low: " + val + " stars";
				} else {
					return "High: " + val + " stars";
				}
			}
		});
	});

	function hideshowarea(val) {
		if (val == "Yes") {
			document.getElementById("area").style.display = "block";
		} else {

			document.getElementById("area").style.display = "none";
		}
	}
	function hideshowarea1(val) {
		if (val == "Yes") {
			document.getElementById("area1").style.display = "block";
		} else {

			document.getElementById("area1").style.display = "none";
		}
	}
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

	<section class="h-100 h-custom gradient-custom-2">

		<div class="container py-5 h-100" >
			<form action="customer" method="post">
				<div
					class="row d-flex justify-content-center align-items-center h-100" style="padding-bottom: 10%;">
					<div class="col-12">
						<div class="card card-registration card-registration-2"
							style="border-radius: 15px; background-color: #85929E;">
							<div class="card-body p-0">
								<div class="row g-0">
									<div class="col-lg-6">
										<div class="p-5">
											<h3 class="fw-normal mb-5" style="color: black;">
												<u>Customer Personal Information</u>
											</h3>



											<div class="row">
												<div class="col-md-6 mb-4 pb-2">

													<div class="form-outline">
														<label class="form-label" for="form3Examplev2">Name</label>
														<input type="text" id="form3Examplev2" name="name"
															class="form-control form-control-lg" required/>
													</div>

												</div>

											

											
												<div class="col-md-6 mb-4 pb-2">

													<div class="form-outline">
														<label class="form-label" for="form3Examplev2">Email</label>
														<input type="text" id="form3Examplev2" name="email"
															class="form-control form-control-lg" required/>
													</div>

												</div>

											
</div>
											<div class="row">
												<div class="col-md-6 mb-4 pb-2">

													<div class="form-outline">
														<label class="form-label" for="form3Examplev2">Contact
															No.</label> <input type="text" id="form3Examplev2"
															name="mobileNo" class="form-control form-control-lg" required/>
													</div>

												</div>

											

											
												<div class="col-md-6 mb-4 pb-2">

													<div class="form-outline">
														<label class="form-label" for="form3Examplev2">Age</label>
														<input type="text" id="form3Examplev2" name="age"
															class="form-control form-control-lg" required/>
													</div>

												</div>

											</div>

											<div class="mb-4 pb-2">
												<label class="form-label" for="form3Examplev2">Country</label>
												<select class="select" name="country" required>
													<option value="-----Select-----">-----Select-----</option>
													<option value="India">India</option>
													<option value="Australia">Australia</option>
													<option value="USA">USA</option>
													<option value="Switzerland">Switzerland</option>
												</select>
											</div>

											<div class="mb-4 pb-2">
												<label class="form-label" for="form3Examplev2">State
													&nbsp;&nbsp;&nbsp;&nbsp;</label> <select class="select"
													name="state" required>
													<option value="-----Select-----">-----Select-----</option>
													<option value="Karnataka">Karnataka</option>
													<option value="Kerala">Kerala</option>
													<option value="Gujarat">Gujarat</option>
													<option value="Maharashtra">Maharashtra</option>
												</select>
											</div>

											<div class="mb-4 pb-2">
												<label class="form-label" for="form3Examplev2">City
													&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label> <select class="select"
													name="city" required>
													<option value="-----Select-----">-----Select-----</option>
													<option value="Bangalore">Bangalore</option>
													<option value="Thiravananthapuram">Thiravananthapuram</option>
													<option value="Ahmedabad">Ahmedabad</option>
													<option value="Mumbai">Mumbai</option>
												</select>
											</div>

											<div class="row">
												<div class="col-md-6 mb-4 pb-2">

													<div class="form-outline">
														<label class="form-label" for="form3Examplev2">Pincode</label>
														<input type="text" id="form3Examplev2" name="pincode"
															class="form-control form-control-lg" required/>
													</div>

												</div>

											</div>




										</div>
									</div>
									<div class="col-lg-6" style="background-color: #99A3A4">
										<div class="p-5">
											<h3 class="fw-normal mb-5" style="color: black;">
												<u>FeedBack</u>
											</h3>

											<div class="mb-4 pb-2">
												<label class="form-label" for="form3Examplev2">Purpose</label>
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select
													class="select" name="purpose" required>
													<option value="-----Select-----">-----Select-----</option>
													<option value="Shopping">Shopping</option>
													<option value="Playing">Playing</option>
													<option value="Watch Movie">Watch Movie</option>
													<option value="Visit FoodCourt">Visit FoodCourt</option>
												</select>
											</div>

											<div class="mb-4 pb-2">
												<div class="form-outline form-white">
													<label for="input-1" class="control-label">Ambience</label>
													&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio"
														name="ambience" id="yes" value="Yes"> <label
														for="yes">Yes</label> <input type="radio" name="ambience"
														id="no" value="No"> <label for="no">No</label>
												</div>
											</div>
											
											


											<div class="mb-4 pb-2">
												<div class="form-outline form-white">
													<label for="input-1" class="control-label">Visited
														Food Court</label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
														type="radio" name="visitedFoodCourt" id="vfc" value="Yes"
														onclick="hideshowarea('Yes');"> <label for="yes">Yes</label>
													<input type="radio" name="visitedFoodCourt" id="vfc"
														value="No" onclick="hideshowarea('No');"> <label
														for="no">No</label>
													<textarea id="area" name="visitedFoodCourt"
														style="display: none"></textarea>
												</div>
											</div>

											<div class="mb-4 pb-2">
												<div class="form-outline form-white">
													<label for="input-1" class="control-label">Visited
														Rest Room</label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
														type="radio" name="visitedRestRooms" id="vrr" value="Yes"
														onclick="hideshowarea1('Yes');"><label for="yes">Yes</label>
													<input type="radio" name="visitedRestRooms" id="vrr"
														value="No" onclick="hideshowarea1('No');"> <label
														for="no">No</label>
													<textarea id="area1" name="visitedRestRooms"
														style="display: none"></textarea>

												</div>
											</div>

											<div class="mb-4 pb-2">
												<div class="form-outline form-white">
													<label for="input-1" class="control-label">Parking
														Experience</label> &nbsp;&nbsp;&nbsp;&nbsp; <input type="radio"
														name="parkingExperience" id="yes" value="Yes"> <label
														for="yes">Yes</label> <input type="radio"
														name="parkingExperience" id="no" value="No"> <label
														for="no">No</label>
												</div>
											</div>

											<div class="mb-4 pb-2">
												<div class="form-outline form-white">
													<label for="input-1" class="control-label">Total
														Experience</label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
														type="radio" name="totalExperience" id="yes" value="Yes">
													<label for="yes">Yes</label> <input type="radio"
														name="totalExperience" id="no" value="No"> <label
														for="no">No</label>

												</div>
											</div>

											<div class="form-group">
												<label for="exampleFormControlTextarea1">Feed Back</label>
												<textarea class="form-control rounded-0"
													id="exampleFormControlTextarea1" rows="5" name="feedBack" required></textarea>
											</div>

											<div
												class="form-check d-flex justify-content-start mb-4 pb-3">
												<input class="form-check-input me-3" type="checkbox"
													value="" id="form2Example3c" required /> <label
													class="form-check-label" for="form2Example3"
													style="color: red; font-size: medium; font-weight: normal;">
													I do accept the <a href="#!" style="font-size: small;"><u>Terms
															and Conditions</u></a> of your site.
												</label>
											</div>

											<input type="submit" class="btn btn-success" value="Send"
												role="button" style="background-color: #27AE60">
											<p class="lead fw-normal mb-0 me-3"
												style="text-align: center; color: green; font-size: large; font-weight: bold;">${msg}</p>
											<p class="lead fw-normal mb-0 me-3"
												style="text-align: center; color: red; font-size: large; font-weight: bold;">${error}</p>

										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>

	</section>


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