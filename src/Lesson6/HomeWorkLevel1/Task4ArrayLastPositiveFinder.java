package Lesson6.HomeWorkLevel1;

public class Task4ArrayLastPositiveFinder {
    public static void main(String[] args) {
        System.out.println(lastPositiveElem(new int[]{-3, -1, 20, -2, 10, 0}));
        System.out.println(lastPositiveElem(new int[]{-3, -1, -20, -2, -10, 0}));
    }

    public static int lastPositiveElem(int[] array){
        int result = Integer.MIN_VALUE;
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i] >0) return array[i];
        }
        return result;
    }
}

//10
//-2147483648
//
//Process finished with exit code 0
