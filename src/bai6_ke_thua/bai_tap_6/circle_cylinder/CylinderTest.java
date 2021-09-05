package bai6_ke_thua.bai_tap_6.circle_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(3, 4, "yellow");
        System.out.println(cylinder1);
        Cylinder cylinder2 = new Cylinder(6);
        System.out.println(cylinder2);
    }
}
