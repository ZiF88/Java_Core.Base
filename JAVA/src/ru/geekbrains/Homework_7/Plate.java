package ru.geekbrains.Homework_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int food) {
        this.food -= food;
    }

    public void addFood(int food) {
        this.food += food;
    }

    public void printInfo() {
        System.out.println("В миске: " + food);
    }

    public int getFoodInfo() {
        return food;
    }

}
