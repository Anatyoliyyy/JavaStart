package Lesson_4_HomeWork.Conditional_Constructions.Level_0;

import java.util.Scanner;

public class Minority2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter number: a");
        int a = scan.nextInt();

        System.out.println("Enter number: b");
        int b = scan.nextInt();

        System.out.println("Enter number: c");
        int c = scan.nextInt();

        if (a<b&&b<c) {
            System.out.println("Min number is" + a);
        }else if (b<a&&a<c){
            System.out.println("Min number is" + b);
        }else {
            System.out.println("Min number is" + c);
            scan.close();
        }
    }
}

//Enter number: a
//66
//Enter number: b
//99
//Enter number: c
//33
//Min number is33

//Enter number: a
//55
//Enter number: b
//88
//Enter number: c
//22
//Min number is22