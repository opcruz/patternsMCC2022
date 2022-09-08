package patterns.example.adapter.classadapter;

import patterns.example.adapter.library1.Shape;
import patterns.example.adapter.library2.Triangle;

public class TriangleAdapter extends Triangle implements Shape {

    public TriangleAdapter() {
        super();
    }

    public TriangleAdapter(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Triangle can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        return "Triangle object";
    }

}