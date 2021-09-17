package bai6_ke_thua.bai_tap_6.point_moveablepoint;

import java.util.Arrays;

public class Point {
     float x = 0.0f;
     float y = 0.0f;
     float[] xy = {x,y};

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXy() {
        xy = new float[]{this.x, this.y};
        return xy;
    }

    public void setXy(float[] xy) {
        this.xy = xy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", xy=" + Arrays.toString(xy) +
                '}';
    }
}
