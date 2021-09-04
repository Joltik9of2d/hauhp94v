package bai5_access_modifier_static_method_static_property.bai_tap_5;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){
        this.radius = 1.0;
        this.color="red";
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
