package fr.diginamic.composite;

public class CircleCompo extends Dot{
    private int x;
    private int y;
    private int radius;
    public CircleCompo(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
    @Override
    public void draw() {
        System.out.println("Circle: x=" + x + ", y=" + y + ", radius=" + radius);
    }

}
