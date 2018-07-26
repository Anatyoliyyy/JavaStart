package Lesson_4_HomeWork.Cycles.Level_0;

import java.util.Scanner;

public class CyclesTask5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter from");
        int from = scan.nextInt();
        System.out.println("Enter to");
        int to = scan.nextInt();
        if (from <= to){
            for (int i = from; i <= to; i++){
                System.out.println(i);
            }
        }else {
            System.out.println("Error.\"From\"must be less or equal than\"to\"");
            scan.close();
        }
    }
}


//Enter from
//10
//Enter to
//20
//Result
//10
//11
//12
//13
//14
//15
//16
//17
//18
//19
//20

//Enter from
//20
//Enter to
//10
//Result
//Error."From"must be less or equal than"to"