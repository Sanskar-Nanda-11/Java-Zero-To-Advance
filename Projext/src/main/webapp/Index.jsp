<%@ page import = "java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
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
</style>
</head>
<body>
<h1>Hello</h1>
<h3>Showing User Data , At Ther Time Of Add , Update , Delete </h3>
<%! int a = 10; int b = 26; %>
<h2 style="color : #3FA2E4"><%= a+b %></h2>
<p><% System.out.println(" Hii "); %></p>
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
  <table border="1">
  <tr>
  <th> Name </th>
  <th> ID </th>
  <th> Location </th>
  <th> Phone Number </th>
  <th colspan="2"> Actions </th>
  </tr>
  <%
  //step 4 : Executing the queries
  while(set.next()){
    %>
    <tr>
      <td><%=set.getString("name")%></td>
      <td><%=set.getString("id")%></td>
      <td><%=set.getString("locate")%></td>
      <td><%=set.getLong("num")%></td>
      <td>
      <form action="delete" method="post">
      <button class="btnn" type="button" name="delete_data" value="<%=set.getString("id")%>"> Delete</button>
      </form>
      </td>
      <td>
      <form action="update" method="post">
      <button class="btn" type="button" name="update_data" value="<%=set.getString("id")%>"> Update </button>
      </form>
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