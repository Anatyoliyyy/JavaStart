package Lesson7;

//В классе Words написать метод containsEmptyWord(...), который принимает массив слов и определяет,
// есть ли в этом массиве пустое слово.
//Написать код, тестирующий заданный метод.
//
//Примечание: для проверки эквивалентности строк использовать метод equals(...), а не оператор ==.

public class Task6WordsContainsEmptyWord {

    public static void main(String[] args) {
        String[] s = {"city", "terminator", "clouds"};
        System.out.println(totalLength(s));
        System.out.println(containsEmptyWord(s));

    }

    public static int totalLength(String[] words) {

        int totalLength = 0;
        for (String elem:words){
            int wordLength = elem.length();
            totalLength+=wordLength;
        }
        return totalLength;
    }

    public static boolean containsEmptyWord (String[] words) {
        boolean containsEmptyWords= false;
        for (String elem:words){
            elem.equals(elem);
            if(elem.isEmpty()) {
                containsEmptyWords = true;
            }
        }
        return containsEmptyWords;
    }
}

//Result:
// 20
////false
////
////Process finished with exit code 0