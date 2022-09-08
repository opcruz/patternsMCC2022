package patterns.example.adapter.classadapter;

import patterns.example.adapter.library1.Shape;
import patterns.example.adapter.library2.Rhombus;

public class RhombusAdapter extends Rhombus implements Shape {

    public RhombusAdapter() {
        super();
    }

    public RhombusAdapter(double a, double b) {
        super(a, b);
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Rhombus can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        return "Rhombus object";
    }

}