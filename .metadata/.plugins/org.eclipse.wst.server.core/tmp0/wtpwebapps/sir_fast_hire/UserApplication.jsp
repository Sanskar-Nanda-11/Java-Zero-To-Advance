<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="javax.servlet.http.*,javax.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Applications</title>
    <style>
        body {
            background-color: #fffaf0;
            font-family: 'Segoe UI', sans-serif;
            margin: 0;
            padding: 30px;
        }

        h2 {
            text-align: center;
            color: #d35400;
            margin-bottom: 30px;
        }

        table {
            width: 95%;
            margin: auto;
            border-collapse: collapse;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }

        th {
            background-color: #f39c12;
            color: white;
            padding: 12px;
            text-align: center;
        }

        td {
            padding: 12px;
            text-align: center;
            border: 1px solid #f0ad4e;
            background-color: #fff;
        }

        tbody tr:nth-child(even) {
            background-color: #fdf5e6;
        }

        p {
            text-align: center;
            color: #d35400;
            font-size: 1.1rem;
        }
    </style>
</head>
<body>
    <h2>My Applications</h2>
    
    <%
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast", "root", "root");

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM applications WHERE userId = ?");
        HttpSession session1 = request.getSession();
        statement.setInt(1, Integer.parseInt((String)session1.getAttribute("userId")));

        ResultSet set = statement.executeQuery();

        if (!set.isBeforeFirst()) {
            out.println("<p>You have not applied for any job.</p>");
        } else {
    %>

    <table>
        <thead>
            <tr>
                <th>Job ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Location</th>
                <th>Education</th>
                <th>Message</th>
                <th>Experience</th>
                <th>Applied On</th>
            </tr>
        </thead>
        <tbody>
            <%
                while (set.next()) {
            %>
                <tr>
                    <td><%= set.getString("jobId") %></td>
                    <td><%= set.getString("name") %></td>
                    <td><%= set.getString("email") %></td>
                    <td><%= set.getString("phone") %></td>
                    <td><%= set.getString("location") %></td>
                    <td><%= set.getString("education") %></td>
                    <td><%= set.getString("message") %></td>
                    <td><%= set.getInt("experience") %> yrs</td>
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
        out.println("<p>Error fetching application data.</p>");
    }
    %>
</body>
</html>
