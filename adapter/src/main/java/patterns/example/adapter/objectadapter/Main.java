package patterns.example.adapter.objectadapter;

import patterns.example.adapter.library1.Circle;
import patterns.example.adapter.library1.Drawing;
import patterns.example.adapter.library1.Rectangle;
import patterns.example.adapter.library2.Rhombus;
import patterns.example.adapter.library2.Triangle;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();

        // expected objects -> no problems
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        // objects from other library (not implement expected Shape interface)
        // Adapted with object adapter GeometricShapeObjectAdapter
        drawing.addShape(new GeometricShapeObjectAdapter(new Triangle(25.0, 14.0, 15.0)));
        drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus(10.0, 15.0)));

        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();

    }

}
