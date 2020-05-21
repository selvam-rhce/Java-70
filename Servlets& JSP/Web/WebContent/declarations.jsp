<%!
 int x=10,y=20;
 public int addNum(int a, int b){
	 return a+b;
 }
%>
<h2>
<%
 out.println("Value of x = "+x+"<br>");
 int sum = addNum(11,34);
 out.println("Sum = "+ sum);
%>
</h2>