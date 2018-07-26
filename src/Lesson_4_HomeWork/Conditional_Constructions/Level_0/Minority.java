package Lesson_4_HomeWork.Conditional_Constructions.Level_0;

import java.util.Scanner;

public class Minority {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number: a");
        int a = scan.nextInt();
        System.out.println("Enter number: b");
        int b = scan.nextInt();
        System.out.println("Min number is" + Math.min (a, b));

        scan.close();
    }
}

//Enter number: a
//45
//Enter number: b
//85
//Min number is45

//Enter number: a
//10
//Enter number: b
//10
//Min number is10