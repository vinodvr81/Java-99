<h2>
<%
 String user = request.getParameter("txt_uid");
 pageContext.setAttribute("user", user, PageContext.SESSION_SCOPE);
 out.println("Welcome " + user);
%>
</h2>
<br><br>
<a href="pagecontext2.jsp">Next Page</a>