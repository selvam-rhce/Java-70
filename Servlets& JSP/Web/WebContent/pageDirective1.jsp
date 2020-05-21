<%@page import="java.util.Date" %>
<%!
 Date today = null;
%>
<h2 align=center>
<%
 today = new Date();
 out.print(today);
%>
</h2>