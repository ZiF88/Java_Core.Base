package ru.geekbrains.Homework_5;

public class Employee {
    String fullName;
    String position;
    String email;
    int phoneNumber;
    int salary;
    int age;


    Employee(String fullName, String position, String email, int phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void printEmployeeInfo() {
        System.out.printf("ФИО: %s, должность: %s, почта: %s, телефон: %s, зарплата: %s, возраст: %s\n"
                , fullName, position, email, phoneNumber, salary, age);
    }

}
