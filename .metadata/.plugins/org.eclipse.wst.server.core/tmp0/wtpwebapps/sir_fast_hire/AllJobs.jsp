<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>All Posted Jobs</title>
  <style>
    body {
      background-color: #fffaf0;
      font-family: 'Segoe UI', sans-serif;
      margin: 0;
      padding: 30px;
    }

    h1 {
      text-align: center;
      color: #d35400;
      margin-bottom: 30px;
    }

    .card-container {
      display: flex;
      flex-wrap: wrap;
      gap: 20px;
      justify-content: center;
    }

    .job-card {
      background-color: #fff;
      border: 1px solid #f0ad4e;
      border-radius: 10px;
      box-shadow: 0 4px 8px rgba(0,0,0,0.1);
      padding: 20px;
      width: 350px;
      min-height: 300px;
      display: flex;
      flex-direction: column;
      justify-content: space-between;
    }

    .job-card h3 {
      color: #d35400;
      margin: 10px 0 5px;
    }

    .job-card p {
      margin: 0 0 10px;
      color: #333;
    }

    .job-card a {
      margin-top: auto;
      display: inline-block;
      background-color: #f39c12;
      color: white;
      padding: 10px 15px;
      text-decoration: none;
      font-weight: bold;
      border-radius: 5px;
      text-align: center;
      transition: background 0.3s;
    }

    .job-card a:hover {
      background-color: #e67e22;
    }
  </style>
</head>
<body>

  <h1>All Jobs</h1>

  <%
    String id = request.getParameter("id"); // Not used here, but kept for consistency
    System.out.print(id);

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/hirefast", "root", "root");

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM all_jobs");
        ResultSet set = statement.executeQuery();
  %>

  <div class="card-container">
    <%
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

        <a href="/Hirefast/JobApplication.jsp?jobId=<%= set.getString("jobId") %>">Apply Now</a>
      </div>
    <%
      }
      connection.close();
    %>
  </div>

  <%
    } catch (Exception e) {
        e.printStackTrace();
        out.println("<p>Error loading jobs.</p>");
    }
  %>

</body>
</html>
