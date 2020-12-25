package ru.erminson.java1.mainTasks;

/**
 * Ввести число от 1 до 12.
 * Вывести на консоль название месяца, соответствующего данному числу.
 * Осуществить проверку корректности ввода чисел.
 */

public class Main5 {
    private enum Month {
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Number not entered");
            return;
        }

        try {
            final int number = Integer.parseInt(args[0]);
            if (number < 1 || number > 12) {
                System.out.println("Number must be in the range from 1 to 12. You entered: " + number);
                return;
            }

            Month month = Month.values()[number - 1];
            System.out.println(month);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid value entered: " + args[0]);
        }
    }
}
