<h2>
<%
 String uid = request.getParameter("txtUid");
 pageContext.setAttribute("name",uid,PageContext.SESSION_SCOPE);
 out.println("Hello, "+ uid);
%>
</h2>
<a href="pagecontext2.jsp">Next Page</a>