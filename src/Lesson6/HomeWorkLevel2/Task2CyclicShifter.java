package Lesson6.HomeWorkLevel2;

public class Task2CyclicShifter {
    public static void main(String[] args) {
        cyclicShifter(new  int[]{0, 1, 2, 3, 4}, 1);
        cyclicShifter(new  int[]{0, 1, 2, 3, 4}, -1);
        cyclicShifter(new  int[]{0, 1, 2, 3, 4}, 0);
        cyclicShifter(new  int[]{0, 1, 2, 3, 4}, 5);

    }
    public static void cyclicShifter(int[] array, int shiftPositions){
        if (array.length == 0 || shiftPositions % array.length == 0){
            printArray(array);
            return;
        }
        int[] temp = new  int[array.length];
        int shift = shiftPositions % array.length;

        int pos = (array.length + shift) % array.length;
        for (int anArray : array){
            temp[pos] = anArray;
            pos++;
            if (pos == array.length){
                pos = 0;
            }
        }
        printArray(temp);
    }

    private static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+((i == array.length-1) ? "" : ", "));

        }
        System.out.println("]");
    }
}

//[4, 0, 1, 2, 3]
//[1, 2, 3, 4, 0]
//[0, 1, 2, 3, 4]
//[0, 1, 2, 3, 4]
//
//Process finished with exit code 0
