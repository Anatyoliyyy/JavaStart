package Lesson6.HomeWorkLevel1;

import java.util.Arrays;

public class Task1SequenceCreator {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createSequence(5)));
        System.out.println(Arrays.toString(createSequence(0)));
        try {
            System.out.println(Arrays.toString(createSequence(-5)));
        } catch (IllegalArgumentException e) {
            System.out.println("array is empty");
        }
    }

    public static int[] createSequence(int size){
        if (size<0) throw new IllegalArgumentException("wrong argument: "+ size);
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i]=i;

        }
        return result;
    }
}

//Result:
//[0, 1, 2, 3, 4]
//[]
//array is empty
//
//Process finished with exit code 0

