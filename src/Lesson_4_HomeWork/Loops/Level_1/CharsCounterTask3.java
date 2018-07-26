package Lesson_4_HomeWork.Loops.Level_1;

import java.util.Scanner;

public class CharsCounterTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        String ch;
        int count = 0;
        System.out.println("Enter string: ");
        s = scan.nextLine();
        System.out.println("Enter symbol: ");
        ch = scan.nextLine();
        if (ch.length()>1){
            System.out.println("Error. Enter symbol");
            System.exit(-1);
        }
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i)==ch.charAt(0)){
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }
}

//Enter string:
//Hello, world!
//Enter symbol:
//o
//Result
//2

//Enter string:
//
//Enter symbol:
//1
//Result
//0