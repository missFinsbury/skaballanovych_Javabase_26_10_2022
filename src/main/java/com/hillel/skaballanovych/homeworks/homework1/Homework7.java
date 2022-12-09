package com.hillel.skaballanovych.homeworks.homework1;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = (int) (Math.random() * 11);


            while (true) {
                System.out.println("Guess number from 0 to 10 with 3 attempts");
                int try1 = scanner.nextInt();
                int i = 3;
                if (try1 == x) {
                    System.out.println("Win!!");
                    break;

                } else if (try1 < x) {
                    System.out.println("Number is bigger");
                } else if (try1 > 10) {
                    System.out.println("Wrong data");
                } else {
                    System.out.println("Number is smaller");
                }
                scanner.nextLine();

                int try2 = scanner.nextInt();
                if (try2 == x) {
                    System.out.println("Win!!");
                    break;
                } else if (try2 < x) {
                    System.out.println("Number is bigger");
                } else if (try2 > 10) {
                    System.out.println("Wrong data");
                } else {
                    System.out.println("Number is smaller");
                }

                scanner.nextLine();

                int try3 = scanner.nextInt();
                if (try3 == x) {
                    System.out.println("Win!!");
                    break;
                } else if (try3 < x) {
                    System.out.println("Number is bigger");
                } else if (try3 > 10) {
                    System.out.println("Wrong data");
                } else {
                    System.out.println("Number is smaller");
                }

                System.out.println("Bad beat");
                scanner.nextLine();
                break;


            }

        }

    }






    //Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер
    // у діапазоні від 0 до 10
    //Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).


