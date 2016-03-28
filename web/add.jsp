<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Player</title>
        <link rel="stylesheet" type="text/css" href="./stylesheet.css"/>

    </head>
    <body>
        <div class="wrap"> <!--div to hold all other divs -->

        <%@ include file="includes/header.jsp" %>
        
        <%@ include file="includes/menu.jsp" %>
           
        <div class="main">
            
        <h1>Add A New Player</h1>    
        <form name="addForm" action="addPlayer" method="get">
            <fieldset> <legend>Our Newest Addition to the<br>Roster</legend></fieldset> 
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
            <br> <br>
            <input type="submit" name="submit" value="Submit" />
            <br><br> <br><br><a href="http://msci3300-s1606.cloudapp.net:8080/playersApp/read"> Back to Players table </a><br><br>
        </form>
 </div>

<%@ include file="includes/footer.jsp" %>
</div> <!--close the wrap div -->   
    </body>
</html>
