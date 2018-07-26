package Lesson_4_HomeWork.Conditions.Level_1;

import java.util.Scanner;

public class BlackjackTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number from cardA");
        int cardA = scan.nextInt();
        System.out.println("Enter number from cardB");
        int cardB = scan.nextInt();
        if (cardA <= 0 || cardB <= 0) {
            System.out.println("Error");
            return;
        }
        if (cardB <= 21 && cardA <= 21) {
            System.out.println("Profit is " + (cardA < cardB ? cardB : cardA));
            return;
        }
        if (cardA >= 22 && cardB >= 22) {
            System.out.println("Profit is null ");
            return;
        }
        if (cardA >= 22 || cardB >= 22) {
            System.out.println("Profit is" + Math.min(cardA, cardB));
            return;

        }
        scan.close();
    }
}

//Result
//Enter number from cardA
//19
//Enter number from cardB
//20
//Profit is 20

//Enter number from cardA
//22
//Enter number from cardB
//19
//Profit is19

//Enter number from cardA
//22
//Enter number from cardB
//23
//Profit is null

//Enter number from cardA
//-19
//Enter number from cardB
//20
//Error

//Enter number from cardA
//22
//Enter number from cardB
//-19
//Error
