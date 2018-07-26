package Lesson_4_HomeWork.Loops.Level_1;

import java.util.Scanner;

public class PalindromeCheckerTask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        boolean result = false;
        System.out.println("Enter string: ");
        s = scan.nextLine();
        int length = s.length();
        for (int i = 0; i<length/2; i++){
            if (s.charAt(i)==s.charAt(length-1-i)){
                result = true;
            }else {
                result = false;
                break;
            }
        }
        System.out.println(result);
        scan.close();

    }


}

//Enter string:
//madam
//Result:
//true

//Enter string:
//apple
//Result:
//false

//Enter string:
//Madam
//Result:
//false