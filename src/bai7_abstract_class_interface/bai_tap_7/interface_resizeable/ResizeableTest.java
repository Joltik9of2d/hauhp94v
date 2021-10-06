package bai7_abstract_class_interface.bai_tap_7.interface_resizeable;

import bai6_ke_thua.thuc_hanh_6.Circle;
import bai6_ke_thua.thuc_hanh_6.Rectangle;
import bai6_ke_thua.thuc_hanh_6.Shape;
import bai6_ke_thua.thuc_hanh_6.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2, "yellow", false);
        shapes[1] = new Rectangle(4, 3, "infinity", true);
        shapes[2] = new Square(5);
        for (Shape a : shapes){
            System.out.println(a);
        }
        System.out.println("Sau khi resizeable: ");
        for (Shape a : shapes) {
//            a.resize(100);
            a.resize(Math.random() * 100);
        }
        for (Shape a : shapes){
            System.out.println(a);
        }

    }
}
