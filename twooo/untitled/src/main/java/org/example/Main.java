package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. Показать задачи");
            System.out.println("2. Добавить задачу");
            System.out.println("3. Удалить задачу");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            if (choice == 1) {
                showTasks();
            } else if (choice == 2) {
                addTask();
            } else if (choice == 3) {
                removeTask();
            } else if (choice == 0) {
                break;
            }
        }
    }

    private static void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список пуст");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }

    private static void addTask() {
        System.out.print("Введите задачу: ");
        String text = scanner.nextLine();
        tasks.add(new Task(text));
    }

    private static void removeTask() {
        showTasks();
        System.out.print("Введите номер задачи для удаления: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Неверный номер");
        }
    }
}
