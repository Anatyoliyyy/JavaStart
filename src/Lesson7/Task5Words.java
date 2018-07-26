package Lesson7;

//В классе Words написать метод totalLength(...), который принимает массив слов
// и подсчитывает суммарную длину всех слов.
//Написать код, тестирующий заданный метод.
//
//public static int totalLength(String[] words) { … }

public class Task5Words {
    public static void main(String[] args) {
        String[] s = {"city", "terminator", "clouds"};
        System.out.println(totalLength(s));

    }

    public static int totalLength(String[] words) {

        int totalLength = 0;
        for (String elem:words){
            int wordLength = elem.length();
            totalLength+=wordLength;
        }
        return totalLength;
    }
}

//Result:
//20
//
//Process finished with exit code 0