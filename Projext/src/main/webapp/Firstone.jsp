<%@ page import = "java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h1{
		display:flex;
		justify-content:center;
	}
   table {
      border: 2px solid black;
      border-collapse: collapse;
      width: 100%;
      
    }
    th, td {
      border: 2px solid black;
      padding: 10px;
      text-align: center;
      font-size: 20px;
    }
    .btnn{
      background-color: red;
      padding: 6px;
      text-align: center;
      cursor:pointer;
    }
    .btn{
      background-color: yellow;
      padding: 6px;
      text-align: center;
      cursor:pointer;
    }
    .onetwo{
    padding: 0px 0px 25px 0px;
    }
</style>
</head>
<body>
<h1>( CRUD Operation )</h1>
<p><% System.out.println(" Hii "); %></p>
<!-- form action="/submit-form" method="post" enctype="multipart/form-data" target="_self" autocomplete="on" novalidate>
    
    <!-- Text Input -
    <label for="fname">First Name:</label>
    <input type="text" id="fname" name="first_name" placeholder="Enter your name" required><br><br>


    <!-- Email -
    <label for="email">Email:</label>
    <input type="email" id="email" name="email"><br><br>
    
    <label for="mobile">Mobile Number:</label><br>
  <input type="tel" id="mobile" name="mobile" placeholder="Enter mobile number" pattern="[0-9]{10}" required>

    <!-- Number -
    <label for="age">Age:</label>
    <input type="number" id="age" name="age" min="1" max="100"><br><br>
    
<br><br>

    <!-- Buttons -
    <input type="submit" value="Submit">
    <input type="reset" value="Reset">
    <button type="button" onclick="alert('Button clicked!')">Click Me</button>

  </form> -->


<% 
try {
  //step 1 : Create the driver
  Class.forName("com.mysql.cj.jdbc.Driver");
  
  //step 2 : Create a connection
  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
  
  //step 3 : Preparing the queries
  PreparedStatement statement = connection.prepareStatement("select * from user2");
  
  ResultSet set = statement.executeQuery();
  
  // this is to show the data in webpage , delete data and input data
  %>
  
  <form action="Userinput" method="post" class="onetwo">
<label> Enter Your Name </label> 
<input name="inputname" placeholder=" Enter Your Name "/>
<label> Enter Your Address </label>
<input name="Address" placeholder=" Enter Your Address "/>
<label> Enter Your Phone Number </label>
<input name="Number" placeholder=" Enter Your Phone Number "/>
<!-- <input name="Email" placeholder=" Enter Your Email "/> -->
<button type="submit" onclick="alert('Data Inserting And Database Updating In Process')"> Submit </button>
</form>
  
  <table border="1">
  <tr>
  <th> ID </th>
  <th> Name </th>
  <th> Location </th>
  <th> Phone Number </th>
  <th colspan="2"> Actions </th>
  </tr>
  <%
  //step 4 : Executing the queries
  while(set.next()){
    %>
    <tr>
    <td><%=set.getInt("id")%></td>
      <td><%=set.getString("name")%></td>
      <td><%=set.getString("locate")%></td>
      <td><%=set.getLong("num")%></td>
      <td>
      <form action="firstone" method="POST">
      <button class="btnn" type="submit" name="deleteid" value="<%=set.getString("id")%>" onclick="alert('Deleting Process')"> Delete </button>
      </form>
      </td>
      <td>
      <a href="Userupdate.jsp?updateid=<%=set.getInt("id")%>"><button class="btn" type="submit" name="updateid" value="<%=set.getString("id")%>" onclick="alert('Updating Process')"> Update </button></a>
      </td>
    </tr>
    <%
  } %>
  </table>
  <%
  //step 5 : closing the connection
  connection.close();
  
}catch(Exception e) {
  e.printStackTrace();
}

 %>
</body>
</html>