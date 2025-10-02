<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
background-color:#ECFAE5;
}
table{
	border-collapse : collapse;
	width:100%;
}

th,td{
	margin:0px;
	border:1px solid black;
	padding:20px 0px;
	text-align: center;
}

button{
	color:white;
	border:none;
	border-radius:5px;
	padding:15px;
	background-color: blue;
}
button:hover{
	cursor:pointer;
	background-color:darkblue;
}
.delete-button{
	background-color:red;
}
.delete-button:hover{
	cursor:pointer;
	background-color:#8b0000;
}
input{
	height:40px;
	width:240px;
	font-size:20px;
	margin-right:20px;
}
</style>
</head>
<body>
<form action="userData" method="post">
	<h2 style="text-align:center;	">Insert data here:</h2>
	<div style="display:flex;align-items:center;justify-content:center;">
	<input type="text" name="inputName" placeholder="Enter the name"/>
	<input type="email" name="inputEmail" pla	ceholder="Enter the email"/>
	<input type="text" name="inputLocation" placeholder="Enter the location"/>
	<input type="number" name="inputPhone" placeholder="Enter the phone number"/>
	<button type="submit" class="submit-button">Submit</button>
	</div>
</form>
<br/>
<h1 style="text-align:center;">User data table</h1>
<%

try {
	//step 1 : Create the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//step 2 : Create a connection
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
	//step 3 : Preparing the queries
	PreparedStatement statement = connection.prepareStatement("select * from userData");
	
	//step 4 : Executing the queries
	ResultSet set = statement.executeQuery();
	
	%>
	<table>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Email</th>
		<th>Location</th>
		<th>Phone</th>
		<th colspan=2>Action</th>
	</tr>
	<% while(set.next()) { %>
		<tr>
		<td><%= set.getInt("id") %></td>
		<td><%= set.getString("name") %></td>
		<td><%= set.getString("email") %></td>
		<td><%= set.getString("location") %></td>
		<td><%= set.getLong("phone") %></td>
		<td>
			<a href="update.jsp?updateId=<%= set.getInt("id") %>">
				<button>Update</button>
			</a>
		</td>
		<td>
			<form action="delete" method="post">
				<button class="delete-button" type="submit" name="getId" value="<%= set.getInt("id") %>">Delete</button>
			</form>
		</td>
		</tr>
		<% } %>

	</table>
	
	<%
	connection.close();
	
}catch(Exception e) {
	e.printStackTrace();
}

%>
</body>
</html>