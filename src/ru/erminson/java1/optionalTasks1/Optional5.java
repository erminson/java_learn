package ru.erminson.java1.optionalTasks1;

import java.util.Scanner;

/**
 * Ввести n чисел с консоли.
 * Найти количество чисел, содержащих только четные цифры,
 * а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
 */

public class Optional5 {

    private static boolean isAllDigitEven(final String str) {
        for (int i = 0; i < str.length(); i++ ) {
            final char ch = str.charAt(i);
            if (ch % 2 == 1) {
                return false;
            }
        }

        return true;
    }

    private static boolean isCountOfEvenEqualsOdd(final String str) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        return even == odd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            final int n = scanner.nextInt();

            int evenNumbers = 0;
            int evenEqualsOddNumbers = 0;

            for (int i = 0; i < n; i++) {
                final String number = scanner.next();

                if (isAllDigitEven(number)) {
                    evenNumbers += 1;
                    continue;
                }

                if (isCountOfEvenEqualsOdd(number)) {
                    evenEqualsOddNumbers += 1;
                }
            }

            System.out.println("Amount of numbers containing only even digits: " + evenNumbers);
            System.out.println("Amount of numbers in which count of even equals count of odd digits: " +
                    evenEqualsOddNumbers);

        } catch (Exception ex) {
            System.out.println("Illegal input");
        }
    }
}
