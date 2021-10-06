package bai6_ke_thua.thuc_hanh_6;

import bai7_abstract_class_interface.bai_tap_7.interface_resizeable.IResizeable;

public class Circle extends Shape implements IResizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString()
                +" Diện tích: "+ getArea();
    }

    @Override
    public void resize(double percent) {
        this.radius *= Math.sqrt(1+percent/100);
    }
}