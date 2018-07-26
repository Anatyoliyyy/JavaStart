package Lesson_4_HomeWork.Loops.Level_1;

import java.util.Scanner;

public class RangePrinterTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first: ");
        int first = scan.nextInt();
        System.out.print("Enter last: ");
        int last = scan.nextInt();
        if (first <= last){
            for (int i = first; i <= last; i++){
                System.out.print(i+"\t");
            }
        }else {
            for (int i = first; i >= last; i--){
                System.out.print(i+"\t");
            }
        }
        scan.close();
    }
}

//Enter first: 1
//Enter last: 5
//1	2	3	4	5

//Enter first: 5
//Enter last: 1
//5	4	3	2	1

//Enter first: 1
//Enter last: 1
//1