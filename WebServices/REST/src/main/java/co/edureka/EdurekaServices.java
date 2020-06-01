package co.edureka;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/edureka")
public class EdurekaServices {
  @GET
  @Produces("text/html")
  public String localService() {
	  return "<h2>To provide local customer service</h2>";
  }
  
  @GET
  @Produces("text/html")
  @Path("/nri")
  public String nriService() {
	  return "<h2>To provide NRI customer service</h2>";
  }
  
  @GET
  @Produces("application/json")  
  @Path("/empdetails/{eno}")
  public String getEmpDetails(@PathParam("eno") String eno) {
	  return "{\"empno\":"+eno+",\"name\":\"Sunil\",\"sal\":45000}";
  } 
  
  @GET
  @Produces("text/html")
  @Path("/courseDetails")
  public String getCourseDetails(@QueryParam("name") String name, @QueryParam("course") String crs) {
	  return "<h2>Customer Name: "+name+"<br><br>Course Details of : "+crs+"</h2>";
  }
  
  @POST
  @Produces("text/html")
  @Path("/create_account")
  public String createAccount(@FormParam("acno") String acno, @FormParam("name") String name, @FormParam("bal") String balance) {
	  String output = "<h2>";
	  output += "A/C No: "+acno+"<br><br>";
	  output += "Name: "+name+"<br><br>";
	  output += "Initial Deposit: "+balance+"<br><br>";
	  
	  return output;
  }
}
