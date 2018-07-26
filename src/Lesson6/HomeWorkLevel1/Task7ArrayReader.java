package Lesson6.HomeWorkLevel1;
import java.util.Arrays;
import java.util.Scanner;

public class Task7ArrayReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(readArrey(scanner)));
    }
    public static int[] readArrey(Scanner scanner){
        int size = scanner.nextInt();
        int[] res = new int[size];
        for (int i = 0; i < res.length; i++) {
            res[i] = scanner.nextInt();

        }
        return res;
    }
}

//3
//10 30 20
//
//Result:
// [10, 30, 20]
//
//Process finished with exit code 0