package ru.erminson.java1.mainTasks;

/**
 * Приветствовать любого пользователя при вводе его имени через командную строку.
 */

public class Main1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, John Doe");
            return;
        }

        System.out.println(args.length);
        for (final String item : args) {
            System.out.println(item);
        }
    }
}
