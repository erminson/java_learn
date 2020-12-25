package ru.erminson.java1.optionalTasks1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Найти число, состоящее только из различных цифр.
 * Если таких чисел несколько, найти первое из них.
 *
 */

public class Optional7 {
    private static boolean isNumberConsistingUniqueDigits(final String str) {
        final Set<Character> unique = new HashSet<Character>();
        for (final char ch : str.toCharArray()) {
            unique.add(ch);
        }

        return str.length() == unique.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            final int n = scanner.nextInt();
            String numberConsistingUniqDigits = "";
            for (int i = 0; i < n; i++) {
                final String number = scanner.next();
                if (isNumberConsistingUniqueDigits(number)) {
                    numberConsistingUniqDigits = number;
                    break;
                }
            }

            if (numberConsistingUniqDigits.length() != 0) {
                System.out.println("Number consisting of unique digits is " + numberConsistingUniqDigits);
            } else {
                System.out.println("Number consisting of unique digits not found");
            }
        } catch (Exception ex) {
            System.out.println("Illegal input");
        }
    }
}
