<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>Book Code:</td>
			<td><input type="text" name="name" /></td>
		</tr>
		<tr>
			<td>Book Name:</td>
			<td><input type="text" name="password" /></td>
		</tr>
		<tr>
			<td>Book Author:</td>
			<td><input type="text" name="email" /></td>
		</tr>
		<tr>
			<td>Book Publisher:</td>
			<td><input type="text" name="email" /></td>
		</tr>
		<tr>
			<td>Book Type:</td>
			<td><input type="radio" name="booktype" value="Free" />Free <input
				type="radio" name="booktype" value="Paid" />Paid</td>
		</tr>
		<tr>
			<td>Country:</td>
			<td><select name="country" style="width: 155px">
					<option></option>
					<option>Pakistan</option>
					<option>Afghanistan</option>
					<option>Berma</option>
					<option>Other</option>
			</select></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Add User" /></td>
		</tr>
	</table>
</body>
</html>