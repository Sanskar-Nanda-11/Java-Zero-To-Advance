<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%
    String jobId = request.getParameter("jobId");
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Apply Now</title>
  <style>
    body {
      background-color: #fffaf0;
      font-family: 'Segoe UI', sans-serif;
      margin: 0;
      padding: 0;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    form {
      background-color: #fff;
      border: 1px solid #f0ad4e;
      border-radius: 10px;
      box-shadow: 0 8px 16px rgba(0,0,0,0.1);
      padding: 30px 40px;
      width: 100%;
      max-width: 500px;
    }

    h2 {
      text-align: center;
      color: #d35400;
      margin-bottom: 20px;
    }

    label {
      display: block;
      margin: 15px 0 5px;
      font-weight: 600;
      color: #333;
    }

    input, textarea {
      width: 100%;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 5px;
      box-sizing: border-box;
    }

    button {
      width: 100%;
      margin-top: 20px;
      padding: 12px;
      background-color: #f39c12;
      color: white;
      border: none;
      border-radius: 5px;
      font-size: 1rem;
      font-weight: bold;
      cursor: pointer;
      transition: background-color 0.3s ease;
    }

    button:hover {
      background-color: #e67e22;
    }
  </style>
</head>
<body>

  <form action="applyJob" method="POST">
    <h2>Apply Now</h2>

    <input type="hidden" name="jobId" value="<%= jobId %>">

    <label>Name</label>
    <input type="text" name="name" required>

    <label>Email</label>
    <input type="email" name="email" required>

    <label>Phone</label>
    <input type="number" name="phone" required>

    <label>Location</label>
    <input type="text" name="location" required>

    <label>Education</label>
    <input type="text" name="education" required>

    <label>Experience (in years)</label>
    <input type="number" name="experience" required>

    <label>Message</label>
    <textarea name="message" rows="4" required></textarea>

    <button type="submit">Submit Application</button>
  </form>

</body>
</html>
