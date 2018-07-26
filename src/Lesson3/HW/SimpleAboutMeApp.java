package Lesson3.HW;

import java.util.Scanner;

public class SimpleAboutMeApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Enter your surname:");
        String surname = scan.nextLine();
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        scan.close();
        System.out.println("I'm " + name + " " + surname + ", " + age + " years old" );
        /* Enter your name:
John
Enter your surname:
Smith
Enter your age:
30
result - I'm John Smith, 30 years old
 */
    }
}
