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

        public gameStats(int fouls, int threePointScores, int twoPointScores, int threePointShots, int twoPointShots, int twoPointAccuracy, int threePointAccuracy, int rebounds) {
            this.fouls = fouls;
            this.threePointScores = threePointScores;
            this.twoPointScores = twoPointScores;
            this.threePointShots = threePointShots;
            this.twoPointShots = twoPointShots;
            this.twoPointAccuracy = twoPointAccuracy;
            this.threePointAccuracy = threePointAccuracy;
            this.rebounds = rebounds;
        }

        public int getFouls() {
            return fouls;
        }

        public int getThreePointScores() {
            return threePointScores;
        }

        public int getTwoPointScores() {
            return twoPointScores;
        }

        public int getThreePointShots() {
            return threePointShots;
        }

        public int getTwoPointShots() {
            return twoPointShots;
        }

        public int getTwoPointAccuracy() {
            return twoPointAccuracy;
        }

        public int getThreePointAccuracy() {
            return threePointAccuracy;
        }

        public int getRebounds() {
            return rebounds;
        }
    }

}
