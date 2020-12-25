package ru.erminson.java1.optionalTasks1;

import java.util.Scanner;

/**
 * Найти число, цифры в котором идут в строгом порядке возрастания.
 * Если таких чисел несколько, найти первое из них.
 */

public class Optional6 {
    private static boolean isNumberConsistOfIncreasingDigits(final String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) >= str.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            final int n = scanner.nextInt();
            String increasingDigits = "";
            for (int i = 0; i < n; i++) {
                final String number = scanner.next();
                if (isNumberConsistOfIncreasingDigits(number)) {
                    increasingDigits = number;
                    break;
                }
            }

            if (increasingDigits.length() != 0) {
                System.out.println("First number consisting of increasing digits is " + increasingDigits);
            } else {
                System.out.println("Number consisting of increasing digits not found.");
            }
        } catch (Exception ex) {
            System.out.println("Illegal input");
        }
    }
}
