<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
 <link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous"> 
<title>Admin-Login</title>
<style type="text/css">
@charset "utf-8"; 

* {
	margin: 0px;
	padding: 0px;
	box-sizing: border-box
}

.limiter {
	width: 100%;
	margin: 0 auto
}

.container-login100 {
	width: 100%;
	min-height: 100vh;
	display: -webkit-box;
	display: -webkit-flex;
	display: -moz-box;
	display: -ms-flexbox;
	display: flex;
	flex-wrap: wrap;
	justify-content: center;
	align-items: center;
	padding: 15px;
	background-repeat: no-repeat;
	background-position: center;
	background-size: cover;
	position: relative;
	z-index: 1
}

.container-login100::before {
	content: "";
	display: block;
	position: absolute;
	z-index: -1;
	width: 100%;
	height: 100%;
	top: 0;
	left: 0;
	background-color: rgba(0, 0, 0, 0.5)
}

.login_topimg {
	border-top-left-radius: 5px;
	border-top-right-radius: 5px;
	width: 100%;
	min-height: 185px;
	position: relative;
	background: #91B3D1
		url(https://image.freepik.com/free-vector/cyber-data-security-online-concept-illustration-internet-security-information-privacy-protection_1150-37330.jpg)
		no-repeat;
	background-size: auto;
	background-position: center
}

.login_topimg img {
	width: 100%;
	height: auto
}

.login_topimg .logo_wrap {
	border-radius: 5px;
	background: #fff;
	padding: 13px 55px;
	position: relative;
	top: -21px;
	margin: 10px auto;
	max-width: 255px
}

#login .wrap-login100 {
	background-color: #fff;
	padding: 20px 45px;
	border-bottom-left-radius: 5px;
	border-bottom-right-radius: 5px;
	width: 100%
}

.login100-form {
	width: 100%;
	display: -webkit-box;
	display: -webkit-flex;
	display: -moz-box;
	display: -ms-flexbox;
	display: flex;
	justify-content: space-between;
	flex-wrap: wrap
}

.login100-form-title {
	font-size: 25px;
	color: #243762;
	line-height: 1.2;
	text-transform: uppercase;
	text-align: center;
	width: 100%;
	display: block
}

.login100-form-subtitle {
	font-size: 16px;
	color: #243762;
	line-height: 1.2;
	text-align: center;
	width: 100%;
	display: block
}

.wrap-input100 {
	position: relative;
	width: 100%;
	z-index: 1
}

#login input {
	outline: none;
	border: none
}

#login label {
	display: inline-block;
	margin-bottom: .5rem
}

.input-checkbox100 {
	display: none
}

input {
	outline: none;
	border: none
}

.wrap-input100 {
	position: relative;
	width: 100%;
	z-index: 1
}

.input100 {
	font-size: 15px;
	line-height: 1.2;
	color: #686868;
	display: block;
	width: 100%;
	background: #e6e6e6;
	height: 45px;
	border-radius: 3px;
	padding: 0 30px 0 55px
}

.focus-input100 {
	display: block;
	position: absolute;
	border-radius: 3px;
	bottom: 0;
	left: 0;
	z-index: -1;
	width: 100%;
	height: 100%;
	box-shadow: 0px 0px 0px 0px;
	color: rgba(211, 63, 141, 0.6)
}

.symbol-input100 {
	font-size: 15px;
	color: #999999;
	display: -webkit-box;
	display: -webkit-flex;
	display: -moz-box;
	display: -ms-flexbox;
	display: flex;
	align-items: center;
	position: absolute;
	border-radius: 25px;
	bottom: 0;
	left: 0;
	width: 100%;
	height: 100%;
	padding-left: 23px;
	padding-bottom: 5px;
	pointer-events: none;
	-webkit-transition: all 0.4s;
	-o-transition: all 0.4s;
	-moz-transition: all 0.4s;
	transition: all 0.4s
}

::-webkit-input-placeholder {
	opacity: 1;
	-webkit-transition: opacity .5s;
	transition: opacity .5s
}

:-moz-placeholder {
	opacity: 1;
	-moz-transition: opacity .5s;
	transition: opacity .5s
}

::-moz-placeholder {
	opacity: 1;
	-moz-transition: opacity .5s;
	transition: opacity .5s
}

:-ms-input-placeholder {
	opacity: 1;
	-ms-transition: opacity .5s;
	transition: opacity .5s
}

::placeholder {
	opacity: 1;
	transition: opacity .5s
}

*:focus::-webkit-input-placeholder {
	opacity: 0
}

*:focus:-moz-placeholder {
	opacity: 0
}

*:focus::-moz-placeholder {
	opacity: 0
}

*:focus:-ms-input-placeholder {
	opacity: 0
}

*:focus::placeholder {
	opacity: 0
}

.lnr {
	speak: none;
	font-style: normal;
	font-weight: 400;
	font-variant: normal;
	text-transform: none;
	line-height: 1;
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale
}

