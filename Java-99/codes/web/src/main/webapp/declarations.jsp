<%!
  String companyName = "edureka limited"; //instance variable
  
  public int add(int x, int y){
	  return x + y;
  }
%>
<h2>
<%
 out.println("Company Name = " + companyName + "<br><br>");
 int x = 12; //local variable 
 int y = 23; //local variable
 out.println(x + " + " + y + " = " + add(x, y));
%>
</h2>