package Lesson5.ExampleCondition;

public class IfExample {
    public static void main(String[] args) {
        int x = 21;

        if (x < 20) {
            System.out.println("1");
            if (x > 10) {
                System.out.println("4");
            }
        } else {
            System.out.println("2");
        }

        System.out.println("3");
    }
}
