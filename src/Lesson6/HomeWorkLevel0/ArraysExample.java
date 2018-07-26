package Lesson6.HomeWorkLevel0;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        //1 Создать массив на 30 элементов типа boolean.
        boolean[] boolArray = new boolean[30];

        //2 Создать массив заполненый значениями: 10.2, 5.6, 7.8, 11.9.
        double[] doubleArray = new double[]{10.2, 5.6, 7.8, 11.9};

        //3 Задан массив  int[] аrray. Определить длину массива.
        int[] someArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = someArray.length;

        //4 Задан массив  int[] аrray. Превратить массив в строку, используя класс Arrays.
        String s = Arrays.toString(someArray);

        //5 Задан массив  int[] аrray. Заполнить массив чмслом 42, используя класс Arrays.
        int filler = 42;
        for (int i = 0; i < length; i++) {
            someArray[i] = filler;
        }
        System.out.println(Arrays.toString(someArray));
        //Result:
        //[42, 42, 42, 42, 42, 42, 42, 42, 42]

        //6 Задан массив  int[] аrray. Отсортировать массив, используя класс Arrays.
        Arrays.sort(someArray);

        //7 Задан массив  int[] аrray. Вывести в консоль индексы всех положительных элементов.
        int[] examplArray = new int[]{1, 2, -4, 6, -7, 8, 9};
        for (int i = 0; i < examplArray.length; i++) {
            if (examplArray[i] > 0) System.out.print(i);
        }
        System.out.println();
        //Result:
        //2 4

        //8 Задан массив  int[] аrray. Вывести в консоль все положительные элементы, используя цикл for-each.
        for (int element : examplArray) {
            if (element > 0) System.out.print(element + " ");
        }
        System.out.println();
        //Result
        //1 2 6 9

        //9 Задан массив  int[] аrray. Вывести в консоль все положительные элементы в обратном порядке.
        for (int i = examplArray.length - 1; i >= 0; i--) {
            if (examplArray[i] > 0) System.out.print(examplArray[i] + " ");
        }
        System.out.println();
        //Result
        //9 6 2 1
    }
}
