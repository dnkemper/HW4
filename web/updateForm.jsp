<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Players"%>
<% Players player = (Players) request.getAttribute("player");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update A Player</title>
        <link rel="stylesheet" type="text/css" href="./stylesheet.css"/>
    </head>
    <body>
        
     <h1>Update Player</h1>  
              
        <form name="updateForm" action="updatePlayer" method="get">
   
            <fieldset> <legend>Update to the Legendary<br>Roster</legend></fieldset> 
            <br>
            <label>Player ID:</label>
            <input type="text" name="id" value="<%= player.getPlayerID()%>" readonly/>
            <br>
            <label>Player Name:</label>
            <input type="text" name="name" value="<%= player.getPlayerName()%>"/>
            
            <br>
            <label>Player Team:</label>
            <input type="text" name="team" value="<%= player.getPlayerTeam() %>"/>
            <br>     
            <label>Player Position:</label>
            <input type="text" name="position" value="<%= player.getPlayerPosition()%>"/>
            <br>
            <label>WHIP:</label>
            <input type="text" name="WHIP" value="<%= player.getWHIP()%>"/>
            <br>            
            <label>WAR:</label>
            <input type="text" name="WAR" value="<%= player.getWAR()%>"/>
            <br>
            <label>OPS:</label>
            <input type="text" name="OPS" value="<%= player.getOPS()%>"/>
            <br>
            <label>Games:</label>
            <input type="text" name="games" value="<%= player.getGames()%>"/>
            <br> <br>
            <input type="reset" name="reset" value="Clear" />
            <input type="submit" name="submit" value="Update" />
            <br><br> <br><br><a href="http://msci3300-s1606.cloudapp.net:8080/playersApp/read"> Back to Players table </a><br><br>
        </form>
        
    </body>
</html>
