<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap core CSS -->
<link href="<%=path%>/css/base/bootstrap/bootstrap3.3.7/bootstrap.css"
	rel="stylesheet">
<!-- Custom styles for this template -->
<link href="<%=path%>/css/platform/user/signin.css" rel="stylesheet">
<script type="text/javascript" src="/Ssm/js/base/jquery/jquery3.2.1/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/Ssm/js/platform/user/registry.js"></script>
</head>

<body>

	<div class="container">

		<div class="form-signin" >
			<h2 class="form-signin-heading">Please sign up</h2>
			<label for="inputUsername" class="sr-only">Username</label> <input
				type="text" id="name" class="form-control"
				placeholder="Username" required autofocus> <label
				for="inputEmail" class="sr-only">Email address</label> <input
				type="email" id="email" class="form-control"
				placeholder="Email address" required autofocus> <label
				for="inputPassword" class="sr-only">Password</label> <input
				type="password" id="password" class="form-control"
				placeholder="Password" required>
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">
					Remember me
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit" onclick="registryUser()">Sign
				up</button>
		</div>
		<br> <br> <br>
		<div class="form-signin">
			<a href="/Ssm/user/loginPage" class="btn btn-lg btn-primary btn-block">Sign
				in</a>
		</div>

	</div>
	<!-- /container -->


</body>
</html>