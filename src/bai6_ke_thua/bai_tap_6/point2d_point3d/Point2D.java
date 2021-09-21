package bai6_ke_thua.bai_tap_6.point2d_point3d;

import java.util.Arrays;

public class Point2D {
    public float x = 1.0f;
    public float y = 1.0f;
    public float[] xy = {x, y};
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
//        xy = new float[]{this.x, this.y};
    }
    public Point2D() {
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
//        xy= new float[]{this.x, this.y};
//        xy[0] = this.x;
//        xy[1] = this.y;
        xy= new float[]{this.x, this.y};
        return xy;
    }

    public void setXy(float[] xy) {

        this.xy = xy;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", xy=" + Arrays.toString(xy) +
                '}';
    }
}
