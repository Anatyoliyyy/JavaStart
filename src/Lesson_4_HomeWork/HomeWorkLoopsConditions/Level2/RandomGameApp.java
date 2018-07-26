package Lesson_4_HomeWork.HomeWorkLoopsConditions.Level2;

import java.util.Random;
import java.util.Scanner;

public class RandomGameApp {
    public static void main(String[] args) {
        System.out.println("Let`s play!");
        Random random = new Random();
        int min = 1;
        int max = 100;
        int number = random.nextInt(max - min) + min;
        int counter = 0;
        int comparemin = 0;
        int comparemax = 100;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Input number (" + comparemin + ".." + comparemax + "): ");
            int scan = scanner.nextInt();
            if (scan == number) {
                System.out.println("YOU WIN!!! Random number was " + number);
                break;
            } else {
                if (scan < number) {
                    comparemin = scan + 1;
                } else {
                    comparemax = scan - 1;
                }
                counter++;
            }
        } while (counter < 5);
        System.out.println("Sorry, you lose. Random number was " + number);
    }
}

//Let`s play!
//Input number (0..100): 40
//Input number (41..100): 70
//Input number (71..100): 55
//Input number (56..100): 40
//Input number (41..100): 70
//Sorry, you lose. Random number was 78
//
//Process finished with exit code 0

//Let`s play!
//Input number (0..100): 78
//Input number (0..77): 40
//Input number (41..77): 50
//Input number (51..77): 60
//Input number (51..59): 55
//Sorry, you lose. Random number was 52
//
//Process finished with exit code 0