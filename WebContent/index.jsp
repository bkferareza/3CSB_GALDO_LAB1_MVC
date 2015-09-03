<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<title>Welcome to YOUniversity Store</title>
</head>
<body style="padding-top:16vh;">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<div class="container">
	   <div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="well well-lg">
					<form action="StoreServlet" method="post">	
					<h3>Payment</h3>
					<hr/>
							<div class="form-group">
										<input type="text" name="item" required="required" placeholder="Item" class="form-control"/>
							</div>
							<div class="form-group">
										<input type="number" name="quantity" required="required" placeholder="Quantity" class="form-control" />
							</div>
							<div class="form-group">
										<input type="number" name="price" required="required" placeholder="Item Price" class="form-control" />
							</div>
							<div class="form-group">
										<input type="number" name="creditCard" required="required" placeholder="Credit Card" class="form-control" /> 
									
							</div>
							<div class="btn-group">
								<input type="submit" value="Confirm" class="btn btn-primary"/> 
								<input type="reset" value="Clear" class="btn btn-danger" /> 
							</div>	

				</form>
				</div>
			</div>
	   </div>
	</div>
    
        
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
