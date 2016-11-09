package at.fh.ima.swengb.geometry;

import at.fh.ima.swengb.geometry.model.threeD.Cube;
import at.fh.ima.swengb.geometry.model.threeD.Cylinder;
import at.fh.ima.swengb.geometry.model.threeD.Sphere;
import at.fh.ima.swengb.geometry.model.threeD.ThreeDimensional;
import at.fh.ima.swengb.geometry.model.twoD.Square;
import at.fh.ima.swengb.geometry.model.twoD.Trapezoid;
import at.fh.ima.swengb.geometry.model.twoD.Triangle;
import at.fh.ima.swengb.geometry.model.twoD.TwoDimensional;

import java.util.*;

/**
 * Created by DC on 08.11.16.
 */
public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.doIt();
    }

    private void doIt() {

        List<TwoDimensional> twoDimensionalShapes = new ArrayList<>();
        List<ThreeDimensional> threeDimensionalShapes = new ArrayList<>();

        fill2DList(twoDimensionalShapes);
        fill3DList(threeDimensionalShapes);
        printResult2D(twoDimensionalShapes);
        printResult3D(threeDimensionalShapes);
    }

    private void fill2DList(List<TwoDimensional> shapeList) {

        shapeList.add(new Square(3,4,5.0));
        shapeList.add(new Square(3,4,5.0));
        shapeList.add(new Triangle(3,4,4.0,5.0,6.0,3.5));
        shapeList.add(new Triangle(3,4,4.0,5.0,6.0,3.5));
        shapeList.add(new Trapezoid(3,4,6.0,3.0,4.5,6.5,12.0));
        shapeList.add(new Trapezoid(3,4,6.0,3.0,4.5,6.5,12.0));
    }

    private void fill3DList(List<ThreeDimensional> shapeList) {

        shapeList.add(new Cube(5,6,4.2));
        shapeList.add(new Cube(5,3,7.5));
        shapeList.add(new Cylinder(4,1,5.0,3.6));
        shapeList.add(new Cylinder(4,2,6.6,12));
        shapeList.add(new Sphere(6,8,14.0));
        shapeList.add(new Sphere(12,8,12.1));
    }

    private void printResult2D(List<TwoDimensional> shapeList) {
        double sumArea = 0;
        double sumPerimeter = 0;
        for (TwoDimensional shape : shapeList) {
            sumArea += shape.calculateArea();
            sumPerimeter += shape.calculatePerimeter();
        }
        System.out.println("Sum of areas: "+ String.format("%.2f", sumArea) +"; sum of perimeters: " + String.format("%.2f", sumPerimeter));
    }
    private void printResult3D(List<ThreeDimensional> shapeList) {
        double sumSurface = 0;
        double sumVolume = 0;
        for (ThreeDimensional shape : shapeList) {
            sumSurface += shape.calculateSurfaceArea();
            sumVolume += shape.calculateVolume();
        }
        System.out.println("Sum of surface areas: "+ String.format("%.2f", sumSurface) +"; sum of volumes: " + String.format("%.2f", sumVolume));
    }

}
