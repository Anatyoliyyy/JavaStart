package PrakticsBookExample;

public class T1G {
    public static void main(String[] args) {
        System.out.println(rectangleArea(10, 20));
        System.out.println(rectangleArea(10, 20));

        System.out.println(circleArea(10));
        System.out.println(circleArea(20));
    }
    public static double rectangleArea (double width, double height){
        if (width<=0){
            throw new IllegalArgumentException("width is not positive: "+width);
        }
        if (height<=0){
            throw new IllegalArgumentException("width is not positive: "+height);
        }
        return width*height;
    }
    public static double circleArea (double radius){
        if (radius<=0){
            throw new IllegalArgumentException("radius is not positive:"+radius);
        }
        return Math.PI*Math.pow(radius, 2);
    }
}
