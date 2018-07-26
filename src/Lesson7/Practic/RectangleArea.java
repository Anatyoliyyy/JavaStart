package Lesson7.Practic;

//Задача 2
//
//Дополнить метод rectangleArea(...) проверкой входных значений.
// Если ширина или высота меньше или равна 0, бросить исключение IllegalArgumentException.

public class RectangleArea {
    public static void main(String[] args) {
        System.out.println(rectangleArea(10, 20));
        System.out.println(rectangleArea(30, 20));

    }

    public static double rectangleArea(double width, double height){
        if (width<=0){
            throw new IllegalArgumentException("width is not positive: " +width);
        }
        if (height<=0){
            throw new IllegalArgumentException("height is not positive: " +height);
        }
        return width*height;

    }
}

//200.0
//600.0
//
//Process finished with exit code 0

