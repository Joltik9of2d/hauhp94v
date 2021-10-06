package bai7_abstract_class_interface.bai_tap_7.interface_colorable;

import bai6_ke_thua.thuc_hanh_6.Circle;
import bai6_ke_thua.thuc_hanh_6.Rectangle;
import bai6_ke_thua.thuc_hanh_6.Shape;
import bai6_ke_thua.thuc_hanh_6.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2, "yellow", false);
        shapes[1] = new Rectangle(4, 3, "infinity", true);
        shapes[2] = new Square(5, "melinda", true);
        for (Shape a : shapes){
            if(a instanceof Square){
                ((Square) a).howToColor();
            }
        }
    }
}
