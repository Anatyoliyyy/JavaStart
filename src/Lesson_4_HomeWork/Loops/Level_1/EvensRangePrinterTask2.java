package Lesson_4_HomeWork.Loops.Level_1;

import java.util.Scanner;

public class EvensRangePrinterTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first: ");
        int first = scan.nextInt();
        System.out.println("Enter last");
        int last = scan.nextInt();
        if (first>last){
            System.out.println("");
        }for (int i = first; i <= last; i++){
            if (i%2==0){
                System.out.println(i+"\t");
            }
        }scan.close();
    }
}

//Enter first:
//1
//Enter last
//9
//Result
//2
//4
//6
//8

//Enter first:
//9
//Enter last
//1
//Result
//