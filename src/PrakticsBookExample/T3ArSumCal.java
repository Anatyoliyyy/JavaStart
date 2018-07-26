package PrakticsBookExample;

public class T3ArSumCal {
    public static void main(String[] args) {
        double[] rs = {10, 20};
        double areaSum = circleAreasSum(rs);
        System.out.println(areaSum);
    }
    public static double circleAreasSum(double[] radiuses) {
        double areasSum = 0;
        for (double radius : radiuses) {
            double area = T1G.circleArea(radius);
            areasSum += area;
        }
        return areasSum;
    }
    public static double circleAreasSumV1(double[] radiuses) {
        double[] areas = new double[radiuses.length];
        for (int i = 0; i < radiuses.length; i++) {
            areas[i] = T1G.circleArea(radiuses[i]);
        }
        double areasSum = 0;
        for (int i = 0; i < areas.length; i++) {
            areasSum += areas[i];
        }
        return areasSum;
    }

    public static double circleAreasSumV2(double[] radiuses) {
        double areasSum = 0;
        for (int i = 0; i < radiuses.length; i++) {
            double area = T1G.circleArea(radiuses[i]);
            areasSum += area;
        }
        return areasSum;
    }
}
