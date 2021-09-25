package bai5_access_modifier_static_method_static_property.bai_tap_5;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Area: " + c1.getArea() + " Radius: " + c1.getRadius());
        Circle c2 = new Circle(2.0);
        System.out.println("Area: " + c2.getArea() + " Radius: " + c2.getRadius());

    }
}
