package com.comsciguide.springs;

public class TrackCoach implements Coach {

    private int food;
    public void eat() {
        System.out.println("Track coach implemented");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
