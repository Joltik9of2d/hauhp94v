package bai5_access_modifier_static_method_static_property.bai_tap_5;

public class Circle {
    private double radius = 1;
    private String color = "red";
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius ;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
