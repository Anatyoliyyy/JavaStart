package Lesson5.Practics;

import java.util.Scanner;

public class TrianglePrinterExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scan.nextInt();

        for (int j = size; j >= 1 ; j--) {
            for (int i = j; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
