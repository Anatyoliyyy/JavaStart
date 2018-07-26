package Lesson6.HomeWorkLevel1;

public class Task2ArrayPositivesCounter {
    public static void main(String[] args) {
        System.out.println(countPositives(new  int[] {
            -3, 0, -1, 4, -2, 5
        }));
        System.out.println(countPositives(new int[] {
            -3, 0, -1, -4, -2, -5
        }));
        System.out.println(countPositives(new int[] {
        }));
    }

    public static int countPositives(int[] array) {
        int result = 0;
        for (int element : array) {
            result += element > 0 ? 1 : 0;
        }
        return result;
    }

}

//2
//0
//0