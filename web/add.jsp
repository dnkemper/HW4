<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Player</title>
        <link rel="stylesheet" type="text/css" href="stylesheet.css"/>

    </head>
    <body>
        <h1>Add A New Player</h1>
        
        <form name="addForm" action="addPlayer" method="get">
            
            <label>Player Name:</label>
            <input type="text" name="name" value="" />
            <br>
            <label>Player Team:</label>
            <input type="text" name="team" value="" />
            <br>     
            <label>Player Position:</label>
            <input type="text" name="position" value="" />
            <br>
            <label>WHIP:</label>
            <input type="text" name="WHIP" value="" />
            <br>            
            <label>WAR:</label>
            <input type="text" name="WAR" value="" />
            <br>
            <label>OPS:</label>
            <input type="text" name="OPS" value="" />
            <br>
            <label>Games:</label>
            <input type="text" name="games" value="" />
            <br> 
            <input type="submit" name="submit" value="Submit" />
        </form>
        
    </body>
</html>
