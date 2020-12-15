package ru.geekbrains.Homework_7;

import java.util.Scanner;

public class Main {
    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Cat[] cats = {new Cat("Том", 10, 0, 15),
                new Cat("Бутч", 15, 0, 20),
                new Cat("Барс", 12, 5, 12)};
        Plate plate = new Plate(0);

        startFeeding(cats, plate);

    }

    private static void startFeeding(Cat[] cats, Plate plate) {
        System.out.println("Накормите голодных котов! Положите еды в миску:");
        plate.addFood(in.nextInt());

        catsEating(cats, plate);
    }

    private static void catsEating(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            if (!cat.isHungry()) {
                cat.eat(plate);
                if (cat.isHungry()) {
                    System.out.println("Кот " + cat.getName() + " наелся");
                }
            } else {
                System.out.println("Кот " + cat.getName() + " не голоден.");
            }
            plate.printInfo();
        }

        repeatRequest(cats, plate);
    }

    private static void repeatRequest(Cat[] cats, Plate plate) {
        int counter = 0;
        for (Cat cat : cats) {
            counter++;
            if (cat.isHungry()) {
                if (counter == cats.length) {
                    System.out.println("Все коты сыты, но скоро проголодаются, покормим их завтра? 1 - да, 0 - нет");
                    exitOrContinue(cats, plate);
                }

            } else {
                counter--;
                System.out.println("Кот " + cat.getName() + " еще голоден, накорми кота!");
                System.out.println(cat.getName() + " хочет еще съесть: " + cat.getHungerRate() + ", А в миске: " + plate.getFoodInfo());
            }
        }
        System.out.println("Покормить? 1 - да, 0 - нет");
        exitOrContinue(cats, plate);
    }
//не реализовано снижение наполненности котов при рестарте на следующий день. + Поверка на ввод строк.
//доработать если будет время. Отнимать рандомом из наполненности по каждому коту
    private static void exitOrContinue(Cat[] cats, Plate plate) {
        int x = in.nextInt();
        if (x == 1) {
            startFeeding(cats, plate);
        } else if (x == 0) {
            endGame();
        } else {
            wrongValue(cats, plate);
        }
    }

    private static void endGame() {
        System.out.println("Котики останутся голодными =(");
        System.exit(0);
    }

    private static void wrongValue(Cat[] cats, Plate plate) {
        System.out.println("Вы ввели неверное значение, повторите ввод:");
        exitOrContinue(cats, plate);
    }
}
