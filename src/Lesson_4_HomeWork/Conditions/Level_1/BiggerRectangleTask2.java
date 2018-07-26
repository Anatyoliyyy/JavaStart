package Lesson_4_HomeWork.Conditions.Level_1;

import java.util.Scanner;

public class BiggerRectangleTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int widht1;
        int height1;
        int widht2;
        int height2;
        System.out.println("Enter widht1 and height1");
        widht1 = scan.nextInt();
        height1 = scan.nextInt();
        System.out.println("Enter widht2 and height2");
        widht2 = scan.nextInt();
        height2 = scan.nextInt();
        if (widht1<=0||height1<=0||widht2<=0||height2<=0){
            System.out.println("Error");
        }
        if (widht1*height1 > widht2*height2){
            System.out.println("The first BiggerRectangle is bigger");
        }else {
            System.out.println("The second BiggerRectangle is bigger");
        }
        scan.close();
    }
}

//Enter widht1 and height1
//10 20
//Enter widht2 and height2
//40 30
//The second BiggerRectangle is bigger

//Enter widht1 and height1
//10 -20
//Enter widht2 and height2
//40 30
//Error
//The second BiggerRectangle is bigger

//Enter widht1 and height1
//20 30
//Enter widht2 and height2
//10 20
//The first BiggerRectangle is bigger

//Enter widht1 and height1
//20 30
//Enter widht2 and height2
//10 -20
//Error
//The first BiggerRectangle is bigger