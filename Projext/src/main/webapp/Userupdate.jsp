<%@ page import = "java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String updateId = request.getParameter("updateid");
if(updateId != null){
	try {
		//step 1 : Create the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2 : Create a connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
		//step 3 : Preparing the queries
		PreparedStatement statement = connection.prepareStatement("select * from user2 where id=?");
		statement.setInt(1,Integer.parseInt(updateId));
		//step 4 : Executing the queries
		ResultSet set = statement.executeQuery();
		
		%>
		<form action="update" method="post">
		<table>
			<tr>
				 <th> Name </th>
  <th> ID </th>
  <th> Location </th>
  <th> Phone Number </th>
  <th colspan="2"> Actions </th>
			</tr>
			<tr>
			<% while(set.next()) { %>
			<td>
					<input type="text" name="Id" value="<%= set.getString("id") %>" readonly/>
				</td>
				<td>
					<input type="text" name="Name" value="<%= set.getString("name") %>"/>
				</td>
				<td>
					<input type="text" name="Location" value="<%= set.getString("locate") %>"/>
				</td>
				<td>
				<input type="number" name="Phone" value="<%= set.getLong("num") %>"/>
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