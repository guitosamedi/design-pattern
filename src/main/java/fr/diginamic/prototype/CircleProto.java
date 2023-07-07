package fr.diginamic.prototype;

public class CircleProto extends Shape {
    private int radius;

    public CircleProto() {
    }

    public CircleProto(CircleProto circle) {
        super(circle);
        this.radius = circle.radius;
    }

    @Override
    public CircleProto clone() {
        return new CircleProto(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", color='" + getColor() + '\'' +
                ", radius=" + radius +
                '}';
    }
}
