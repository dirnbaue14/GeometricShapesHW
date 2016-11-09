package at.fh.ima.swengb.geometry.model.twoD;

import at.fh.ima.swengb.geometry.model.GeometricShape;

/**
 * Created by DC on 08.11.16.
 */
public abstract class TwoDimensional extends GeometricShape {

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "TwoDimensional!!!!!!!!!!!!!{}";
    }
}
