package Lesson7.Practic;

//Задача 3
//
//В классе Geometry создать новый метод circleArea(...), вычисляющий площадь круга по заданному радиусу.
//Протестировать написанный метод для кругов с радиусами 10, 20 и -10.
//Площадь прямоугольника: π*radius2.
//Использовать Math.PI и Math.pow(...).

public class ArreaCalculator {
    public static void main(String[] args) {
        System.out.println(rectangleArea(10, 20));
        System.out.println(rectangleArea(30, 20));
        System.out.println(circleArea(10));
        System.out.println(circleArea(20));
        System.out.println(circleArea(-10));

    }

    public static double rectangleArea(double width, double height) {
        if (width <= 0) {
            throw new IllegalArgumentException("width is not positive: " + width);
        }
        if (height <= 0) {
            throw new IllegalArgumentException("height is not positive: " + height);

        }
        return width * height;
    }

    public static double circleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius is not positive:" + radius);
        }
        return Math.PI * Math.pow(radius, 2);
    }
}

//200.0
//600.0
//314.1592653589793
//1256.6370614359173
//Exception in thread "main" java.lang.IllegalArgumentException: radius is not positive:-10.0
//	at Lesson7.Practic.ArreaCalculator.circleArea(ArreaCalculator.java:26)
//	at Lesson7.Practic.ArreaCalculator.main(ArreaCalculator.java:9)
//
//Process finished with exit code 1
