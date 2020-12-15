package ru.geekbrains.Homework_7;

public class Cat {
    private String name;
    private int appetite;
    private int fill;
    private int maxFill;

    public Cat(String name, int appetite, int fill, int maxFill) {
        this.name = name;
        this.appetite = appetite;
        this.fill = fill;
        this.maxFill = maxFill;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (appetite <= plate.getFoodInfo()) {
            plate.decreaseFood(appetite);
            this.fill += appetite;
            System.out.println("Кот " + name + " съел: " + appetite + " еды");
        } else {
            System.out.println("Кот " + name + " хочет съесть больше, чем есть в тарелке");
        }
    }

    public boolean isHungry() {
        return (maxFill / 2) <= fill; // кот голоден когда заполнен менее, чем наполовину
    }

    public int getHungerRate() {
        return maxFill - fill;
    }
}

