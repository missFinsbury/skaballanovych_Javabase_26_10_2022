package com.hillel.skaballanovych.homeworks.homework1;

public class Homework7_1 {
    public static void main(String[] args) {
        //У Японії числа 4 та 9 вважаються нещасливими.
        // Вам потрібно пронумерувати 100 космічних
        // шатлів для перевезення людей на Марс так, щоб у номерах
        // шатлів не траплялося нещасливих чисел. Напишіть функцію,
        // яка виводить усі номери таких шатлів.

        int counterShuttles = 0;
        for (int i = 1; ; i++) {
            if (i / 10 == 4 || i / 10 == 9 ||
                    i / 10 == 14 || i / 10 == 19 || i % 10 == 4 || i % 10 == 9) {
                continue;
            }
            System.out.println("Name by number: " + i);
            counterShuttles++;
            if (counterShuttles == 101) {
                break;
            }

            System.out.println("Counter of shuttle: " + counterShuttles);
        }

    }
}