.flex-sb-m {
	display: -webkit-box;
	display: -webkit-flex;
	display: -moz-box;
	display: -ms-flexbox;
	display: flex;
	justify-content: space-between;
	-ms-align-items: center;
	align-items: center
}

.w-full {
	width: 100%
}

.p-b-30 {
	padding-bottom: 30px
}

.input-checkbox100:checked+.label-checkbox100::before {
	color: #09569B
}

.label-checkbox100::before {
	content: "\f00c";
	font-family: FontAwesome;
	font-size: 13px;
	color: transparent;
	display: -webkit-box;
	display: -webkit-flex;
	display: -moz-box;
	display: -ms-flexbox;
	display: flex;
	justify-content: center;
	align-items: center;
	position: absolute;
	width: 18px;
	height: 18px;
	border-radius: 2px;
	background: #fff;
	border: 1px solid #e6e6e6;
	left: 0;
	top: 50%;
	-webkit-transform: translateY(-50%);
	-moz-transform: translateY(-50%);
	-ms-transform: translateY(-50%);
	-o-transform: translateY(-50%);
	transform: translateY(-50%)
}

.label-checkbox100 {
	font-size: 14px;
	font-weight: normal;
	color: #999999;
	line-height: 1.2;
	display: block;
	position: relative;
	padding-left: 26px;
	cursor: pointer
}

.m-b-16 {
	margin-bottom: 16px
}

.p-b-55 {
	padding-bottom: 55px
}

.container-login100-form-btn {
	width: 100%;
	display: -webkit-box;
	display: -webkit-flex;
	display: -moz-box;
	display: -ms-flexbox;
	display: flex;
	flex-wrap: wrap;
	justify-content: center
}

.login100-form-btn:hover {
	background: #333333
}

.label-checkbox100::before {
	content: "\f00c";
	font-family: FontAwesome;
	font-size: 13px;
	color: transparent;
	display: -webkit-box;
	display: -webkit-flex;
	display: -moz-box;
	display: -ms-flexbox;
	display: flex;
	justify-content: center;
	align-items: center;
	position: absolute;
	width: 18px;
	height: 18px;
	border-radius: 3px;
	background: #fff;
	border: 2px solid #09569B;
	left: 0;
	top: 48%;
	-webkit-transform: translateY(-50%);
	-moz-transform: translateY(-50%);
	-ms-transform: translateY(-50%);
	-o-transform: translateY(-50%);
	transform: translateY(-50%)
}

#login button:hover {
	cursor: pointer
}

.login100-form-btn {
	font-size: 16px;
	line-height: 1.5;
	color: #fff;
	text-transform: uppercase;
	width: 100%;
	height: 45px;
	border-radius: 3px;
	background: #09569B;
	display: -webkit-box;
	display: -webkit-flex;
	display: -moz-box;
	display: -ms-flexbox;
	display: flex;
	justify-content: center;
	align-items: center;
	padding: 0 25px;
	-webkit-transition: all 0.4s;
	-o-transition: all 0.4s;
	-moz-transition: all 0.4s;
	transition: all 0.4s
}

#login button {
	outline: none !important;
	border: none
}

@media ( max-width : 768px) {
	.container {
		width: 750px
	}
	#login .wrap-login100 {
		padding: 27px
	}
	.login_topimg .logo_wrap {
		padding: 5px 55px
	}
}


</style>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css"></script>
</head>

