package main.java;

public class Coach {
    private Human coach;

    public Coach(Human human) {
        this.coach = human;
    }

    public Human getHuman() {
        return coach;
    }
}
