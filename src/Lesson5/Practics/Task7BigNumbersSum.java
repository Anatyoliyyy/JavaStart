package Lesson5.Practics;

public class Task7BigNumbersSum {
    public static void main(String[] args) {
        String string1 = "100";
        String string2 = "356";

        int numbers1[] = new int[string1.length()];
        int numbers2[] = new int[string2.length()];

        for (int i = 0; i < string1.length(); i++) {
            numbers1[i] = Character.digit(string1.charAt(i), 10);
        }
        for (int i = 0; i < string2.length(); i++) {
            numbers2[i] = Character.digit(string2.charAt(i), 10);
        }
        long sum1 = 0;
        for (int i = 0, j = (numbers1.length) - 1; i < numbers1.length; i++, j--) {
            int dec = (int) Math.pow(10, j);
            sum1 += numbers1[i] * dec;
        }
        long sum2 = 0;
        for (int i = 0, j = (numbers2.length) - 1; i < numbers2.length; i++, j--) {
            int dec = (int) Math.pow(10, j);
            sum2 += numbers2[i] * dec;
        }
        long sumOut = sum1 + sum2;

        System.out.print(Long.toString(sumOut));
    }
}

//456
//Process finished with exit code 0
