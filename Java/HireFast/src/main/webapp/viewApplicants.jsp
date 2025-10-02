<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Applicants</title>
  <style>
    body {
      margin: 0;
      padding: 40px 20px;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background-color: #f0f4f8;
      color: #333;
      display: flex;
      flex-direction: column;
      align-items: center;
    }

    h1 {
      color: #2c3e50;
      margin-bottom: 20px;
    }

    table {
      width: 100%;
      max-width: 1000px;
      border-collapse: collapse;
      background-color: #fff;
      box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
    }

    th, td {
      padding: 12px 15px;
      text-align: left;
      border-bottom: 1px solid #ddd;
    }

    th {
      background-color: #3498db;
      color: white;
    }

    tr:hover {
      background-color: #f1f1f1;
    }
  </style>
</head>
<body>

<h1>Applicants</h1>

<table>
  <tr>
    <th>Name</th>
    <th>Email</th>
    <th>Phone</th>
    <th>Location</th>
    <th>Education</th>
    <th>Message</th>
    <th>Experience</th>
  </tr>

  <%
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast", "root", "root");

      PreparedStatement statement = connection.prepareStatement("SELECT * FROM applications WHERE jobId=?");
      statement.setInt(1, Integer.parseInt(request.getParameter("jobId")));

      ResultSet set = statement.executeQuery();

      while (set.next()) {
  %>
    <tr>
      <td><%= set.getString("name") %></td>
      <td><%= set.getString("email") %></td>
      <td><%= set.getLong("phone") %></td>
      <td><%= set.getString("location") %></td>
      <td><%= set.getString("education") %></td>
      <td><%= set.getString("message") %></td>
      <td><%= set.getInt("experience") %></td>
    </tr>
  <%
      }

      connection.close();
    } catch(Exception e) {
      e.printStackTrace();
    }
  %>
</table>

</body>
</html>
