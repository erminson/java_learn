package ru.erminson.java1.mainTasks;

/**
 * Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */

public class Main2 {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >=0; i -= 1) {
            System.out.println(args[i]);
        }
    }
}
