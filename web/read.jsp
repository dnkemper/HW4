<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Players Page</title>
        <link rel="stylesheet" href="./stylesheet.css" type="text/css"/>
        <h1>Danielle's Favorite Baseball Players</h1>
    </head>
        <% String table = (String) request.getAttribute("table"); %>
        
        <body>
        
        <div class="wrap"> <!--div to hold all other divs -->

        <%@ include file="includes/header.jsp" %>
        
        <%@ include file="includes/menu.jsp" %>
           
        <div class="main">


        <%= table %>
            </div>
        <br><br><br>
<p class="text_line"> &nbsp;</p>
<footer><p><a href ="add">Add a New Player</a></p> 
        <br><br>
        <a href="search.jsp">Search Players </a>

        </div>

<%@ include file="includes/footer.jsp" %>
</div> <!--close the wrap div -->  
    </body>
</html>
