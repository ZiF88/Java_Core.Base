package ru.geekbrains.Homework_3;

import java.util.Random;
import java.util.Scanner;

public class guess_the_number {

    public static void main(String[] args) {

        guessNumGame();
    }

    private static void guessNumGame() {

        int answer = getRandomNum(9);
        int tryCount = 0;
        int maxTryCount = 3;

        for (int i = tryCount; i < maxTryCount; i++) {

            int userAnswer1 = getUserAnswer1(0, 9);

            if (userAnswer1 == answer) {
                System.out.println("Поздравляем, вы угадали!");
                break;
            } else {
                System.out.printf("Вы ввели число " + (userAnswer1 < answer ? "%s" : "%s")
                        +" загаданного, попробуйте еще раз \n", "больше", "меньше");
            }
        }

        repeat();
    }

    private static int getRandomNum(int num) {
        Random random = new Random();
        return random.nextInt(num);
    }

    private static int getUserAnswer1(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.printf("Угадайте число от %x до %x\n", min, max);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }

    private static void repeat() {
        int userAnswer2 = getUserAnswer2(1, 0);
        if (userAnswer2 == 1) {
            guessNumGame();
        } else {
            System.out.println("Игра окончена!");
        }
    }

    private static int getUserAnswer2(int cont, int exit) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
        System.out.printf("Хотите повторить? да = %x, нет = %x\n", cont, exit);
        x = sc.nextInt();
        } while (x < exit || x > cont);
        return x;
    }
}
