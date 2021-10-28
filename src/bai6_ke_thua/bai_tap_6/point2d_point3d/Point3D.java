package bai6_ke_thua.bai_tap_6.point2d_point3d;

import java.util.Arrays;

public class Point3D extends Point2D{
    public float z = 0.0f;
    public Point3D(){

    }
    public Point3D(float x,float y, float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXyz() {
        return new float[]{this.x, this.y, this.z};
    }
    @Override
    public String toString() {
        return "Point3D{" +
                " x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", xyz=" + Arrays.toString(getXyz()) +
                '}';
    }
}
