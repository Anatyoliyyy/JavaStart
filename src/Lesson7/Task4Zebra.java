package Lesson7;

//В классе Zebra написать метод createZebra(...), который создает массив заданного
// размера и заполняет его поочередно словами ”black” и ”white”.

import java.util.Arrays;

public class Task4Zebra {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createZebra(4)));
        System.out.println(Arrays.toString(createZebra(5)));

    }

    public static String[] createZebra(int size) {
        String[] mas = new String[size];
        for(int i = 0; i < mas.length;i++){
            if(i%2==0) {
                mas[i] = "white";
            }if(i%2!=0){
                mas[i] = "black";
            }
        }
        return mas;
    }
}


//[white, black, white, black]
//[white, black, white, black, white]
//
//Process finished with exit code 0