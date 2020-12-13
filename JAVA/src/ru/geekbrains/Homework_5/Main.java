package ru.geekbrains.Homework_5;

public class Main {

    static final int AGE_SORT = 40;

    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Petrov Divan", "Engineer Leader", "pd@mail.ru"
                , 892312312, 300000, 50);
        empArray[1] = new Employee("Suvorov Eran", "Senior Engineer", "se@mail.ru"
                , 892313266, 150000, 40);
        empArray[2] = new Employee("Apostolic Petr", "Middle Engineer", "ap@mail.ru"
                , 892398562, 75000, 30);
        empArray[3] = new Employee("Serious Sam", "Junior Engineer", "ss@mail.ru"
                , 892375451, 50000, 20);
        empArray[4] = new Employee("Builder Fan", "Junior Engineer", "bf@mail.ru"
                , 892365232, 25000, 20);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() >= AGE_SORT) {
                empArray[i].printEmployeeInfo();
            }
        }
    }

}
