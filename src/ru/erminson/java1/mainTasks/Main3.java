package ru.erminson.java1.mainTasks;

/**
 * Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
 */

public class Main3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Number not entered");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = (int)Math.round(Math.random() * 10);
            }

            for (int i = 0; i < n; i++) {
                System.out.println(numbers[i]);
            }

            for (int i = 0; i < n; i++) {
                System.out.print(numbers[i] + " ");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid value entered: " + args[0]);
        }
    }
}
