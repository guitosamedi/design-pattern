package fr.diginamic.prototype;

import fr.diginamic.singleton.Singleton;

public abstract class Shape {
    String color;
    int x;
    int y;

    public Shape(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Shape{");
        sb.append("color='").append(color).append('\'');
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Singleton clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clonage interdit");
    }
}
