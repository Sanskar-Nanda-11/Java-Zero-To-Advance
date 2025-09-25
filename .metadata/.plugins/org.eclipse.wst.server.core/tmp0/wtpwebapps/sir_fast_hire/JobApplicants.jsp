<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Applicant Details</title>
  <style>
    body {
      background-color: #fffaf0;
      font-family: 'Segoe UI', sans-serif;
      padding: 40px;
      margin: 0;
    }

    h2 {
      text-align: center;
      color: #d35400;
      margin-bottom: 30px;
    }

    table {
      width: 90%;
      margin: 0 auto;
      border-collapse: collapse;
      box-shadow: 0 4px 8px rgba(0,0,0,0.1);
    }

    thead {
      background-color: #f39c12;
      color: white;
    }

    th, td {
      padding: 10px 12px;
      border: 1px solid #f0ad4e;
      text-align: center;
    }

    tbody tr:nth-child(even) {
      background-color: #fef3e7;
    }

    p {
      text-align: center;
      font-size: 1.1rem;
      color: #333;
      margin-top: 40px;
    }
  </style>
</head>
<body>

  <h2>Applicant Information</h2>

  <%
    String jobId = request.getParameter("jobId");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast", "root", "root");

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM applications WHERE jobId = ?");
        statement.setInt(1, Integer.parseInt(jobId));
        ResultSet set = statement.executeQuery();

        if (!set.isBeforeFirst()) {
  %>
          <p>No applicants found for this job.</p>
  <%
        } else {
  %>

  <table>
    <thead>
      <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Phone</th>
        <th>Location</th>
        <th>Education</th>
        <th>Experience</th>
        <th>Message</th>
        <th>Applied On</th>
      </tr>
    </thead>
    <tbody>
      <%
        while (set.next()) {
      %>
        <tr>
          <td><%= set.getString("name") %></td>
          <td><%= set.getString("email") %></td>
          <td><%= set.getString("phone") %></td>
          <td><%= set.getString("location") %></td>
          <td><%= set.getString("education") %></td>
          <td><%= set.getInt("experience") %> years</td>
          <td><%= set.getString("message") %></td>
          <td><%= set.getString("createdAt") %></td>
        </tr>
      <%
        }
      %>
    </tbody>
  </table>

  <%
        }
        connection.close();
    } catch (Exception e) {
        e.printStackTrace();
  %>
      <p>Error fetching applicant data.</p>
  <%
    }
  %>

</body>
</html>
