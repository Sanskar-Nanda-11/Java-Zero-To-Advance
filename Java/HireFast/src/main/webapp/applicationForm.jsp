<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Application Form</title>
<style>
  body {
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background: #f8f9fa;
    display: flex;
    justify-content: center;
    padding: 40px 20px;
  }
  form {
    background: white;
    padding: 30px 40px;
    border-radius: 8px;
    box-shadow: 0 4px 14px rgb(0 0 0 / 0.1);
    width: 420px;
  }
  label {
    display: block;
    margin: 15px 0 6px;
    font-weight: 600;
    color: #34495e;
  }
  input[type="text"], input[type="email"], input[type="number"] {
    width: 100%;
    padding: 10px 12px;
    border-radius: 5px;
    border: 1.5px solid #ccc;
    font-size: 15px;
    box-sizing: border-box;
  }
  input[readonly] {
    background: #e9ecef;
  }
  button {
    margin-top: 25px;
    padding: 12px 18px;
    background-color: #2980b9;
    color: white;
    border: none;
    border-radius: 6px;
    font-size: 16px;
    cursor: pointer;
    width: 100%;
  }
  button:hover {
    background-color: #1c5980;
  }
</style>
</head>
<body>
<%
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast","root","root");
		PreparedStatement statement = connection.prepareStatement("select * from user_profile where userId=?");
		int userId = (int) session.getAttribute("userId");
		int jobId = Integer.parseInt(request.getParameter("jobId"));
		statement.setInt(1,userId);
		ResultSet set = statement.executeQuery();
		while(set.next()) { %>
			<form action="applyJob" method="post">
			<h1 style="text-align:center">Application Form</h1>
				<label>Name :</label>
				<input type="text" name="name" value="<%= set.getString("name") %>" required />
				
				<label>Email :</label>
				<input type="email" name="email" value="<%= set.getString("email") %>" readonly />
				
				<label>Phone :</label>
				<input type="text" name="phone" value="<%= set.getLong("phone") %>" required />
				
				<label>Location :</label>
				<input type="text" name="location" value="<%= set.getString("location") %>" required />
				
				<label>Education :</label>
				<input type="text" name="education" value="<%= set.getString("education") %>" required />
				
				<label>Message :</label>
				<input type="text" name="message" placeholder="Write a message or cover letter" />
				
				<label>Experience :</label>
				<input type="number" name="experience" value="<%= set.getInt("experience") %>" min="0" required />
				
				<input type="hidden" name="userId" value="<%= userId %>" />
				<input type="hidden" name="jobId" value="<%= jobId %>" />
				
				<button type="submit">Send Application</button>
			</form>
	<% }
		connection.close();
	} catch(Exception e) {
		e.printStackTrace();
	}
%>
</body>
</html>
