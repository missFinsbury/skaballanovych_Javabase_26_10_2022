package com.hillel.skaballanovych.homeworks.homework1;

import java.util.Scanner;

public class Homework6_1 {
    public static void main(String[] args) {
        System.out.println("Guess number from 0 to 10 with 3 attempts");
        Scanner scanner1 = new Scanner(System.in);
        int x = (int) (Math.random() * 11);

        for (int iterator = 1; iterator <= 3; iterator++) {
            int try1 = scanner1.nextInt();


                    if (iterator == 3) {
                        System.out.println("Bad beat");

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


