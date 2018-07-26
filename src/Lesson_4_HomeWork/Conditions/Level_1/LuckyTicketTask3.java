package Lesson_4_HomeWork.Conditions.Level_1;

import java.util.Scanner;

public class LuckyTicketTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number ticket: ");
        int numTicket = scan.nextInt();
        if (numTicket < 0 || numTicket > 999999){
            System.out.println("Error. The number of ticket must be in the range from 0 to 999999");
            System.exit(-1);
        }
        if (numTicket % 10 + numTicket / 10 % 10 + numTicket / 100 % 10 == numTicket / 1000 % 10 + numTicket / 10000 % 10 + numTicket / 100000 % 10){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        scan.close();
    }
}

//Enter number ticket:
//273534
//true

//Enter number ticket:
//111112
//false

//Enter number ticket:
//22222222
//Error. The number of ticket must be in the range from 0 to 999999
