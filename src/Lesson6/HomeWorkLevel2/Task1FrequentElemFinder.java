package Lesson6.HomeWorkLevel2;

import java.util.HashMap;

public class Task1FrequentElemFinder {
    public static void main(String[] args) {
        System.out.println(frequentElem(new int[]{4, 5, 2, 5, 0, 3}));
        System.out.println(frequentElem(new int[]{4, 2, 5, 2, 5, 0, 3}));
        try {
            System.out.println(frequentElem(new int[]{}));
        } catch (IllegalArgumentException e) {
            System.out.println("array is empty");
        }
    }

    public static int frequentElem(int[] array){
        if (array.length==0) throw new  IllegalArgumentException("array is empty: []");
        HashMap<Integer, Integer> dict = new HashMap<>();
        for (int element : array){
            if (dict.containsKey(element)){
                dict.put(element, dict.get(element)+1);
            }else {
                dict.put(element, 1);
            }
        }
        int maxFreq = 0;
        int result = array[0];
        for (int element: dict.keySet() ) {
            if (dict.get(element) > maxFreq) {
                result = element;
                maxFreq = dict.get(element);
            }
        }
        return result;
    }
}

//Result:
//5
//2
//array is empty
//
//Process finished with exit code 0




