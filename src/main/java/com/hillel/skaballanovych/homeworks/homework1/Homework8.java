package com.hillel.skaballanovych.homeworks.homework1;

public class Homework8 {
    public static void main(String[] args) {
        System.out.println("Age of players in team 1");
        int[] ageTeam1= new int[25];

        for (int i = 0; i < ageTeam1.length; i++) {
            ageTeam1[i] = (int) (Math.random()*(40 - 18) + 18);
        }

        for (int i = 0; i < ageTeam1.length; i++) {
            if (i == ageTeam1.length - 1) {
                System.out.print(ageTeam1[i]);
            } else {
                System.out.print(ageTeam1[i] + ", ");
            }
    }
        System.out.println("");
        System.out.println("");

        System.out.println("Age of players in team 2");
        int[] ageTeam2= new int[25];

        for (int i = 0; i < ageTeam2.length; i++) {
            ageTeam2[i] = (int) (Math.random()*(40 - 18) + 18);
        }

        for (int i = 0; i < ageTeam2.length; i++) {
            if (i == ageTeam2.length - 1) {
                System.out.print(ageTeam2[i]);
            } else {
                System.out.print(ageTeam2[i] + ", ");
            }}
}}




//Є дві команди регбі з 25 гравців різного віку у кожній.
//Вік беремо випадковим чином в діапазоні від 18 до 40.
//Виведіть у двох рядках вік гравців кожної команди.
//Порахуйте середній вік гравців кожної команди та виведіть на екран.
