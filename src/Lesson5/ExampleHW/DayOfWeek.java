package Lesson5.ExampleHW;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day (1..7): ");
        int day = scanner.nextInt(); // Ctrl + Alt + V

        // BL
//        String dayType;
//        if (day <= 5) {
//            dayType = "weekday";
//        } else {
//            dayType = "weekend";
//        }

        String dayType = (day <= 5) ? "weekday" : "weekend";

        // Output
        System.out.println(dayType);
    }
}
