package Lesson6.HomeWorkLevel2;

public class Task4BalanceChecker {
    public static void main(String[] args) {
        System.out.println(isBalanced(new int[]{1, 1, 1, 2, 1}));
        System.out.println(isBalanced(new int[]{2, 1, 1, 2, 1}));
        System.out.println(isBalanced(new int[]{1, 1}));
        try {
            System.out.println(isBalanced(new int[]{}));
        } catch (IllegalArgumentException e) {
            System.out.println("array is empty");
        }
    }

    public static boolean isBalanced(int[] array) {
        if (array.length == 0) throw new IllegalArgumentException();
        if (array.length == 1) return false;

        for (int i = 1; i < array.length; i++) {
            int sumLeft = 0;
            for (int j = 0; j < i; j++) {
                sumLeft+=array[j];
            }
            int sumRight = 0;
            for (int j = i; j < array.length; j++) {
                sumRight+=array[j];
            }
            if (sumLeft==sumRight) return true;

        }
        return false;
    }
}

//true
//false
//true
//array is empty
//
//Process finished with exit code 0