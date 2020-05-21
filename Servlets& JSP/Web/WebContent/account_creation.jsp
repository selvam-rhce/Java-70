<jsp:useBean class="co.edureka.Account" id="acc"></jsp:useBean>
<jsp:setProperty name="acc" property="*"/>
<h2>
A/C No : <jsp:getProperty property="acno" name="acc"/> <br>
Name : <jsp:getProperty property="name" name="acc"/> <br>
Balance : <jsp:getProperty property="bal" name="acc"/> <br>
<hr>
<jsp:setProperty name="acc" property="name" value="Sunil Joseph"/>
Name : <jsp:getProperty property="name" name="acc"/> <br>
</h2>
