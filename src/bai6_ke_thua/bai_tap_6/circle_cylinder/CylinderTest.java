package bai6_ke_thua.bai_tap_6.circle_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("Volume: "+cylinder.getVolume());
        Cylinder cylinder1 = new Cylinder(3, 4, "yellow");
        System.out.println(cylinder1);
        System.out.println("Volume: "+cylinder1.getVolume());
        Cylinder cylinder2 = new Cylinder(6);
        System.out.println(cylinder2);
        System.out.println("Volume: "+cylinder2.getVolume());

    }
}
