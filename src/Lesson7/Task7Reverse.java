package Lesson7;

//Написать метод reverse(...), который переворачивает массив без создания дополнительного массива.
//
//public static void reverse(int[] array) { … }
//
//Пример использования:
//int[] array = {10, 30, 20};
//reverse(array);
//System.out.println(array); // [20, 30, 10]

import java.util.Arrays;

public class Task7Reverse {

    public static void main(String[] args) {
        int[] array = {10, 30, 20};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
        }
    }
}


//Result:
// [20, 30, 10]
//
//Process finished with exit code 0


