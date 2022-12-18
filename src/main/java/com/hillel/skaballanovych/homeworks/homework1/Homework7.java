package com.hillel.skaballanovych.homeworks.homework1;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
            Scanner scanner1 = new Scanner(System.in);
            int try1;
            int x = (int) (Math.random() * 11);
            int attempts = 3;

            System.out.println("Guess number from 0 to 10 with 3 attempts");
            for (int iterator = 1; iterator <= 3; iterator++) {

                System.out.println("Attemps: " + attempts);

                if (scanner1.hasNextInt()) {
                    try1 = scanner1.nextInt();
                    if (try1 < 0 || try1 > 10) {
                        System.out.println("Enter from 0 to 10");
                        iterator--;
                        continue;
                    }

                    if (try1 == x) {
                        System.out.println("Win!!");
                        break;
                    } else if (try1 < x) {
                        System.out.println("Number is bigger");
                        scanner1.nextLine();
                    } else {
                        System.out.println("Number is smaller");
                        scanner1.nextLine();
                    }

                    if(iterator == 3) {
                        System.out.println("Bad beat");
                    }

                    attempts--;

                } else {
                    System.out.println("Wrong data, enter numbers");
                    scanner1.nextLine();
                    iterator--;
                }

            }


        }

    }





//Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер
// у діапазоні від 0 до 10
//Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).


