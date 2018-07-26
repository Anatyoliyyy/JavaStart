package Lesson3.HW;

import java.util.Scanner;

public class FunctionCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x:");
        double x = scan.nextDouble();
        scan.close();
        double result = Math.log( Math.sin(x) + Math.pow(Math.E, x) * Math.sqrt(x) / Math.PI);
        System.out.println("f(x) = " + result);
        /* Enter x: 0,5
result - f(x) = -0.16190946372347814
 */
    }
}
