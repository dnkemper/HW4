
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

public class ReadRecord {
    
    private Connection conn;
    private ResultSet results;
    
    private Players player = new Players();
    private int playerID;
    
    public ReadRecord (int playerID){
       Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        
        this.playerID = playerID;
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void doRead() {
    
        try {
            //set up a string to hold query
            String query = "SELECT * FROM players WHERE playerID = ?";
            
            //create a preparedstatement using our query string
            PreparedStatement ps = conn.prepareStatement(query);
            //fill in the prepared statement
            ps.setInt(1, playerID);
            //execute the query
            this.results = ps.executeQuery();
            
            this.results.next();
            
            player.setPlayerID(this.results.getInt("playerID"));
            player.setPlayerName(this.results.getString("playerName"));
            player.setPlayerTeam(this.results.getString("playerTeam"));
            player.setPlayerPosition(this.results.getString("playerPosition"));
            player.setWHIP(this.results.getDouble("WHIP"));
            player.setWAR(this.results.getDouble("WAR"));
            player.setOPS(this.results.getDouble("OPS"));
            player.setgames(this.results.getInt("games"));
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }}

    
public Players getPlayer() {
        
        return this.player;
    }
}