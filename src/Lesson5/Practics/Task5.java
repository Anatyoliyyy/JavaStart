package Lesson5.Practics;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter people: ");
        int people = scan.nextInt();

        System.out.println("Enter cakes: ");
        int cakes = scan.nextInt();

        for (int person = 1; person <= people; person++) {
            System.out.println("I'm " + person + " person. I have " + cakes + " cakes");

            for (int cakeIndex = 1; cakeIndex <= cakes; cakeIndex++) {
                System.out.println("I'm " + person + " person. I have eaten " + cakeIndex + " cake");
            }
        }
    }
}

//Enter people:
//3
//Enter cakes:
//2
//I'm 1 person. I have 2 cakes
//I'm 1 person. I have eaten 1 cake
//I'm 1 person. I have eaten 2 cake
//I'm 2 person. I have 2 cakes
//I'm 2 person. I have eaten 1 cake
//I'm 2 person. I have eaten 2 cake
//I'm 3 person. I have 2 cakes
//I'm 3 person. I have eaten 1 cake
//I'm 3 person. I have eaten 2 cake
