<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Favorite Baseball Players</title>
        <link rel="stylesheet" type="text/css" href="./stylesheet.css"/>
    </head>
    <body>
        
<div class="wrap"> <!--div to hold all other divs -->

        <%@ include file="includes/header.jsp" %>
        
        <%@ include file="includes/menu.jsp" %>
           
        <div class="main">
            <h1>Danielle's Favorite Baseball Players</h1>
             <br><br><br><br>
             <h2>Baseball Players Database</h2>
            <br><br><br>
             <a href="read">View All Baseball Players</a>
             <br><br>
             <a href="search.jsp">Search Players </a>
        </div>
    <%@ include file="includes/footer.jsp" %>
</div> <!--close the wrap div -->  
</body>
</html>
