package ru.erminson.java1.optionalTasks1;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Ввести n чисел с консоли.
 * Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

public class Optional1 {
    static final private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    static public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            final int n = scanner.nextInt();
            String shortestNumber = "";
            String longestNumber = "";
            for (int i = 0; i < n; i++) {
                final String number = scanner.next();
                if (!isNumeric(number)) {
                    continue;
                }

                if (shortestNumber.length() == 0 || shortestNumber.length() > number.length()) {
                    shortestNumber = number;
                }

                if (longestNumber.length() < number.length()) {
                    longestNumber = number;
                }
            }

            System.out.println("Shortest number is: " + shortestNumber + ". It length: " + shortestNumber.length());
            System.out.println("Longest number is: " + longestNumber + ". It length: " + longestNumber.length());
        } catch (Exception ex) {
            System.out.println("Illegal input");
        }
    }
}
