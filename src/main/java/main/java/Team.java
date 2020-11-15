package main.java;

public class Team {

    private String teamName;
    private Coach coach;
    private Player pointGuard;
    private Player shootingGuard;
    private Player smallForward;
    private Player powerForward;
    private Player center;


    public Team(String teamName, Coach coach, Player pointGuard, Player shootingGuard, Player smallForward, Player powerForward, Player center) {
        this.teamName = teamName;
        this.coach = coach;
        this.pointGuard = pointGuard;
        this.shootingGuard = shootingGuard;
        this.smallForward = smallForward;
        this.powerForward = powerForward;
        this.center = center;
    }

    public String getTeamName() {
        return teamName;
    }

    public Coach getCoach() {
        return coach;
    }

    public Player getPointGuard() {
        return pointGuard;
    }

    public Player getShootingGuard() {
        return shootingGuard;
    }

    public Player getSmallForward() {
        return smallForward;
    }

    public Player getPowerForward() {
        return powerForward;
    }

    public Player getCenter() {
        return center;
    }
}
