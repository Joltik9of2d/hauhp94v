package bai5_access_modifier_static_method_static_property.bai_tap_5;

public class TestCircle {
    public static void main(String[] args) {
    Circle c1 = new Circle();
    System.out.println(c1.getColor()+" "+ c1.getRadius());
    Circle c2 = new Circle(2.0,"blue" );
        System.out.println(c2.getColor()+ " "+ c2.getRadius());
}
}
