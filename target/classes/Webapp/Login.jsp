<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<head>
<title>SpringApp</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link type="text/css" rel="stylesheet" href="css/materialize.min.css"
	media="screen,projection" />
<link type="text/css" rel="stylesheet" href="css/styles.css" />
<link rel="stylesheet" href="css/animate.css">
<script type="text/javascript" src="js/sweetalert.min.js"></script>
<script type='text/javascript' src='js/jquery-3.2.1.js'></script>
<script type='text/javascript' src='js/myscript.js'></script>
<script>
			$("document").ready(function(){
				$("button#submit").click(function() {
					if($("#username").val() == ""  || $("#password").val() == "")
						$("div#ack").html("Enter username and password");
					else{
						var user = $("#username").val();
						var pass = $("#password").val();
						var reg = "e";
						$.post("login",{
								username: user,
								password: pass,
								reg:reg
								},
								<!-- $("#myForm :input").serializeArray().done(), -->
								function(data){
									$("div#ack").html(data);
									if(data == "login success")
									alert(data);
										window.location.href = "Login.jsp";
								});
					$("#myForm").submit(function() {
						return false;
					});
					}
				});
				
				$("button#register").click(function() {
					if($("#rusername").val() == ""  || $("#rpassword").val() == "")
						$("div#ack").html("Enter username and password");
					else{
						var user = $("#rusername").val();
						var pass = $("#rpassword").val();
						var fname = $("#fname").val();
						var lname = $("#lname").val();
						var mob = $("#mob").val();
						var reg = "r";
						$.post("login.jsp",{
								rusername: user,
								rpassword: pass,
								fname : fname,
								lname : lname,
								mob : mob,
								reg:reg
								},
								<!-- $("#myForm :input").serializeArray().done(), -->
								function(data){
									if(data == "already exist"){
										alert("User already exist try different username")
										$("#rusername").html("");
										$("#rpassword").html("");
										$("#rcpassword").html("");}
										if(data == "register"){
											alert("Registered successfull !!");
											window.location.href = "Login_Form.html";
										}
								});
					$("#myFormReg").submit(function() {
						return false;
					});
					}
				});
				
			});
		</script>
</head>
<body>

	<h1 class="center">SpringApp</h1>
	<div class="container">
		<ul id="tabs-swipe-demo" class="tabs center ">
			<li class="tab col s3 black-text "><a href="#test-swipe-1">Sign
					Up</a></li>
			<li class="tab col s3 black-text"><a class="active"
				href="#test-swipe-2">Login</a></li>

		</ul>
		<div id="test-swipe-1" class="col s12 gray">
			<div class="row">
				<form method='POST' action='registerAction' id='myFormReg'>
					<div class="col s12 offset-m2 m7">
						<div class="card-panel hoverable">
							<span class="black-text">First Name</span> <input
								class="input-field " type='text' name='fname' id='fname'></input>
							<span class="black-text">Last name</span> <input
								class="input-field " type='text' name='lname' id='lname'></input>
							<span class="black-text">Mobile Number</span> <input
								class="input-field " type='text' name='mob' id='mob'></input> <span
								class="black-text">Create Username</span> <input
								class="input-field " type='text' name='rusername' id='rusername'></input>
							<span class="black-text">Enter Password </span> <input
								class="input-field" type='password' name='rpassword'
								id='rpassword'></input> <span class="black-text">Re-enter
								Password </span> <input class="input-field" type='password'
								name='rcpassword' id='rcpassword'></input>
							<button class="waves-effect waves-light btn-large hoverable"
								id='register'>Login</button>
						</div>
					</div>
				</form>
				<div id='ackreg'></div>
			</div>
		</div>
	</div>
	<div id="test-swipe-2" class="col s12 gray">
		<div class="row">
			<form method='POST' action='LoginAction' id='myForm'>
				<div class="col s12 offset-m3 m6">
					<div class="card-panel hoverable">
						<span class="black-text">Username</span> <input
							class="input-field " type='text' name='username' id='username'></input>
						<span class="black-text">Password </span> <input
							class="input-field" type='password' name='password' id='password'></input>
						<button class="waves-effect waves-light btn-large hoverable"
							id='submit'>Login</button>
					</div>
				</div>
			</form>
			<div id='ack'></div>
		</div>
	</div>

	<div id='ack'></div>
	<script type="text/javascript" src="js/materialize.min.js"></script>
</body>
</html>