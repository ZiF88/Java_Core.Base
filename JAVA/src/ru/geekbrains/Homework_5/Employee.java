package ru.geekbrains.Homework_5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    protected int age;


    public Employee(String fullName, String position, String email, int phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printEmployeeInfo() {
        System.out.printf("ФИО: %s, должность: %s, почта: %s, телефон: %s, зарплата: %s, возраст: %s\n"
                , fullName, position, email, phoneNumber, salary, age);
    }

}
