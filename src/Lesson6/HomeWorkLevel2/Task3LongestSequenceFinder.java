package Lesson6.HomeWorkLevel2;

public class Task3LongestSequenceFinder {
    public static void main(String[] args) {
        System.out.println(longestSequence(new int[]{1, 2, 2, 2, 3, 2, 4}));
    }
    public static int longestSequence(int[] array) {
        if (array.length == 0) return 0;
        if (array.length == 1) return 1;
        int count = 1;
        int max = 1;
        int current = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == current) {
                count++;
                if (count > max) max = count;
                continue;
            }
            current = array[i];
            count = 1;

        }
        return max;

    }
}

//Result:
// 3
//
//Process finished with exit code 0


