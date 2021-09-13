package bai6_ke_thua.bai_tap_6.point2d_point3d;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        Point3D point3D1 = new Point3D(2,3,4);
        point3D1.getXyz();
        System.out.println(point3D1);
    }
}
