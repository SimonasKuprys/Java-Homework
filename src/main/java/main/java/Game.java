package main.java;


import java.time.LocalDateTime;

public class Game {

    private static Team home;
    private static Team away;
    private static LocalDateTime dateOfGame;
    private static int homeScore;
    private static int awayScore;

    public Game(Team home, Team away, int score, LocalDateTime dateOfGame, int homeScore, int awayScore) {
        this.home = home;
        this.away = away;
        this.dateOfGame = dateOfGame;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public static Team getWinner() {
        if (homeScore > awayScore) {
            System.out.println("Team " + home + " won!");
        } else if (awayScore > homeScore) {
            System.out.println("Team " + away + " von!");
        } else
            System.out.println("Draw");
        return getWinner();
    }

    public Team getHome() {
        return home;
    }

    public Team getAway() {
        return away;
    }

    public LocalDateTime getDateOfGame() {
        return dateOfGame;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }
}
