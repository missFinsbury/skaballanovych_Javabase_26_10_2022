package com.hillel.skaballanovych.homeworks.homework1;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter team 1 name");
        String team1Name = scanner.nextLine();
        System.out.println(team1Name);

        System.out.println("please enter count frags pl 1 team 1");
        int player1Team1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("please enter count frags pl 2 team 1");
        int player2Team1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("please enter count frags pl 3 team 1");
        int player3Team1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("please enter count frags pl 4 team 1");
        int player4Team1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("please enter count frags pl 5 team 1");

        int player5Team1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(player1Team1);

        System.out.println("please enter team 2 name");
        String team2Name = scanner.nextLine();
        System.out.println(team2Name);

        System.out.println("please enter count frags pl 1 team 2");
        int player1Team2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("please enter count frags pl 2 team 2");
        int player2Team2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("please enter count frags pl 3 team 2");
        int player3Team2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("please enter count frags pl 4 team 2");
        int player4Team2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("please enter count frags pl 5 team 2");

        int player5Team2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(player1Team1);

        System.out.println("Avarage frag amount of team 1");
        double avarageFrag1 = (player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1)/5;
        System.out.println(avarageFrag1);


        System.out.println("Avarage frag amount of team 2");
        double avarageFrag2 = (player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2)/5;
        System.out.println(avarageFrag2);

        if (avarageFrag1 > avarageFrag2) {
            System.out.println("Team 1 is a winner");
        }
        if (avarageFrag2 > avarageFrag1) {
            System.out.println("Team 2 is a winner");
        }
        if (avarageFrag2 > avarageFrag1) {
            System.out.println("with the result = " + avarageFrag2);
        } if (avarageFrag1 > avarageFrag2) {
            System.out.println("with the result = " + avarageFrag1);
    }
        if (avarageFrag2 == avarageFrag1) {
            System.out.println("Dead heat");
            double result = avarageFrag2;
            System.out.println("with the result = " + result);
        }

//end!
    }


}



