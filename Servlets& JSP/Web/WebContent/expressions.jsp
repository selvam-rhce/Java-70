<%!
 int x=10,y=20;
 public int addNum(int a, int b){
	 return a+b;
 }
%>
<h2>
Value of x = <%=x %>
<br>
<%="Sum = "+addNum(12,21) %>
</h2>