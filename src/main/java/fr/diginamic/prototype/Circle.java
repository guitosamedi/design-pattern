package fr.diginamic.prototype;

import fr.diginamic.singleton.Singleton;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    public double getRadius() {
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
