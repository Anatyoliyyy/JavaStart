package Lesson_4_HomeWork.Loops.Level_1;

import java.util.Scanner;

public class MultiplicationTablePrinterTask8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scan.nextInt();
        for (int y = 1; y <= size; y++){
            for (int x = 1; x <= size; x++){
                System.out.print(x*y+"\t");
            }
            System.out.print("\n");
        }
        scan.close();

    }
}

//Enter size:
//3
//Result:
//1	2	3
//2	4	6
//3	6	9

//Enter size:
//-3
//Result:
//