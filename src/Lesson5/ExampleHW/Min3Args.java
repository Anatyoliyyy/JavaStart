package Lesson5.ExampleHW;

public class Min3Args {
    public static void main(String[] args) {
        int a = 30;
        int b = 50;
        int c = 10;

//        int min;
//        if (a < b && a < c) {
//            min = a;
//        } else if (b < a && b < c) {
//            min = b;
//        } else {
//            min = c;
//        }

        int min = (a < b) ? a : b;
        min = (min < c) ? min : c;

        System.out.println(min);
    }
}
