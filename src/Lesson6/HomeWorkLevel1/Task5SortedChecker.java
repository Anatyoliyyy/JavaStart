package Lesson6.HomeWorkLevel1;

public class Task5SortedChecker {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{10, 20, 50}));
        System.out.println(isSorted(new int[]{10, 10, 10}));
        System.out.println(isSorted(new int[]{10, 50, 20}));
    }

    public static boolean isSorted(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1]) return false;

        }
        return true;
    }
}

//true
//true
//false
//
//Process finished with exit code 0