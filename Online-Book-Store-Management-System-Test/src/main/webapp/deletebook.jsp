<%@page import="bookstore.AddBookDao"%>  
<jsp:useBean id="book" class=bookstore.AddBook"></jsp:useBean>  
<jsp:setProperty property="*" name="book"/>  
<%  
AddBookDao.delete(book);  
response.sendRedirect("viewbooks.jsp");  
%>  