<body style="background-color: #DCDCDC;">

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
	


	<%-- 	<section class="vh-100">
		<div class="container-fluid h-custom">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-md-9 col-lg-6 col-xl-5">
					<img
						src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
						class="img-fluid" alt="Sample image">
				</div>
				<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
					<form action="admin" method="post">
						<div
							class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start">
							<p class="lead fw-normal mb-0 me-3"
								style="font-size: xx-large; font-style: italic; font-weight: bolder;">Admin
								Login</p>

						</div>
						<!-- Email input -->
						<div class="form-outline mb-4">
							<label class="form-label" for="form3Example3"
								style="font-size: large; font-style: normal; font-weight: normal;">Admin
								Name </label> <input type="text" id="form3Example3" name="name"
								class="form-control form-control-lg" placeholder="Enter Name"
								required />
						</div>

						<!-- Password input -->
						<div class="form-outline mb-3">
							<label class="form-label" for="form3Example4"
								style="font-size: large; font-style: normal; font-weight: normal;">Password</label>
							<input type="password" id="form3Example4" name="password"
								class="form-control form-control-lg"
								placeholder="Enter password" required />
						</div>
						<div class="form-outline mb-2">
							<label class="form-label" for="form3Example4"
								style="font-size: large; font-style: normal; font-weight: normal;">Mall
								Name</label> <select name="mallName">
								<option selected>Choose...</option>
								<option value="LU LU">LU LU</option>
								<option value="Orion">Orion</option>
								<option value="Vega City">Vega City</option>
								<option value="Mantri">Mantri</option>
								<option value="Central">Central</option>
								<option value="Urban Oasis">Urban Oasis</option>
							</select>

						</div>

						<div class="d-flex justify-content-between align-items-center">
							<!-- Checkbox -->
							<div class="form-check mb-0">
								<input class="form-check-input me-2" type="checkbox" value=""
									id="form2Example3" /> <label class="form-check-label"
									for="form2Example3"> Remember me </label>
							</div>
							<a href="ResetPassword.jsp" class="text-body">Forgot
								password?</a>
						</div>

						<div class="text-center text-lg-start mt-4 pt-2">
							<button type="submit" class="btn btn-primary btn-lg"
								style="padding-left: 2.5rem; padding-right: 2.5rem;">Login</button>

						</div>
						<div>
							<p class="lead fw-normal mb-0 me-3"
								style="text-align: center; color: green; font-size: large; font-weight: bold;">${msg}</p>
							<p class="lead fw-normal mb-0 me-3"
								style="text-align: center; color: red; font-size: large; font-weight: bold;">${error}</p>
							<p class="lead fw-normal mb-0 me-3"
								style="text-align: center; color: red; font-size: large; font-weight: bold;">${error1}</p>
							<p class="lead fw-normal mb-0 me-3"
								style="text-align: center; color: green; font-size: large; font-weight: bold;">${msg1}</p>
						</div>

					</form>
				</div>
			</div>
		</div> --%>
	<!-- <div
			class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-primary">
			Copyright
			<div class="text-white mb-3 mb-md-0">Copyright © 2020. All
				rights reserved.</div>
			Copyright

			Right
			<div>
				<a href="#!" class="text-white me-4"> <i
					class="fab fa-facebook-f"></i>
				</a> <a href="#!" class="text-white me-4"> <i class="fab fa-twitter"></i>
				</a> <a href="#!" class="text-white me-4"> <i class="fab fa-google"></i>
				</a> <a href="#!" class="text-white"> <i class="fab fa-linkedin-in"></i>
				</a>
			</div>
			Right
		</div> -->

	<!-- </section> -->
	<div class="limiter" id="login">
		<div class="container-login100"
			style="background-image: url(https://image.freepik.com/free-photo/happy-woman-doing-online-shopping-home_329181-4301.jpg)">
			<div class="container">
				<div class="row">
					<div class="col-md-6"></div>
					<div class="col-md-5 col-md-offset-1">
						<div class="login_topimg"></div>
						<div class="wrap-login100">
							<form class="login100-form validate-form" action="admin"
								method="post">
								<span class="login100-form-title "> Login </span> <span
									class="login100-form-subtitle m-b-16"> to your account </span>
								<div class="wrap-input100 validate-input m-b-16"
									data-validate="Valid email is required: ex@abc.xyz">
									<input class="input100" type="text" name="name"
										placeholder="Name"> <span class="focus-input100"></span>
									<span class="symbol-input100"> <span
										class="glyphicon glyphicon-user"></span>
									</span>
								</div>
								<div class="wrap-input100 validate-input m-b-16"
									data-validate="Password is required">
									<input class="input100" type="password" name="password"
										placeholder="Password"> <span class="focus-input100"></span>
									<span class="symbol-input100"> <span
										class="glyphicon glyphicon-lock"></span>
									</span>
								</div>
								<div class="form-outline mb-2">
									<label class="form-label" for="form3Example4"
										style="font-size: large; font-style: normal; font-weight: normal;">Mall
										Name</label> <select name="mallName">
										<option selected>Choose...</option>
										<option value="LU LU">LU LU</option>
										<option value="Orion">Orion</option>
										<option value="Vega City">Vega City</option>
										<option value="Mantri">Mantri</option>
										<option value="Central">Central</option>
										<option value="Urban Oasis">Urban Oasis</option>
									</select>

								</div>
								<div class="flex-sb-m w-full p-b-30">
									<div class="contact100-form-checkbox">
										<input class="input-checkbox100" id="ckb1" type="checkbox"
											name="remember-me"> <label class="label-checkbox100"
											for="ckb1"> Remember me </label>
									</div>
									<div>
										<a href="ResetPassword.jsp" class="txt1"> Forgot Password?
										</a>
									</div>
								</div>
								<div class="container-login100-form-btn p-t-25">
									<button class="login100-form-btn">Login</button>
								</div>
								<div>
							<p class="lead fw-normal mb-0 me-3"
								style="text-align: center; color: green; font-size: large; font-weight: bold;">${msg}</p>
							<p class="lead fw-normal mb-0 me-3"
								style="text-align: center; color: red; font-size: large; font-weight: bold;">${error}</p>
							<p class="lead fw-normal mb-0 me-3"
								style="text-align: center; color: red; font-size: large; font-weight: bold;">${error1}</p>
							<p class="lead fw-normal mb-0 me-3"
								style="text-align: center; color: green; font-size: large; font-weight: bold;">${msg1}</p>
						</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>



	<!--  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>  -->

</body>
</html>