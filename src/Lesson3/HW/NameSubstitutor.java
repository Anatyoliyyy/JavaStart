package Lesson3.HW;

import java.util.Scanner;

public class NameSubstitutor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter your name:");
        String name = scan.next();
        System.out.printf("Hi, my name is " + name);
        /* Enter your name:John
result - Hi, my name is John */
    }
}
