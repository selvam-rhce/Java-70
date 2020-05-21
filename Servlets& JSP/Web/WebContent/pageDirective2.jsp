<%@page errorPage="handler.jsp" %>
<%!
 int x=10,y=10,z=0;
 int[] n=new int[7];
%>
<h2>
<%
 z=x/y;
 out.println("Result = "+z+"<br>");
 out.println(n[10]);
%>
</h2>