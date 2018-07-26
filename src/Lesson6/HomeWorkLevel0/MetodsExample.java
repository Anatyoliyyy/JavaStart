package Lesson6.HomeWorkLevel0;

public class MetodsExample {
    public static void main(String[] args) {

    }

    //1 Создать метод, суммирующий 2 числа. int sum(int a, int b)
    public static int sum(int a, int b) {
        return a + b;
    }

    //2 Создать метод, определяющий, является ли число возрастом. Возвраст человека - число от 1 до 120. isAge(int n)
    public static boolean isAge(int age) {
        return age > 0 && age < 121;
    }

    //3 Создать метод, находящий последний символ в строке. Если строка пустая, бросить исключение IllegalArgumentException.
    // char lastChar(String s)
    public static char lastChar(String s) {
        if (s.isEmpty()) throw new IllegalArgumentException("string is empty");
        return s.charAt(s.length() - 1);
    }

    //4 4.	Создать метод, подсчитывающий сумму всех чисел от from до to: from + (from+1) + (from+2) + … + to.
    // Если from > to, бросить исключение IllegalArgumentException.
    // int rangeSum(int from, int to)
    public static int rangeSum(int from, int to){
        if (from > to) throw new IllegalArgumentException("wrong arguments: from=\"" + from + "\" to =\"" + to + "\"");
        int result = 0;
        for (int i = from; i <= to; i++) {
            result += i;

        }
        return result;
    }

    //5 Создать метод, печатающий четные числа от from до to. Если from > to, бросить исключение IllegalArgumentException.
    // void printEvens(int from. int to)
    public static void printEvens (int from, int to) {
        if (from > to) throw new IllegalArgumentException("wrong arguments: from=\"" + from + "\" to=\"" + to + "\"");
        for (int i = from; i <=to ; i++) {
            if (i%2 == 0) System.out.print(i + " ");
        }
        System.out.println();
    }
}
