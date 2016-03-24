<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Players Page</title>
        <link rel="stylesheet" type="text/css" href="stylesheet.css"/>

    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    <body>
        <h1>Danielle's Favorite Baseball Players</h1>
        <%= table %>
        
        <br><br>
        
        <a href ="add">Add a New Player</a>
        
    </body>
</html>
