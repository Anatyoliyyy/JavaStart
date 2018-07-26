package Lesson_4_HomeWork.Conditions.Level_1;

import java.util.Scanner;

public class DaysOfMonthTask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month: ");
        int month = scan.nextInt();
        int days = 0;
        if (month < 1 || month > 12){
            System.out.println("Error. The number of the month must be in range from 1 to 12");
            System.exit(-1);
        }switch (month){
            case 1:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;

        }
        System.out.println(days);
        scan.close();
    }
}

//Enter month:
//4
//30

//Enter month:
//2
//28

//Enter month:
//20
//Error. The number of the month must be in range from 1 to 12