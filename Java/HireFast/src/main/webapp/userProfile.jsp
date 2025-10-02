<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>User Profile</title>
<style>
  body {
    margin: 0;
    padding: 40px 20px;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background-color: #f9fafc;
    color: #2c3e50;
    display: flex;
    flex-direction: column;
    align-items: center;
    min-height: 100vh;
  }
  
  h1 {
    margin-bottom: 30px;
  }
  
  label {
    font-weight: 600;
    margin-right: 10px;
    color: #34495e;
  }
  
  span {
    color: #555;
  }
  
  .profile-container {
    background: #fff;
    padding: 25px 40px;
    border-radius: 10px;
    box-shadow: 0 4px 14px rgba(0,0,0,0.1);
    width: 100%;
    max-width: 500px;
  }
  
  .profile-item {
    margin-bottom: 15px;
    font-size: 18px;
  }
</style>
</head>
<body>
  <h1>User Profile</h1>
  <div class="profile-container">
  <%
  try {
    //step 1 : Create the driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    //step 2 : Create a connection
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast","root","root");

    //step 3 : Preparing the queries
    PreparedStatement statement = connection.prepareStatement("select * from user_profile where userId = ?;");
    statement.setInt(1,(int) session.getAttribute("userId"));
    //step 4 : Executing the queries
    ResultSet set = statement.executeQuery();

    while(set.next()) { %>
      <div class="profile-item"><label>Name :</label><span><%=set.getString("name") %></span></div>
      <div class="profile-item"><label>Email :</label><span><%=set.getString("email") %></span></div>
      <div class="profile-item"><label>Phone no :</label><span><%=set.getLong("phone") %></span></div>
      <div class="profile-item"><label>Location :</label><span><%=set.getString("location") %></span></div>
      <div class="profile-item"><label>Education :</label><span><%=set.getString("education") %></span></div>
      <div class="profile-item"><label>Experience :</label><span><%=set.getInt("experience") %></span></div>
  <%
    }
    connection.close();

  } catch(Exception e) {
    e.printStackTrace();
  }
  %>
  </div>
</body>
</html>
