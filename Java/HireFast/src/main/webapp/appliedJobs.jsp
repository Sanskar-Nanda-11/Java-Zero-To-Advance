<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Applied Jobs</title>
<style>
  body {
    font-family: Arial, sans-serif;
    padding: 20px;
  }
  h1 {
    color: #2c3e50;
  }
  table {
    border-collapse: collapse;
    width: 100%;
    margin-top: 20px;
  }
  th, td {
    border: 1px solid #aaa;
    padding: 10px 12px;
    text-align: left;
  }
  th {
    background-color: #2980b9;
    color: white;
  }
  tr:nth-child(even) {
    background-color: #f2f6fa;
  }
  .no-data {
    margin-top: 20px;
    font-style: italic;
    color: #666;
  }
</style>
</head>
<body>
	<h1>Applied Jobs</h1>
	<%
	boolean hasResults = false;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast","root","root");
		PreparedStatement statement = connection.prepareStatement(
			"select job.title, job.job_description, job.role, job.salary, job.orgName " +
			"from all_jobs as job " +
			"join applications as app on job.jobId = app.jobId " +
			"where app.userId = ?;"
		);
		statement.setInt(1, (int) session.getAttribute("userId"));
		ResultSet set = statement.executeQuery();
		
		if (set.isBeforeFirst()) {  // checks if ResultSet is not empty
			hasResults = true;
	%>
	<table>
		<tr>
			<th>Organization Name</th>
			<th>Title</th>
			<th>Job Description</th>
			<th>Role</th>
			<th>Salary</th>
		</tr>
		<%
		while(set.next()) { %>
			<tr>
				<td><%= set.getString("orgName") %></td>
				<td><%= set.getString("title") %></td>
				<td><%= set.getString("job_description") %></td>
				<td><%= set.getString("role") %></td>
				<td><%= set.getInt("salary") %></td>
			</tr>
		<%
		}
	%>
	</table>
	<%
		} 
		connection.close();
	} catch(Exception e) {
		e.printStackTrace();
	}
	
	if (!hasResults) { %>
		<p class="no-data">You have not applied for any jobs yet.</p>
	<% } %>
</body>
</html>
