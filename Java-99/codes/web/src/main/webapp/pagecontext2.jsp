<h2>
<%
 //String user = request.getParameter("txt_uid");
 String user = pageContext.getAttribute("user", PageContext.SESSION_SCOPE).toString();
 out.println("Welcome " + user);
%>
</h2>