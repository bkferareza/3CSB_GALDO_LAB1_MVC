<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<title>Welcome to YOUniversity Store</title>
</head>
<body>
<form action="StoreServlet" method="post">
	<pre>
		Item:		  <input type="text" name="item" required="required" /><br>
		Quantity:	  <input type="number" name="quantity" required="required" /><br>
		Item Price: 	  <input type="number" name="price" required="required" /><br>
		Credit Card text: <input type="number" name="creditCard" required="required" /><br>
		<input type="submit" value="Confirm" /> &nbsp; <input type="reset" value="Clear" /> 	
	</pre>
</form>
</body>
</html>