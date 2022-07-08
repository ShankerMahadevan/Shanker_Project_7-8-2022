<%@page import="bookstore.AddBookDao"%>
<%@page import="bookstore.AddBookDao"%>  
<jsp:useBean id="book" class="bookstore.AddBook"></jsp:useBean>  
<jsp:setProperty property="*" name="book"/>  
  
<%  
int i=AddBookDao.save(book);  
if(i>0){  
response.sendRedirect("addusersucess.jsp");  
}else{  
response.sendRedirect("addbookeror.jsp");  
}  
%>