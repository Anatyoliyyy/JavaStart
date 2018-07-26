package Lesson5.Practics;

import java.util.Scanner;

public class TrianglePrinter {
    public static void main(String[] args) {
        System.out.println("TrianglePrinter");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter in size: ");
        int inSize = sc.nextInt();

        sc.close();

        for (int i = inSize; i > 0; i--) {
            for (int j = inSize; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            inSize--;
        }
    }
}
