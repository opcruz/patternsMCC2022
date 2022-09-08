# Adapter Design Pattern

- The adapter design pattern is a structural design pattern that allows two unrelated/uncommon interfaces to work together. In other words, the adapter pattern makes two incompatible interfaces compatible without changing their existing code.

- Interfaces may be incompatible, but the inner functionality should match the requirement.

- The adapter pattern is often used to make existing classes work with others without modifying their source code.

- Adapter patterns use a single class (the adapter class) to join functionalities of independent or incompatible interfaces/classes.

- The adapter pattern also is known as the wrapper, an alternative naming shared with the decorator design pattern.

- This pattern converts the (incompatible) interface of a class (the adaptee) into another interface (the target) that clients require.

- The adapter pattern also lets classes work together, which, otherwise, couldn't have worked, because of the incompatible interfaces.

To better understand this, let's look at an example of geometric shapes. I am keeping the example relatively simple to keep the focus on the pattern. Suppose we have a project of drawing, in which we are required to develop different kinds of geometric shapes that will be used in the Drawing via a common interface called  Shape.

## Adapter Design Pattern Implementation

We have two different approaches to implement the adapter pattern.

### Object Adapter Pattern

In this approach, we will use the Java composition, and our adapter contains the source object. The composition is used as a reference to the wrapped class within the adapter. In this approach, we create an adapter class that implements the target ( Shape in this case) and references the adaptee — GeometricShape in this case. We implement all of the required methods of the target (Shape) and do the necessary conversion to fulfill our requirement.

```java
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
```

### Class Adapter Pattern

In this approach, we use the Java Inheritance and extend the source class. So, for this approach, we have to create separate adapters for the Triangle and Rhombus classes, as shown below:

- code of the  **TriangleAdapter**:

```java
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
```

- code of the  **RhombusAdapter**:

```java
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
```
