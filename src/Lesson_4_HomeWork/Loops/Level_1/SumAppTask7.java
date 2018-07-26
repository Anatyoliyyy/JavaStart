package Lesson_4_HomeWork.Loops.Level_1;

import java.util.Scanner;

public class SumAppTask7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int sum = 0;
        while (n !=0){
            sum+=n;
            n = scan.nextInt();
        }
        System.out.println(sum);
        scan.close();
    }
}

//10
//30
//20
//0
//Result:
//60

//0
//Result:
//0