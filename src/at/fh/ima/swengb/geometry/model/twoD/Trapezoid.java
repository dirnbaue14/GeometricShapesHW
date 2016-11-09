package at.fh.ima.swengb.geometry.model.twoD;


/**
 * Created by DC on 08.11.16.
 */
public class Trapezoid extends TwoDimensional {

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double height;

    public Trapezoid(int x, int y, double sideA, double sideB, double sideC, double sideD, double height) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideD() {
        return sideD;
    }

    public void setSideD(double sideD){
        this.sideD = sideD;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return sideA+sideC/2*height;
    }

    @Override
    public double calculatePerimeter() {
        return sideA+sideB+sideC+sideD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Trapezoid trapezoid = (Trapezoid) o;

        if (Double.compare(trapezoid.sideA, sideA) != 0) return false;
        if (Double.compare(trapezoid.sideB, sideB) != 0) return false;
        if (Double.compare(trapezoid.sideC, sideC) != 0) return false;
        if (Double.compare(trapezoid.sideD, sideD) != 0) return false;
        return Double.compare(trapezoid.height, height) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideD);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", sideD=" + sideD +
                ", height=" + height +
                '}';
    }
}
