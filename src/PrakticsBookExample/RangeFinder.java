package PrakticsBookExample;

import java.util.Arrays;

public class RangeFinder {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shapesFromRange(new double[]{150,50,120,100,199,200,250},100,200)));

    }
    public static double[] shapesFromRange(double[] shapes, double minShapes, double maxShapes) {
        if (minShapes>maxShapes){
            throw new IllegalArgumentException("Error. MinShapes must be less than maxShapes");
        }
        int sizeNewArr=0;
        for (int i = 0; i < shapes.length; i++) {
            sizeNewArr +=quantityValuesInRange(shapes[i], minShapes, maxShapes);
        }
        double [] shapesInRange = new double[sizeNewArr];
        int indexShapesInRange = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i]<=maxShapes && shapes[i]>=minShapes){
                shapesInRange[indexShapesInRange]=shapes[i];
                indexShapesInRange++;
            }
        }
        return shapesInRange;
    }
    public static int quantityValuesInRange (double value, double minRange, double maxRange){
        int count =0;
        if (value>=minRange && value<=maxRange){
            count++;
        }
        return count;
    }
}
