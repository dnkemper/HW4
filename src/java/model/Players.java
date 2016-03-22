package model;


public class Players {
           
        private int playerID;
        private String playerName;
        private String playerTeam;
        private String playerPosition;
        private int WHIP;
        private int WAR;
        private int OPS;

    public Players() {
        this.playerID = 0;
        this.playerName = "";
        this.playerTeam = "";
        this.playerPosition = "";
        this.WHIP = 0;
        this.WAR = 0;
        this.OPS = 0;
    }
        
    public Players(int playerID, String playerName, String playerTeam, String playerPosition, int WHIP, int WAR, int OPS) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.playerTeam = playerTeam;
        this.playerPosition = playerPosition;
        this.WHIP = WHIP;
        this.WAR = WAR;
        this.OPS = OPS;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerTeam() {
        return playerTeam;
    }

    public void setPlayerTeam(String playerTeam) {
        this.playerTeam = playerTeam;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int getWHIP() {
        return WHIP;
    }

    public void setWHIP(int WHIP) {
        this.WHIP = WHIP;
    }

    public int getWAR() {
        return WAR;
    }

    public void setWAR(int WAR) {
        this.WAR = WAR;
    }

    public int getOPS() {
        return OPS;
    }

    public void setOPS(int OPS) {
        this.OPS = OPS;
    }

    @Override
    public String toString() {
        return "Players{" + "playerID=" + playerID + ", playerName=" + playerName + ", playerTeam=" + playerTeam + ", playerPosition=" + playerPosition + ", WHIP=" + WHIP + ", WAR=" + WAR + ", OPS=" + OPS + '}';
    }
        
}
    

