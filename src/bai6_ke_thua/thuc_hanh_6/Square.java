package bai6_ke_thua.thuc_hanh_6;

import bai7_abstract_class_interface.bai_tap_7.interface_colorable.IColorable;
import bai7_abstract_class_interface.bai_tap_7.interface_resizeable.IResizeable;

public class Square extends Rectangle implements IResizeable, IColorable {
    private double side = 1;
    public Square() {
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public double getArea(){
        return this.getSide()*this.getSide();

    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + this.getSide()
                + ", which is a subclass of "
                + super.toString();

    }

    @Override
    public void resize(double percent) {
        this.side *= Math.sqrt(1+percent/100);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
