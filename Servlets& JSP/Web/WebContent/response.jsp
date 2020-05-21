<%
 String uid = request.getParameter("txtUid");
 String pwd = request.getParameter("txtPwd");

 if(uid.equals("admin") && pwd.equals("123"))
	 response.sendRedirect("https://www.edureka.co");
 else{
	 response.sendError(response.SC_UNAUTHORIZED, "Invalid Username/ Password");
 }
%>