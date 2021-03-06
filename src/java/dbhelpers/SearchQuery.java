package dbhelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Players;

public class SearchQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public SearchQuery(){
        
        Properties props = new Properties(); //MWC
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void doSearch (String playerName){
        
        try {
            String query = "SELECT * FROM players WHERE UPPER(playerName) LIKE ? ORDER BY playerID ASC";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "%" + playerName.toUpperCase() + "%");
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getHTMLtable(){
        
        String table = "";
        
        table += "<table>";
        
        table += "<tr>";
                table += "<th>Player ID</th>";
                table += "<th>Player Name</th>";
                table += "<th>Player Team</th>";
                table += "<th>Player Position</th>";
                table += "<th>WHIP</th>";
                table += "<th>WAR</th>";
                table += "<th>OPS</th>";
                table += "<th>Games</th>";
                table += "<th>  </th>";
                table += "</tr>";
        
        try {
            while(this.results.next()){
                
                Players player = new Players();
                player.setPlayerID(this.results.getInt("playerID"));
                player.setPlayerName(this.results.getString("playerName"));
                player.setPlayerTeam(this.results.getString("playerTeam"));
                player.setPlayerPosition(this.results.getString("playerPosition"));
                player.setWHIP(this.results.getDouble("WHIP"));
                player.setWAR(this.results.getDouble("WAR"));
                player.setOPS(this.results.getDouble("OPS"));
                player.setgames(this.results.getInt("games"));
            
                table += "<tr>";               
                
                table += "<td>";
                table += player.getPlayerID();
                table += "</td>";
               
                table += "<td>";
                table += player.getPlayerName();
                table += "</td>";

                table += "<td>";
                table += player.getPlayerTeam();
                table += "</td>";
                
                table += "<td>";
                table += player.getPlayerPosition();
                table += "</td>";
                
                table += "<td>";
                table += player.getWHIP();
                table += "</td>";               

                table += "<td>";
                table += player.getWAR();
                table += "</td>";              

                table += "<td>";
                table += player.getOPS();
                table += "</td>";
                
                table += "<td>";
                table += player.getGames();
                table += "</td>";
                
                table += "<td>";
                table += "<a href=update?playerID=" + player.getPlayerID()+ "> Update </a>" + "<a href=delete?playerID=" + player.getPlayerID() + "> Delete </a>";
                table += "</td>";
                table += "</tr>";                                                                         
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
                table += "</table>";
                return table;            
}
}

