package bai6_ke_thua.bai_tap_6.circle_cylinder;

public class Cylinder extends Circle {
    private double height = 2;

    private double getVolume() {
        return height * Math.PI * Math.pow(getRadius(), 2);
    }

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
