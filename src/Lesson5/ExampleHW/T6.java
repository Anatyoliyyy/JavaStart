package Lesson5.ExampleHW;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = scan.nextInt();

        for (int i = size; i > 0; i--) {
            for (int o = size; o > 0; o--) {
                System.out.print(o + " ");//Печатаем строку
            }
            System.out.println();//Переводим каретку, чтобы следующий цикл был с новой строки
            size--;
        }
    }
}

//Enter size:
//5
//5 4 3 2 1
//4 3 2 1
//3 2 1
//2 1
//1
//
//Process finished with exit code 0