<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Profile</title>
<style>
  body {
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background: #f7f9fc;
    display: flex;
    justify-content: center;
    align-items: flex-start;
    padding: 40px 0;
    margin: 0;
  }
  form {
    background: #ffffff;
    border-radius: 10px;
    padding: 30px 40px;
    box-shadow: 0 4px 15px rgba(0,0,0,0.1);
    width: 400px;
  }
  h1 {
    text-align: center;
    color: #333;
    margin-bottom: 30px;
  }
  label {
    display: block;
    margin-bottom: 8px;
    font-weight: 600;
    color: #444;
  }
  input[type="text"],
  input[type="email"],
  input[type="number"] {
    width: 100%;
    padding: 10px 12px;
    margin-bottom: 20px;
    border: 1.5px solid #ccc;
    border-radius: 6px;
    font-size: 16px;
    transition: border-color 0.3s ease;
  }
  input[type="text"]:focus,
  input[type="email"]:focus,
  input[type="number"]:focus {
    border-color: #007bff;
    outline: none;
  }
  input[readonly] {
    background-color: #e9ecef;
    cursor: not-allowed;
  }
  button {
    width: 100%;
    padding: 12px 0;
    background-color: #007bff;
    border: none;
    border-radius: 6px;
    color: white;
    font-size: 18px;
    font-weight: 700;
    cursor: pointer;
    transition: background-color 0.3s ease;
  }
  button:hover {
    background-color: #0056b3;
  }
</style>
</head>
<body>

	<form action="addProfile" method="post">
		<h1>Add Profile</h1>
		<label>Name :</label>
		<input type="text" name="name" required />
		
		<label>Email :</label>
		<% String email = (String) session.getAttribute("email"); %>
		<input type="email" name="email" value="<%= email %>" readonly required />
		
		<label>Phone :</label>
		<input type="text" name="phone" required pattern="\d{10}" title="Enter 10 digit phone number" />
		
		<label>Location :</label>
		<input type="text" name="location" required />
		
		<label>Education :</label>
		<input type="text" name="education" required />
		
		<label>Experience :</label>
		<input type="number" name="experience" min="0" required />
		
		<button type="submit">Add</button>
	</form>
	
</body>
</html>
