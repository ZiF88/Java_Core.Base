package ru.geekbrains.Homework_6;

public class Animals {

    private String name;
    private int run;
    private int swim;
    private double jump;

    Animals (String name, int run, int swim, double jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public double getJump() {
        return jump;
    }

}
