package ru.geekbrains.Homework_6;

public class Main {

    public static void main(String[] args) {
        
        Cat cat1 = new Cat("Барсик", 200, 0,2);
        Dog dog1 = new Dog("Бобик", 400, 9, 0.5);
        Dog dog2 = new Dog("Бим", 600, 11, 1.5);

        int[] arrAnimalRunTest = {cat1.getRun(), dog1.getRun(), dog2.getRun()};
        int[] arrAnimalSwimTest = {cat1.getSwim(), dog1.getSwim(), dog2.getSwim()};
        double[] arrAnimalJumpTest = {cat1.getJump(), dog1.getJump(), dog2.getJump()};

        int runDistance= 300;
        int swimDistance = 10;
        double jumpHeight = 2;

        runTest(runDistance, arrAnimalRunTest);
        swimTest(swimDistance, arrAnimalSwimTest);
        jumpTest(jumpHeight, arrAnimalJumpTest);

    }

    private static void runTest(int runDistance, int[] arrAnimalRunTest) {
        for (int i : arrAnimalRunTest) {
            System.out.println(runDistance <= i ? "Run: " + i + " - " + true : "Run: " + i + " - " + false);
        }
    }

    private static void swimTest(int swimDistance, int[] arrAnimalSwimTest) {
        for (int i : arrAnimalSwimTest) {
                System.out.println(swimDistance <= i ? "Swim: " + i + " - " + true : "Swim: " + i + " - " + false);
        }
    }

    private static void jumpTest(double jumpHeight, double[] arrAnimalJumpTest) {
        for (double v : arrAnimalJumpTest) {
                System.out.println(jumpHeight <= v ? "Jump: " + v + " - " + true : "Jump: " + v + " - " + false);
        }
    }

}
