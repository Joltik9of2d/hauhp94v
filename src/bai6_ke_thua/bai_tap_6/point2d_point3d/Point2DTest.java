package bai6_ke_thua.bai_tap_6.point2d_point3d;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,3);
        float[] a = point2D.getXy();
        System.out.println(Arrays.toString(a));
        System.out.println(point2D);
        Point2D point2D1 = new Point2D();
        System.out.println(point2D1);

    }
}
