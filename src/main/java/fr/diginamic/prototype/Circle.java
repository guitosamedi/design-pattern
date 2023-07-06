package fr.diginamic.prototype;

import fr.diginamic.singleton.Singleton;

public class Circle extends Shape {
    int radius;
    public Circle(String color, int x, int y) {
        super(color, x, y);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Singleton clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
