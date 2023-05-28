<%!
 String user;
 String pass;
%>
<h2>
<%
 user = request.getParameter("txt_uid");
 pass = request.getParameter("txt_pwd");
 
 out.println("user name = " + user + "<br>");
 out.println("password = " + pass);
%>
</h2>
<hr>
<h2>
Server Name = <%=request.getServerName() %> <br>
Server Port = <%=request.getServerPort() %> <br>
Protocol = <%=request.getProtocol() %> <br>
Method = <%=request.getMethod() %> <br>
Content Type = <%=request.getContentType() %> <br>
Content Length = <%=request.getContentLength() %>
</h2>