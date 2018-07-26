package Lesson3.HW;

import java.util.Scanner;

public class DifferentRadixSummator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x, y, z;
        System.out.print("Enter X in Bin:");
        x = scn.nextInt(2);
        System.out.print("Enter Y in Oct:");
        y = scn.nextInt(8);
        System.out.print("Enter Z in Hex:");
        z = scn.nextInt(16);
        int result = x + y + z;
        System.out.println(result);
        /* Enter X in Bin:1011
Enter Y in Oct:73
Enter Z in Hex:ABC
result - 2818 */
    }
}
