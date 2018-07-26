package Lesson_4_HomeWork.Conditional_Constructions.Level_0;

import java.util.Scanner;

public class Rang_100_200 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number from 100 to 200:");
        int n = scan.nextInt();
        if (n < 200 && n >= 100){
            System.out.println("The number belong to the range 100 - 200");
        }else {
            System.out.println("The number does not belong to the range 100 - 200");
            scan.close();
        }
    }
}

//Enter number from 100 to 200:
//150
//The number belong to the range 100 - 200

//Enter number from 100 to 200:
//500
//The number does not belong to the range 100 - 200