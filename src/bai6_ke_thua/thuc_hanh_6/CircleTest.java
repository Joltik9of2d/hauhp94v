package bai6_ke_thua.thuc_hanh_6;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        Circle c1 = new Circle(4,"while",true);
        System.out.println(c1);
        c1.resize(100);
        System.out.println("Diện tích hình tròn sau khi tăng 100%: ");
        System.out.println(c1.getArea());
    }
}