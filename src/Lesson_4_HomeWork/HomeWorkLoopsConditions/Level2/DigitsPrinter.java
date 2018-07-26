package Lesson_4_HomeWork.HomeWorkLoopsConditions.Level2;

public class DigitsPrinter {
    public static void main(String[] args) {
        printDigits(147292);
        printDigits(-147292);
    }

    public static void printDigits(int n) {
        if (n < 0) {
            System.out.print("- ");
            n = Math.abs(n);
        }
        int length = (int) (Math.log10(n) + 1);
        int dec = 1;
        for (int k = 1; k < length; k++) {
            dec *= 10;
        }
        for (int i = dec; i >= 1; i /= 10) {
            System.out.print(n / i % 10 + " ");
            if (i == 1) {
                System.out.println();
            }
        }
    }
}

//1 4 7 2 9 2
//- 1 4 7 2 9 2
//
//Process finished with exit code 0
