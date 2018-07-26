package Lesson5.Practics;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cakes: ");
        int cakes = scan.nextInt();

        System.out.println("Enter borderCake: ");
        int borderCake = scan.nextInt();

        System.out.println("I have " +cakes+ " cakes.");
        for (int cakeIndex = 1; cakeIndex <= cakes; cakeIndex++){
            System.out.println("I have eaten " +cakeIndex+ " cake.");

            if (cakeIndex >= borderCake){
                System.out.println("I'm feeling bad.");
            }
        }
    }
}

//Enter cakes:
//5
//Enter borderCake:
//2
//I have 5 cakes.
//I have eaten 1 cake.
//I have eaten 2 cake.
//I'm feeling bad.
//I have eaten 3 cake.
//I'm feeling bad.
//I have eaten 4 cake.
//I'm feeling bad.
//I have eaten 5 cake.
//I'm feeling bad.