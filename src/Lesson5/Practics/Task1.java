package Lesson5.Practics;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cakes: ");
        int cakes = scan.nextInt();

        System.out.println("I have " +cakes+ " cakes");
        for (int cakeIndex = 1; cakeIndex <= cakes; cakeIndex++){
            System.out.println("I have eaten " +cakeIndex+ " cake");
        }
    }
}

//Enter cakes:
//5
//I have 5 cakes
//I have eaten 1 cake
//I have eaten 2 cake
//I have eaten 3 cake
//I have eaten 4 cake
//I have eaten 5 cake