package Lesson6.HomeWorkLevel1;

import java.util.Arrays;

public class Task6VectorSumCalculator {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(vectorSum(new int[]{10, 30, 20}, new int[]{2, 3})));
        System.out.println(Arrays.toString(vectorSum(new int[]{2, 3}, new int[]{10, 30, 20})));
    }
    public static int[] vectorSum(int[] a, int[] b){
        int[] res = new  int[a.length<b.length ? a.length : b.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = a[i] + b[i];
        }
        return res;
    }
}

//[12, 33]
//[12, 33]
//
//Process finished with exit code 0