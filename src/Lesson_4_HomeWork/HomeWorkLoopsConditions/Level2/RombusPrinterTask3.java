package Lesson_4_HomeWork.HomeWorkLoopsConditions.Level2;

public class RombusPrinterTask3 {
    public static void main(String[] args) {
        printRhombus(5);
    }

    public static void printRhombus(int size) {
        if (size <= 0 || size % 2 == 0) {
            throw new IllegalArgumentException();
        }

        int halfOfRhombus = size / 2;
        for (int i = 0; i < halfOfRhombus; i++) {
            for (int j = 0; j <= size - 1; j++) {
                if ((j == halfOfRhombus - i) || (j == halfOfRhombus + i)) {
                    System.out.print("*\t");
                } else {
                    System.out.print(".\t");
                }
            }
            System.out.println();
        }
        for (int i = halfOfRhombus; i >= 0; i--) {
            for (int j = 0; j <= size - 1; j++) {
                if ((j == halfOfRhombus - i) || (j == halfOfRhombus + i)) {
                    System.out.print("*\t");
                } else {
                    System.out.print(".\t");
                }
            }
            System.out.println();
        }
    }
}

//Enter: 5
//.	.	*	.	.
//.	*	.	*	.
//*	.	.	.	*
//.	*	.	*	.
//.	.	*	.	.
//
//Process finished with exit code 0

//Enter: 4
//Exception in thread "main" java.lang.IllegalArgumentException
//	at Lesson_4_HomeWork.HomeWorkLoopsConditions.Level2.RombusPrinterTask3.printRhombus(RombusPrinterTask3.java:10)
//	at Lesson_4_HomeWork.HomeWorkLoopsConditions.Level2.RombusPrinterTask3.main(RombusPrinterTask3.java:5)
//
//Process finished with exit code 1


//Enter: -5
//Exception in thread "main" java.lang.IllegalArgumentException
//	at Lesson_4_HomeWork.HomeWorkLoopsConditions.Level2.RombusPrinterTask3.printRhombus(RombusPrinterTask3.java:10)
//	at Lesson_4_HomeWork.HomeWorkLoopsConditions.Level2.RombusPrinterTask3.main(RombusPrinterTask3.java:5)
//
//Process finished with exit code 1
