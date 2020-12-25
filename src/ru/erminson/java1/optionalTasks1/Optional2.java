package ru.erminson.java1.optionalTasks1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ввести n чисел с консоли.
 * Вывести числа в порядке возрастания (убывания) значений их длины.
 */

public class Optional2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            final int n = scanner.nextInt();
            final String[] numbers = new String[n];
            for (int i = 0; i < n; i++) {
                final String number = scanner.next();
                numbers[i] = number;
            }

            Arrays.sort(numbers, (str1, str2) -> Integer.compare(str1.length(), str2.length()));
            System.out.println(Arrays.toString(numbers));
            Arrays.sort(numbers, (str1, str2) -> Integer.compare(str2.length(), str1.length()));
            System.out.println(Arrays.toString(numbers));
        } catch(Exception ex) {
            System.out.println("Illegal input");
        }
    }
}
