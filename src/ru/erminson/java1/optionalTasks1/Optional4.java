package ru.erminson.java1.optionalTasks1;

import java.util.Scanner;

/**
 * Ввести n чисел с консоли.
 * Найти число, в котором количество различных цифр минимально.
 * Если таких чисел несколько, найти первое из них.
 */

public class Optional4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            final int n = scanner.nextInt();
            String shortestNumber = "";
            for (int i = 0; i < n; i++) {
                final String number = scanner.next();
                final int length = shortestNumber.length();
                if (length == 0 || length > number.length()) {
                    shortestNumber = number;
                }
            }

            System.out.println("Shortest number: " + shortestNumber);
        } catch (Exception ex) {
            System.out.println("Illegal input");
        }
    }
}
