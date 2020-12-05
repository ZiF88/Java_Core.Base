package ru.geekbrains.lesson1;

public class MainApp {

    public static void main(String[] args) {  //firstTask

        secondTask();

        thirdTask(2, 3, 7, 10);

        fourthTask(10, 15);

        fifthTask(25);

        System.out.println(sixthTask(-100));

        seventhTask("Тимофей");

        eighthTask(2020);
    }

    private static void eighthTask(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            if (year == 2020) System.out.println("Да, " + year + " - тоже високосный ¯/_(ツ)_/¯");
            else {
                System.out.println("Год " + year + " является високосным!");
            }
        }
        else {
            System.out.println("Год " + year + " НЕ является високосным!");
        }
    }

    private static void seventhTask(String name) {

        System.out.println("Привет, " + name + "!");
    }

    private static boolean sixthTask(int a) {

        return a < 0;
    }

    private static void fifthTask(int a) {
        if (a >= 0) {
            System.out.println("Число '" + a + "' является положительным!");
        }
        else {
            System.out.println("Число '" + a + "' является отрицательным!");
        }
    }

    private static void fourthTask(int a, int b) {

        System.out.println(a + b >= 10 && a + b <= 20);
    }

    private static void thirdTask(int a, int b, double c, double d) {

        System.out.println(a * (b + (c / d)));
    }

    private static void secondTask() {
        byte a = -100;
        short b = 30100;
        int c = 100500;
        long d = 100500100L;
        float e = 3.14f;
        double f = 1.234;
        char g = '\u1235';
        boolean h = true;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", f = " + f + ", e = " + e +
                ", g = " + g + ", h = " + h);
    }
}
