package bai6_ke_thua.bai_tap_6.point2d_point3d;

import java.util.Arrays;

public class Point3D extends Point2D{
    public float z = 0.0f;
    public float[] xyz = new float[3];
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
        xyz = new float[]{this.x, this.y, this.z};
        return xyz;
    }

    public void setXyz(float[] xyz) {
        this.xyz = new float[]{x, y, z};
    }


    @Override
    public String toString() {
        return "Point3D{" +
                "xyz=" + Arrays.toString(xyz) +
                '}';
    }
}
