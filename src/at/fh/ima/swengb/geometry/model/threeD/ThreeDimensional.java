package at.fh.ima.swengb.geometry.model.threeD;

import at.fh.ima.swengb.geometry.model.GeometricShape;

/**
 * Created by DC on 08.11.16.
 */
public abstract class ThreeDimensional extends GeometricShape {

    public abstract double calculateVolume();

    public abstract double calculateSurfaceArea();
}
