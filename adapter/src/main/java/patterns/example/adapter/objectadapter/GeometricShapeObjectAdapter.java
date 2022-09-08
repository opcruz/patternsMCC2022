package patterns.example.adapter.objectadapter;

import patterns.example.adapter.library1.Shape;
import patterns.example.adapter.library2.GeometricShape;
import patterns.example.adapter.library2.Rhombus;
import patterns.example.adapter.library2.Triangle;

public class GeometricShapeObjectAdapter implements Shape {

    private GeometricShape adapted;

    public GeometricShapeObjectAdapter(GeometricShape adapted) {
        super();
        this.adapted = adapted;
    }

    @Override
    public void draw() {
        adapted.drawShape();
    }

    @Override
    public void resize() {
        System.out.println(description() + " can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        if (adapted instanceof Triangle) {
            return "Triangle object";
        } else if (adapted instanceof Rhombus) {
            return "Rhombus object";
        } else {
            return "Unknown object";
        }
    }
}