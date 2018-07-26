package Lesson_4_HomeWork.Loops.Level_1;

import java.util.Random;
import java.util.Scanner;

public class RandomsPrinterTask6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int min, max, count;
        System.out.print("Enter count: ");
        count = scan.nextInt();
        System.out.print("Enter min: ");
        min = scan.nextInt();
        System.out.print("Enter max: ");
        max = scan.nextInt();
        if (count<=0||min>max){
            System.out.println("Error. Count >0, min <= max.");
            System.exit(-1);
        }
        for (int i = 0; i<count; i++){
            System.out.print(rand.nextInt(max-min+1)+min+"\t");
        }
        scan.close();

    }
}

//Enter count: 3
//Enter min: 10
//Enter max: 20
//Result:
//10	16	19

//Enter count: -3
//Enter min: 10
//Enter max: 20
//Result:
//Error. Count >0, min <= max.

//Enter count: 3
//Enter min: 30
//Enter max: 20
//Result:
//Error. Count >0, min <= max.