package at.fh.ima.swengb.geometry.model.twoD;

/**
 * Created by DC on 08.11.16.
 */
public class Square extends TwoDimensional {

    private double SideA;

    public Square(int x, int y, double sideA) {
        this.x = x;
        this.y = y;
        SideA = sideA;
    }

    public double getSideA() {
        return SideA;
    }

    public void setSideA(double sideA) {
        SideA = sideA;
    }

    @Override
    public double calculateArea() {
        return SideA*SideA;
    }

    @Override
    public double calculatePerimeter() {
        return SideA*4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Square square = (Square) o;

        return Double.compare(square.SideA, SideA) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(SideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Square{" +
                "SideA=" + SideA +
                '}';
    }
}
