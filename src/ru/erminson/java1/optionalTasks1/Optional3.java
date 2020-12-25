package ru.erminson.java1.optionalTasks1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ввести n чисел с консоли.
 * Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 */

public class Optional3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            final int n = scanner.nextInt();
            int sumOfLength = 0;
            final String[] numbers = new String[n];
            for (int i = 0; i < n; i++) {
                final String number = scanner.next();
                sumOfLength += number.length();
                numbers[i] = number;
            }
            final double average = (double)sumOfLength / n;

//            Arrays.sort(numbers, (str1, str2) -> Integer.compare(str1.length(), str2.length()));

            for (int i = 0; i < n; i++) {
                final int length = numbers[i].length();
                if (length < average) {
                    System.out.print(numbers[i] + "(" +  length + ") ");
                }
            }

            System.out.println("");
            for (int i = 0; i < n; i++) {
                final int length = numbers[i].length();
                if (length > average) {
                    System.out.print(numbers[i] + "(" +  length + ") ");
                }
            }
        } catch (Exception ex) {
            System.out.println("Illegal input:" + ex.getMessage());
        }
    }
}
