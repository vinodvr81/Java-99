<%@page import="java.util.Date" info="page directive in JSP" language="java" %>

<%!
  Date today;
%>
<h2 style="text-align:center">
<%
 today = new Date();
 out.println(today);
%>
</h2>
<h2>
<%=getServletInfo() %>
</h2>