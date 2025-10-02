<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

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

</style>
</head>
<body>

<%
String updateId = request.getParameter("updateId");
if(updateId != null){
	try {
		//step 1 : Create the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2 : Create a connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
		//step 3 : Preparing the queries
		PreparedStatement statement = connection.prepareStatement("select * from userData where id=?");
		statement.setInt(1,Integer.parseInt(updateId));
		//step 4 : Executing the queries
		ResultSet set = statement.executeQuery();
		
		%>
		<form action="update" method="post">
		<table>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Location</th>
				<th>Phone</th>
				<th>Action</th>
			</tr>
			<tr>
			<% while(set.next()) { %>
				<td>
					<input type="text" name="updateId" value="<%= set.getString("id") %>" disabled="disabled"/>
				</td>
				<td>
					<input type="text" name="updateName" value="<%= set.getString("name") %>"/>
				</td>
				<td>
					<input type="email" name="updateEmail" value="<%= set.getString("email") %>"/>
				</td>
				<td>
					<input type="text" name="updateLocation" value="<%= set.getString("location") %>"/>
				</td>
				<td>
				<input type="number" name="updatePhone" value="<%= set.getLong("phone") %>"/>
				</td>
				<td><button type="submit">Update</button></td>
			</tr>
			<% } %>
			</table>
		</form>
		
		<%
		connection.close();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}

%>

</body>
</html>