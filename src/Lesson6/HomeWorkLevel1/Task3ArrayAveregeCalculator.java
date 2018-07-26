package Lesson6.HomeWorkLevel1;

import java.util.Arrays;

public class Task3ArrayAveregeCalculator {
    public static void main(String[] args) {
        System.out.println(average(new  int[]{5, 10, 2}));
        try {
            System.out.println(average(new  int[]{}));
        } catch (IllegalArgumentException e) {
            System.out.println("array is empty");
        }
    }

    public static int average(int[] a) {
        if (!(a.length > 0)) throw new IllegalArgumentException("incorrect argument:[]");
        int sum = 0;
        for (int element : a){
            sum += element;
        }
        return sum / a.length;
    }
}

//Result:
//5
//array is empty
//
//Process finished with exit code 0