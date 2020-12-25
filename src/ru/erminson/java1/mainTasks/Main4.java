package ru.erminson.java1.mainTasks;

/**
 * Ввести целые числа как аргументы командной строки,
 * подсчитать их сумму (произведение) и вывести результат на консоль.
 */

public class Main4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Numbers not entered");
            return;
        }

        try {
            final int n = args.length;
            final int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            int sum = 0;
            int prod = 1;
            for (int i = 0; i < n; i++) {
                sum += numbers[i];
                prod *= numbers[i];
            }

            System.out.println("Sum of numbers: " + sum);
            System.out.println("Product of numbers: " + prod);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid values entered: " + args);
        }
    }
}
