<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <jsp:useBean id="outStoreBean" type ="model.StoreBean" scope = "request"/>
<!DOCTYPE html>
<html>
<head>
<title>YOUniversity Store</title>
</head>
<body>
	<h1>Welcome to YOUniversity Store</h1>
	<h2>Here is your Receipt</h2>
	
	<hr/>
	<h2>Receipt of Youniversity Store</h2>
	<p>Your Item is : <b>${outStoreBean['item']}</b></p>
	<p>Quantity of your item : <b>${outStoreBean['quantity']} </b></p>
	<p>Price : <b>${outStoreBean['price']} </b></p>
	<p>Gross Amount : <b>${outStoreBean['grossAmount']} </b></p>
	<p>Total : <b>${outStoreBean['total']} </b></p>
	
	<hr/>
	<form action="index.jsp" action="post">
		<input type="submit" value=" << GO BACK >>">
	</form>
</body>
</html>