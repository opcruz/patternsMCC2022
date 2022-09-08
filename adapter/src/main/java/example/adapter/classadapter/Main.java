package example.adapter.classadapter;

import example.adapter.library1.Drawing;
import example.adapter.library1.Circle;
import example.adapter.library1.Rectangle;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        drawing.addShape(new TriangleAdapter(2.0, 3.0, 4.0));
        drawing.addShape(new RhombusAdapter(4.0, 5.0));

        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();
    }

}
