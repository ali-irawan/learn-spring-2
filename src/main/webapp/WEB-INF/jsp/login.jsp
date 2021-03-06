<!doctype html>
<html>
	<head>
		<title>Spring Web - Login</title>
		
		<!-- Bootstrap -->
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
		
	    <style>
	    	.container {
	    		margin-top: 40px;
	    	}
	    </style>
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<h2>Login Page</h2>
				
					<form method="post">
						<div class="form-group">	
							<label>Username</label>
							<input type="text" name="username" class="form-control" />
						</div>
						<div class="form-group">	
							<label>Password</label>
							<input type="password" name="password" class="form-control" />
						</div>
						<input type="submit" value="Login" class="btn btn-primary" />
					</form>
				</div>
			</div>
		</div>
		
		<!-- Bootstrap -->
		<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

	</body>
</html>