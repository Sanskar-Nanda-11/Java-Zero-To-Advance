<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>User Dashboard</title>
<style>
  body {
    margin: 0;
    padding: 40px 20px;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background-color: #f7f9fc;
    color: #2c3e50;
    display: flex;
    flex-direction: column;
    align-items: center;
    min-height: 100vh;
  }
  
  h1 {
    margin-bottom: 30px;
  }
  
  a {
    display: inline-block;
    margin: 10px 15px;
    padding: 12px 24px;
    background-color: #3498db;
    color: white;
    text-decoration: none;
    font-weight: 600;
    border-radius: 6px;
    box-shadow: 0 3px 6px rgba(52, 152, 219, 0.4);
    transition: background-color 0.3s ease, box-shadow 0.3s ease;
  }
  
  a:hover {
    background-color: #2980b9;
    box-shadow: 0 5px 12px rgba(41, 128, 185, 0.6);
  }
</style>
</head>
<body>
<h1>User Dashboard</h1>
<%
try {
    //step 1 : Create the driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    //step 2 : Create a connection
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast","root","root");

    //step 3 : Preparing the queries
    PreparedStatement statement = connection.prepareStatement("select * from user_profile where userId = ?;");
    statement.setInt(1, (int) session.getAttribute("userId"));
    //step 4 : Executing the queries
    ResultSet set = statement.executeQuery();

    if(set.next()){
%>
    <a href="applyJob.jsp">Explore Jobs</a>
    <a href="appliedJobs.jsp">Applied Jobs</a>
    <a href="userProfile.jsp">View Profile</a>
<%
    } else {
%>
    <a href="addProfile.jsp">Add Profile</a>
<%
    }

    connection.close();

}catch(Exception e) {
    e.printStackTrace();
}
%>
</body>
</html>
