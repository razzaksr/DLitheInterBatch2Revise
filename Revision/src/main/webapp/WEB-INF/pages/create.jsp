<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addinng new resource</title>
</head>
<body>
${msg }
<form action="added" method="post">
<table>
<tr><td><input type="text" name="name" placeholder="Enter the resource name"></td></tr>
<tr><td><input type="text" name="lapModel" placeholder="Enter the resource Laptop Model"></td></tr>
<tr><td><input type="text" name="cost" placeholder="Enter the resource cost"></td></tr>
<tr><td><input type="submit" value="Add"></td><td><input type="reset" value="clear"></td></tr>
</table>
</form>
</body>
</html>