package Lesson3.HW;

public class FindSymbol {
    public static void main(String[] args) {
        String a = "Elephants go to north";
        char result = a.charAt(0);
        System.out.println(result);
        /* result - E */

        int result2 = a.indexOf("to");
        System.out.println(result2);
        /* result - 13 */
    }
}
