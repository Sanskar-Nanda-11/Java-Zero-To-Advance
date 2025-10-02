<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Organization View Job</title>
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

    button {
      background-color: #2ecc71;
      color: white;
      border: none;
      padding: 8px 16px;
      font-size: 14px;
      border-radius: 5px;
      cursor: pointer;
      transition: background-color 0.3s ease;
    }

    button:hover {
      background-color: #27ae60;
    }
  </style>
</head>
<body>

<h1>Organization View Jobs</h1>

<table>
  <tr>
    <th>Organization Name</th>
    <th>Title</th>
    <th>Job Description</th>
    <th>Role</th>
    <th>Salary</th>
    <th>Vacancy</th>
    <th>View Applicants</th>
  </tr>

  <%
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast", "root", "root");

      PreparedStatement statement = connection.prepareStatement("SELECT * FROM all_jobs WHERE orgId=?");
      statement.setInt(1, (int) session.getAttribute("orgId"));

      ResultSet set = statement.executeQuery();

      while(set.next()) {
  %>
    <tr>
      <td><%= set.getString("orgName") %></td>
      <td><%= set.getString("title") %></td>
      <td><%= set.getString("job_description") %></td>
      <td><%= set.getString("role") %></td>
      <td><%= set.getInt("salary") %></td>
      <td><%= set.getInt("vacancy") %></td>
      <td>
        <a href="viewApplicants.jsp?jobId=<%= set.getInt("jobId") %>">
          <button>View</button>
        </a>
      </td>
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
