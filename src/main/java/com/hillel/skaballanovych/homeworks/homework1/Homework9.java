package com.hillel.skaballanovych.homeworks.homework1;

public class Homework9 {
    public static void main(String[] args) {

        int sumAverage1 = 0;
        int sumAverage2 = 0;
        int min = 18;
        int max = 41;
        int[] ageTeam1 = new int[25];
        int[] ageTeam2= new int[25];
        System.out.println("Age of players in team 1: ");

        for (int i=0; i < ageTeam1.length;i++) {
            ageTeam1[i] = (int) (Math.random() * (max - min) + min);
            System.out.print(" "  + ageTeam1[i] );
            sumAverage1 += ageTeam1[i];

        }
        System.out.print( " " );
        System.out.println( " " );
        System.out.println("Age of players in team 2: ");
        for (int i2=0; i2 < ageTeam2.length;i2++) {
            ageTeam2[i2] = (int) (Math.random() * (max - min) + min);
            System.out.print (" " + ageTeam2[i2] );
            sumAverage2 += ageTeam2[i2];
        }
        System.out.println( " " );
        double average1 = (double) sumAverage1 / ageTeam1.length;
        double average2 = (double) sumAverage2 / ageTeam2.length;
        System.out.println("Avarage age of players in team1: " + average1);
        System.out.println("Avarage age of players in team2: " + average2);
    }
}