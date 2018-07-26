package Lesson5.Practics;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cakes: ");
        int cakes = scan.nextInt();

        System.out.println("I have " +cakes+ " cakes");
        for (int cake2 = 1; cake2 <= cakes; cake2++){
            System.out.println("I have eaten " +cake2+ " cake");
            if (cake2 % 2 == 0){
                System.out.println("Wonderful world.");
            }
        }
    }
}

//Enter cakes:
//11
//I have 11 cakes
//I have eaten 1 cake
//I have eaten 2 cake
//Wonderful world.
//I have eaten 3 cake
//I have eaten 4 cake
//Wonderful world.
//I have eaten 5 cake
//I have eaten 6 cake
//Wonderful world.
//I have eaten 7 cake
//I have eaten 8 cake
//Wonderful world.
//I have eaten 9 cake
//I have eaten 10 cake
//Wonderful world.
//I have eaten 11 cake