package main.java;

public class Player {

    private Human player;
    private int playerNumber;
    private String position;

    public Player(Human player, int playerNumber, String position) {
        this.player = player;
        this.playerNumber = playerNumber;
        this.position = position;

    }

    public Human getPlayer() {
        return player;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }


    public String getPosition() {
        return position;
    }

    public static class gameStats {
        private int fouls;
        private int threePointScores;
        private int twoPointScores;
        private int threePointShots;
        private int twoPointShots;
        private int twoPointAccuracy;
        private int threePointAccuracy;
        private int rebounds;

    }
}
