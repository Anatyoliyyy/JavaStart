package Lesson7.Practic;

//Задача 1
//Создать класс Geometry.
//В этом классе создать метод rectangleArea(...), вычисляющий площадь прямоугольника по заданным ширине и высоте.
//Протестировать написанный метод для прямоугольников размером 10 x 20 и 30 x 20.
//Площадь прямоугольника: width * height.

public class Geometry {
    public static void main(String[] args) {
        System.out.println(rectangleArea(10, 20));
        System.out.println(rectangleArea(30, 20));

    }

    public static double rectangleArea(double width, double height){
        return width*height;

    }
}

//200.0
//600.0
//
//Process finished with exit code 0