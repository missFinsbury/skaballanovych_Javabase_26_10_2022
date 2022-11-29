package com.hillel.skaballanovych.homeworks.homework1;

public class homework5 {

    //За владу в стародавньому Китаї боролися дві династії: Лі та Мінь.
    //З кожного боку боролися 3 типи воїнів з такими показниками атаки:
    //Лі:
    //воїн - 13
    //лучник - 24
    //вершник - 46
    //
    //Мінь:
    //воїн - 9
    //лучник - 35
    //вершник - 12
    //Розрахувати: загальний показник атаки для обох династій, якщо відомо,
    // що воїнів династії Лі кожного типу було 860,
    // а кількість воїнів династії Мінь кожного типу в півтора рази більша.
    //Вивести в консоль значення загальної атаки кожної армії;

    public static void main(String[] args) {
        int warriorAttackLi = 13;
        int archerAttackLi = 24;
        int apexAttackLi = 46;
        int quantLi = 860;
        int indexLi = warriorAttackLi * quantLi + archerAttackLi * quantLi + apexAttackLi * quantLi;
        System.out.println(" Pokazatel ataki Li = " + indexLi);

        int warriorAttackM = 9;
        int archerAttackM = 35;
        int apexAttackM = 12;
        int quantMin = (int) (860 * 1.5);
        int indexMin = warriorAttackM * quantMin + archerAttackM * quantMin + apexAttackM * quantMin;
        System.out.println(" Pokazatel ataki Min = " + indexMin);
    }
}
