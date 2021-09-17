package bai6_ke_thua.bai_tap_6.point_moveablepoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    public float xSpeed = 0.0f;
    public float ySpeed = 0.0f;
    public float[] Speed = new float[2];
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y) {
        super(x, y);
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        Speed = new float[]{this.xSpeed, this.ySpeed};
        return Speed;
    }

    public void setSpeed(float[] speed) {
        Speed = speed;
    }
    public MovablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "Speed=" + Arrays.toString(Speed) +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
