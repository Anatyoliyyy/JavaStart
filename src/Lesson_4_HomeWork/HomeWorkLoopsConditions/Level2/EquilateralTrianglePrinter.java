package Lesson_4_HomeWork.HomeWorkLoopsConditions.Level2;

public class EquilateralTrianglePrinter {
    public static void main(String[] args) {
        printEquilateralTriangle(4);
        printEquilateralTriangle(8);
        printEquilateralTriangle(-4);
    }

    public static void printEquilateralTriangle(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size > 0");
        }
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= (size + (size - 1)); j++) {
                if ((j <= (size - i)) || (j > ((size + (size - 1)) - (size - i)))) {
                    System.out.print(" ");
                }
                if ((j > (size - i)) && (j <= ((size + (size - 1)) - (size - i)))) {
                    System.out.print("^");
                }
                if (j == (size + (size - 1))) {
                    System.out.println();
                }
            }
        }
    }
}

//   ^
//  ^^^
// ^^^^^
//^^^^^^^
//       ^
//      ^^^
//     ^^^^^
//    ^^^^^^^
//   ^^^^^^^^^
//  ^^^^^^^^^^^
// ^^^^^^^^^^^^^
//^^^^^^^^^^^^^^^
//Exception in thread "main" java.lang.IllegalArgumentException: size > 0
//	at Lesson_4_HomeWork.HomeWorkLoopsConditions.Level2.EquilateralTrianglePrinter.printEquilateralTriangle(EquilateralTrianglePrinter.java:12)
//	at Lesson_4_HomeWork.HomeWorkLoopsConditions.Level2.EquilateralTrianglePrinter.main(EquilateralTrianglePrinter.java:7)
//
//Process finished with exit code 1

