<%!
 String uid,pwd;
%>
<h2>
<%
 uid = request.getParameter("txtUid");
 pwd = request.getParameter("txtPwd"); 
%>
User Name = <%=uid %> <br>
Password = <%=pwd %>
<hr>
Server Name : <%=request.getServerName() %> <br>
Server Port : <%=request.getServerPort() %> <br>
Protocol : <%=request.getProtocol() %> <br>
Method : <%=request.getMethod() %> <br>
Content Type : <%=request.getContentType() %><br>
Content Size : <%=request.getContentLength() %><br>
</h2>