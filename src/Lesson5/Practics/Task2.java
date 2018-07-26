package Lesson5.Practics;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cakes: ");
        int cakes = scan.nextInt();

        System.out.println("I have " +cakes+ " cakes");
        for (int cakeLeft = cakes - 1; cakeLeft >= 0; cakeLeft--){
            System.out.println("I have eaten a cake " +cakeLeft+ " are left");
        }
    }
}

//Enter cakes:
//5
//I have 5 cakes
//I have eaten a cake 4 are left
//I have eaten a cake 3 are left
//I have eaten a cake 2 are left
//I have eaten a cake 1 are left
//I have eaten a cake 0 are left