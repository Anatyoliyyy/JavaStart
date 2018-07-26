package Lesson_4_HomeWork.Conditional_Constructions.Level_0;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter day (1..7):");
        int day = scan.nextInt (); //Ctr+Alt+v

        if (day <= 5) {
            System.out.println("Weekday");
        } else {
            System.out.println("Weekend");
            scan.close();
        }
    }
}
// Enter day (1..7):
//1
//Weekday
//Enter day (1..7):
//6
//Weekend