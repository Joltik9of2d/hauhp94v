package bai6_ke_thua.bai_tap_6.circle_cylinder;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(2, "red");
        System.out.println(circle1);
    }
}
