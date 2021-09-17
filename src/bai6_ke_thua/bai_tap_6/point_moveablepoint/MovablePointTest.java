package bai6_ke_thua.bai_tap_6.point_moveablepoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        MovablePoint movablePoint1 = new MovablePoint(3,4);
        System.out.println(movablePoint1);
        MovablePoint movablePoint2= new MovablePoint(5,6,10,20);
        movablePoint2.getSpeed();
        movablePoint2.move();
        System.out.println(movablePoint2);
    }
}
