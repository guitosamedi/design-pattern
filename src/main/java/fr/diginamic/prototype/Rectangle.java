package fr.diginamic.prototype;

import fr.diginamic.singleton.Singleton;

public class Rectangle extends Shape{
    int height;
    int width;
    public Rectangle(String color, int x, int y) {
        super(color, x, y);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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
