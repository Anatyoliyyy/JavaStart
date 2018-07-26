package Lesson_4_HomeWork.Conditions.Level_1;

import java.util.Scanner;

public class BmiInfoTask5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight, height;
        System.out.println("Enter weight: ");
        weight = scan.nextDouble();
        System.out.println("Enter height: ");
        height = scan.nextDouble();
        if (weight <= 0 || height <= 0){
            System.out.println("Error. Weight and Height must be above 0");
            System.exit(-1);
        }
        double bmi = weight/Math.pow(height, 2);
        if (bmi <= 18.5){
            System.out.println("Underweight");
        }else if (bmi > 18.5 && bmi <= 25.0){
            System.out.println("Normal");
        }else {
            System.out.println("Overweight");
        }

    }
}

//Enter weight: 70,0
//Enter height: 1,75
//Normal

//Enter weight:
//-70,0
//Enter height:
//1,75
//Error. Weight and Height must be above 0

//Enter weight:
//70,0
//Enter height:
//-1,75
//Error. Weight and Height must be above 0

//Enter weight:
//15,5
//Enter height:
//12,3
//Underweight

//Enter weight:
//120
//Enter height:
//1,85
//Overweight
