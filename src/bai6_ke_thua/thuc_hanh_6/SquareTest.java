package bai6_ke_thua.thuc_hanh_6;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);
        square = new Square(5.8, "yellow", true);
        System.out.println(square);
        square.howToColor();
        Square s1 = new Square(2);
        System.out.println("Diện tích square trước khi tăng: "+s1.getArea());
        System.out.println("Diện tích square sau khi tăng 50%: ");
        s1.resize(50);
        System.out.println(s1.getArea());
    }
}

