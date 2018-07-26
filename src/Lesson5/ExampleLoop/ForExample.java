package Lesson5.ExampleLoop;

public class ForExample {
    public static void main(String[] args) {
        // 10, 11, 12, … 30
        for (int n = 10; n <= 30; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 1, 2, 4, 8 ... 64
        for (int n = 1; n <= 100; n *= 2) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 20, 19, 18, … -10
        for (int n = 20; n >= -10; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 10, 20, 30, … 100
        for (int n = 10; n <= 100; n += 10) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
