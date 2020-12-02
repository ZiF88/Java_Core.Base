package ru.geekbrains.Homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class guess_the_word {



    public static void main(String[] args) throws IOException {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        int num = getRandomNum(words.length);

        String mainWord = words[num];

        int hashes = 15;

        System.out.println("Угадай слово");

        compare(mainWord, hashes);

        endGame();

    }

    static int getRandomNum(int num) {
        Random random = new Random();
        return random.nextInt(num);

    }

    private static void compare(String mainWord, int hashes) throws IOException {
        String userAnswer = getUserAnswer();
        String outputAnswer = "";

            do {

                for (int i = 0; i < hashes - 1; i++) {

                    if (i <= userAnswer.length() - 1 && i <= mainWord.length() - 1) {

                        if (userAnswer.charAt(i) == mainWord.charAt(i)) {
                            
                            outputAnswer += mainWord.charAt(i);

                        } else {
                            outputAnswer += "#";
                        }
                    } else {
                        outputAnswer += "#";
                    }

                    if (outputAnswer.equals(mainWord)) {
                        endGame();
                    }

                }

            } while (outputAnswer.length() == hashes);

        System.out.print(outputAnswer);
        System.out.println("\nВы не угадали, попробуйте еще раз");
        compare(mainWord, hashes);
    }

    private static String getUserAnswer()  throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private static void endGame() {
        System.out.println("Вы угадали! гра окончена");
        System.exit(0);
    }

}
