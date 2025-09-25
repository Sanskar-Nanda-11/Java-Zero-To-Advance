<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>My Posted Jobs</title>
  <style>
    body {
      background-color: #fffaf0;
      font-family: 'Segoe UI', sans-serif;
      margin: 0;
      padding: 20px;
    }

    h1 {
      text-align: center;
      color: #d35400;
      margin-bottom: 40px;
    }

    .job-card {
      background-color: #fff;
      border: 1px solid #f0ad4e;
      border-radius: 10px;
      box-shadow: 0 4px 10px rgba(0,0,0,0.1);
      padding: 20px;
      margin: 20px auto;
      max-width: 600px;
    }

    h3 {
      color: #d35400;
      margin-bottom: 5px;
    }

    p {
      margin: 0 0 15px;
      color: #333;
    }

    a {
      display: inline-block;
      margin-top: 10px;
      padding: 10px 16px;
      background-color: #f39c12;
      color: white;
      text-decoration: none;
      font-weight: bold;
      border-radius: 5px;
      transition: background-color 0.3s ease;
    }

    a:hover {
      background-color: #e67e22;
    }
  </style>
</head>
<body>

<h1>Jobs You Have Posted</h1>

<%
  String id = request.getParameter("id");
  try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast", "root", "root");

      PreparedStatement statement = connection.prepareStatement("SELECT * FROM all_jobs WHERE orgId = ?");
      HttpSession session1 = request.getSession();
      statement.setInt(1, Integer.parseInt((String) session1.getAttribute("orgId")));

      ResultSet set = statement.executeQuery();

      while (set.next()) {
%>
  <div class="job-card">
    <h3>Title</h3>
    <p><%= set.getString("title") %></p>

    <h3>Job Description</h3>
    <p><%= set.getString("job_description") %></p>

    <h3>Role</h3>
    <p><%= set.getString("role") %></p>

    <h3>Salary</h3>
    <p><%= set.getString("salary") %></p>

    <h3>Vacancy</h3>
    <p><%= set.getString("vacany") %></p>

    <h3>Organisation Name</h3>
    <p><%= set.getString("orgName") %></p>

    <a href="/Hirefast/JobApplicants.jsp?jobId=<%= set.getString("jobId") %>">View Applicants</a>
  </div>
<%
      }
      connection.close();
  } catch (Exception e) {
      e.printStackTrace();
  }
%>

</body>
</html>
