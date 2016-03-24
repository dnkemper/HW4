/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbhelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Players;

/**
 *
 * @author Danielle
 */
public class AddQuery {
    
    private Connection conn;
    
    public AddQuery(){
        
       Properties props = new Properties(); //MWC
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void doAdd (Players player){
        
        try {
            String query = "INSERT INTO players (playerName, playerTeam, playerPosition, WHIP, WAR, OPS, games) VALUES (?,?,?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, player.getPlayerName());
            ps.setString(2, player.getPlayerTeam());
            ps.setString(3, player.getPlayerPosition());
            ps.setDouble(4, player.getWHIP());
            ps.setDouble(5, player.getWAR());
            ps.setDouble(6, player.getOPS());
            ps.setInt(7, player.getGames());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    
    
}
