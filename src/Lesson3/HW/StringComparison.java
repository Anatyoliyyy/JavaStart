package Lesson3.HW;

public class StringComparison {
    public static void main(String[] args) {
        String a = "Notebook";
        String b = "notebook";
        boolean result = a.equals(b);
        System.out.println(result);
        /* result - false */


        boolean result2 = a.equalsIgnoreCase(b);
        System.out.println(result2);
        /*result - true */
    }
}
