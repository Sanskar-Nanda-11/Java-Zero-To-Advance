<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Apply for a Job</title>
<style>
  body {
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background-color: #f5f7fa;
    color: #2c3e50;
    margin: 40px 20px;
    display: flex;
    flex-direction: column;
    align-items: center;
  }
  
  h1 {
    margin-bottom: 30px;
  }

  table {
    border-collapse: collapse;
    width: 100%;
    max-width: 900px;
    background: #fff;
    box-shadow: 0 4px 14px rgba(0,0,0,0.1);
    border-radius: 8px;
    overflow: hidden;
  }

  th, td {
    text-align: left;
    padding: 14px 18px;
    border-bottom: 1px solid #ddd;
    font-size: 16px;
  }
  
  th {
    background-color: #34495e;
    color: white;
    font-weight: 600;
  }
  
  tr:hover {
    background-color: #f1f1f1;
  }
  
  button {
    padding: 8px 18px;
    background-color: #2980b9;
    color: white;
    border: none;
    border-radius: 6px;
    cursor: pointer;
    font-size: 15px;
    transition: background-color 0.3s ease;
  }
  
  button:hover {
    background-color: #1c5980;
  }
  
  a {
    text-decoration: none;
  }
</style>
</head>
<body>
  <h1>Apply for a Job</h1>
  <table>
    <tr>
      <th>Organization Name</th>
      <th>Title</th>
      <th>Job Description</th>
      <th>Role</th>
      <th>Salary</th>
      <th>Vacancy</th>
      <th>Apply</th>
    </tr>
    <%
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast","root","root");
      PreparedStatement statement = connection.prepareStatement("select * from all_jobs;");
      ResultSet set = statement.executeQuery();

      while(set.next()) { %>
        <tr>
          <td><%= set.getString("orgName") %></td>
          <td><%= set.getString("title") %></td>
          <td><%= set.getString("job_description") %></td>
          <td><%= set.getString("role") %></td>
          <td><%= set.getInt("salary") %></td>
          <td><%= set.getInt("vacancy") %></td>
          <td><a href="applicationForm.jsp?jobId=<%= set.getInt("jobId") %>"><button>Apply</button></a></td>
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
