package at.fh.ima.swengb.geometry.model.threeD;

/**
 * Created by DC on 08.11.16.
 */
public class Cube extends ThreeDimensional {

    private double sideA;

    public Cube(int x, int y, double sideA) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cube cube = (Cube) o;

        return Double.compare(cube.sideA, sideA) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "sideA=" + sideA +
                '}';
    }

    @Override
    public double calculateVolume() {
        return sideA*sideA*sideA;
    }

    @Override
    public double calculateSurfaceArea() {
        return sideA*sideA*6;
    }
}
