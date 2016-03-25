<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Players Page</title>
        <link rel="stylesheet" href="./stylesheet.css" type="text/css"/>
        <h1>Danielle's Favorite Baseball Players</h1>
    </head>
        <body>
            <div id="readtable">
    <% String table = (String) request.getAttribute("table"); %>

        <%= table %>
            </div>
        <br><br><br>
<p class="text_line"> &nbsp;</p>
<footer><p><a href ="add">Add a New Player</a></p> </footer>
             
    </body>
</html>
