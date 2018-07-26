package Lesson_4_HomeWork.Loops.Level_1;

import java.util.Scanner;

public class PrimeCheckerTask5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        boolean result = false;
        System.out.println("Enter integer: ");
        n = scan.nextInt();
        if (n<=0){
            System.out.println("Error. Integer must be belove 0");
            System.exit(-1);
        }
        if (n==2){
            result = true;
        }
        for (int i=2; i<n; i++){
            if (n%i == 0){
                result = false;
                break;
            }else {
                result = true;
            }
        }
        System.out.println(result);
        scan.close();
    }
}

//Enter integer:
//1
//Result:
//false

//Enter integer:
//2
//Result:
//true

//Enter integer:
//151
//Result:
//true

//Enter integer:
//200
//Result:
//false