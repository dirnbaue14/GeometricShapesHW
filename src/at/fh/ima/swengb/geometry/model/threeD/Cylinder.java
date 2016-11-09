package at.fh.ima.swengb.geometry.model.threeD;

import at.fh.ima.swengb.geometry.model.GeometricShape;

/**
 * Created by DC on 08.11.16.
 */
public class Cylinder extends ThreeDimensional {

    private double radius;
    private double height;

    public Cylinder(int x, int y, double radius, double height) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cylinder cylinder = (Cylinder) o;

        if (Double.compare(cylinder.radius, radius) != 0) return false;
        return Double.compare(cylinder.height, height) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }

    @Override
    public double calculateVolume() {
        return Math.PI*radius*radius*height;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2*Math.PI*radius*(radius+height);
    }
}
