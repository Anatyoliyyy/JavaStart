package Lesson5.Practics;

import java.util.Scanner;

public class Task6TrianglePrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = scan.nextInt();

        for (int i = size; i > 0; i--) {
            for (int o = size; o > 0; o--) {
                System.out.print(o + " ");
            }
            System.out.println();
            size--;
        }
    }
}

//Enter size:
//4
//4 3 2 1
//3 2 1
//2 1
//1
//
//Process finished with exit code 0