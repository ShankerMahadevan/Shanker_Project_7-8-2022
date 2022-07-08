<%@page import="bookstore.AddBookDao"%>
<%@page import="bookstore.AddBook"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Users</title>  
</head>  
<body>  
  
<%@page import="bookstore.AddBookDao,bookstore.AddBook,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<h1>Users List</h1>  
  
<%  
List<AddBook> list=AddBookDao.getAllRecords();  
request.setAttribute("list",list);  
%>  
  
<table border="1" width="90%">  
<tr><th>Bookid</th><th>BookCode</th><th>BookName</th><th>AuthorFirstName</th>  
<th>AuthorLastNAme</th><th>PublisherName</th><th>BookCategory</th><th>BookType</th><th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${list}" var="book">  
<tr><td>${book.getBookid()}</td><td>${book.grtBookCode()}</td><td>${book.getPassword()}</td>  
<td>${book.getEmail()}</td><td>${book.getSex()}</td><td>${book.getCountry()}</td>  
<td><a href="editform.jsp?id=${book.getId()}">Edit</a></td>  
<td><a href="deletebook.jsp?id=${book.getId()}">Delete</a></td></tr>  
</c:forEach>  
</table>  
<br/><a href="adduserform.jsp">Add New User</a>  
  
</body>  
</html>