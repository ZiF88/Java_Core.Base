package ru.geekbrains.Homework_4;

import java.util.Random;
import java.util.Scanner;

public class ticTacToe {

 
    static final int SIZE = 5;

    static final char DOT_EMPTY = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = 'O';

    static final String EMPTY = " ";

    static final int WIN_SIZE = 4;

    static char[][] map = new char[SIZE][SIZE];
    static final Scanner in = new Scanner(System.in);
    static final Random random = new Random();


    public static void main(String[] args) {
        turnGame();
    }

    private static void turnGame() {
        initMap();
        printMap();
        playGame();
    }


    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();
        printMapRow();
    }

    private static void printMapHeader() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + EMPTY);
        }
        System.out.println();
    }

    private static void printMapRow() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + EMPTY);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            checkEnd(DOT_HUMAN);

            aiTurn();
            printMap();
            checkEnd(DOT_AI);
        }
    }

    private static void humanTurn() {
        int x = 0, y = 0;
        System.out.println("Ваш ход! Введите координаты:");
        do {
            System.out.print("Строка = ");
            if (in.hasNextInt()) {
                x = in.nextInt();
            } else {
                in.next();
                System.out.println("Введите число в диапазоне от 1 до " + SIZE + "\n");
                continue;
            }

            System.out.print("Столбик = ");
            if (in.hasNextInt()) {
                y = in.nextInt();
            } else {
                in.next();
                System.out.println("Введите число в диапазоне от 1 до " + SIZE + "\n");
                continue;
            }
        } while (!isCellValid(x, y));
        map[x - 1][y - 1] = DOT_HUMAN;
    }
 // косяк с ходом компьютера. Проверить. Занимает занятые точки в 2:2 и вводит неверные значения
    private static void aiTurn() {
        int x, y;
        System.out.println("Ход компьютера:");
        do {
            x = random.nextInt(SIZE) + 1;
            y = random.nextInt(SIZE) + 1;
        } while (!isCellValid(x, y));
        map[x - 1][y - 1] = DOT_AI;
    }

    private static boolean isCellValid (int x, int y) {

        if (x < 1 || x > SIZE || y < 1 || y > SIZE) {
            System.out.println("\nПроверьте значение строки и столбца");
            return false;
        }

        if (map[x - 1][y - 1] != DOT_EMPTY) {
                System.out.println("\nВы выбрали занятую ячейку");
            return false;
        }

        return true;
    }

    private static void checkEnd(char symbol) {
        boolean isEnd = false;

        if (checkWin(symbol)) {
            String winMessage;

            if (symbol == DOT_HUMAN) {
                winMessage = "Вы победили =)";
            }
            else {
                winMessage = "Копьютер победил =(";
            }

            isEnd = true;
            System.out.println(winMessage);
        }

        if(!isEnd && isMapFull()){
            System.out.println("Ничья =||");
            isEnd = true;
        }

        if (isEnd) {
            repeatQuestion();
        }
    }

    private static boolean checkWin(char symbol) {


// проверка прямых
        for (int i = 0; i < SIZE; i++) {
            int counter = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map [i][j] == symbol || map [j][i] == symbol) {
                    counter++;
                }
            }
            if (counter == WIN_SIZE) {
                return true;
            }
        }

// проверка диагональ 1
        for (int i = 0; i < SIZE; i++) {
            int counter = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][j] == symbol) {
                    counter++;
                }
            }
            if (counter == WIN_SIZE) {
                return true;
            }
        }

// проверка диагональ 2
        for (int i = 0; i < SIZE; i++) {
            int counter = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][SIZE - 1 - j] == symbol) {
                    counter++;
                }
            }
            if (counter == WIN_SIZE) {
                return true;
            }
        }

        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    private static void repeatQuestion() {
        System.out.println("Повторим? 1 - да, 0 - нет");
        int x = in.nextInt();
        if (x == 1) {
            turnGame();
        } else if (x == 0) {
            System.exit(0);
        } else {
            System.out.println("Вы ввели неверное значение");
            repeatQuestion();
        }
    }

}

