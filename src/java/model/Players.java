package model;


public class Players {
           
        private int playerID;
        private String playerName;
        private String playerTeam;
        private String playerPosition;
        private Double WHIP;
        private Double WAR;
        private Double OPS;
        private int games;

    public Players() {
        this.playerID = 0;
        this.playerName = "";
        this.playerTeam = "";
        this.playerPosition = "";
        this.WHIP = 0.00;
        this.WAR = 0.0;
        this.OPS = 0.000;
        this.games = 0;
    }
        
    public Players(int playerID, String playerName, String playerTeam, String playerPosition, double WHIP, double WAR, double OPS, int games) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.playerTeam = playerTeam;
        this.playerPosition = playerPosition;
        this.WHIP = WHIP;
        this.WAR = WAR;
        this.OPS = OPS;
        this.games = games;
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

    public Double getWHIP() {
        return WHIP;
    }

    public void setWHIP(double WHIP) {
        this.WHIP = WHIP;
    }

    public Double getWAR() {
        return WAR;
    }

    public void setWAR(double WAR) {
        this.WAR = WAR;
    }

    public Double getOPS() {
        return OPS;
    }

    public void setOPS(double OPS) {
        this.OPS = OPS;
    }
    public int getGames() {
        return games;
    }

    public void setgames(int games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return "Players{" + "playerID=" + playerID + ", playerName=" + playerName + ", playerTeam=" + playerTeam + ", playerPosition=" + playerPosition + ", WHIP=" + WHIP + ", WAR=" + WAR + ", OPS=" + OPS + "games=" + games + '}';
    }   

}