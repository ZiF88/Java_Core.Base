package ru.geekbrains.homework_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        firstTask();
        
//        secondTask();
        
//        thirdTask();
        
//        fourthTask();
        
//        fifthTask();

//        sixthTask();
        
//        seventhTask(); // к сожалению, не разобрался как можно смещать данные и последний записывать в первый.
//        Получилось только искуственно. Задачу хочу сдать до начала следующего урока, чтобы не было соблазна подсмотреть решение.
    }

    private static void seventhTask() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = 1;
        int s = arr[0];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i < arr.length - 1) {
                arr[i] = arr[i + n];
            } else if (i == arr.length - 1) {
                arr[i] = s;
            }
            System.out.println(arr[i]);
        }
    }

    private static void sixthTask() {

        int[] arr = {1, 2, 2, 5};
        int sumLeft = 0;

        for (int i = 0; i < arr.length; i++) {
            sumLeft += arr[i];
            int sumRight = 0;

            for (int j = arr.length - 1; j > i; j--) {

                sumRight += arr[j];
            }

            System.out.println(sumLeft == sumRight);
        }

    }

    private static void fifthTask() {

        int[] arr = {101, 2, 4, 6, -54, 5, 760};

        Arrays.sort(arr);
        System.out.println("Минимальное число: " + arr[0] + ", Максимальное число: " + arr[arr.length - 1]);
    }

    private static void fourthTask() {

        int size = 11;
        int[][] arr = new int[size][size];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%2d " , (i == j || size-i == j+1) ? (arr[i][j] = 1) : (arr[i][j] = 0));
            }
            System.out.println();
        }
    }

    private static void thirdTask() {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Число " + arr[i]);

            int result = (arr[i] < 6) ? (arr[i] *= 2) : (arr[i]);

            System.out.println(" стало " + result);
        }
    }

    private static void secondTask() {

        int[] arr = new int[8];
        int value = 0;

        for (int i = 0; i < arr.length; i++) {

            System.out.println("arr[" + i + "] = " + value);
            value += 3;
        }
    }

    private static void firstTask() {

        int[] arr = {0, 0, 0, 0, 1, 1, 1, 1};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                arr[i] = 1;
                System.out.println(arr[i]);
            } else {
                arr[i] = 0;
                System.out.println(arr[i]);
            }
        }
    }
}
