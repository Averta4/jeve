package org.example;

public class Main {

    public static String getAgeGroup(int age) {
        if (age < 0) {
            return "некорректный возраст";
        }

        if (age < 18) {
            return "ребенок";
        } else if (age < 60) {
            return "взрослый";
        } else {
            return "пенсионер";
        }
    }

    public static void main(String[] args) {
        System.out.println(getAgeGroup(20));
    }
}