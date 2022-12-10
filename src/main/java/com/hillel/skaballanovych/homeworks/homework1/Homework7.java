package com.hillel.skaballanovych.homeworks.homework1;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        System.out.println("Guess number from 0 to 10 with 3 attempts");
        Scanner scanner1 = new Scanner(System.in);
        int x = (int) (Math.random() * 11);
        int try1 = scanner1.nextInt();

        for (int iterator = 3; iterator <= 3; iterator--) {
            if ( iterator == 0) {
                System.out.println("Bad beat");
                break;

            } else if (try1 == x) {
                System.out.println("Win!!");
                break;

            } else if (try1 < x) {
                System.out.println("Number is bigger");
                scanner1.nextLine();

            } else if (try1 > 10) {
                System.out.println("Wrong data");
                scanner1.nextLine();

            } else {
                System.out.println("Number is smaller");
                scanner1.nextLine();
            }

        }

        }

    }











    //Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер
    // у діапазоні від 0 до 10
    //Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).


