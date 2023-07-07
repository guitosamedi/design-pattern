package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {

    private int x;
    private int y;
    private List<Graphic> children;

    public CompoundGraphic(int x, int y) {
        this.x = x;
        this.y = y;
        this.children = new ArrayList<>();
    }
    public void add(Graphic graphic) {
        children.add(graphic);
    }

    public void remove(Graphic graphic) {
        children.remove(graphic);
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
        for (Graphic graphic : children) {
            graphic.move(x, y);
        }
    }

    @Override
    public void draw() {
        System.out.println("CompoundGraphic: x=" + x + ", y=" + y);
        for (Graphic graphic : children) {
            graphic.draw();
        }
    }
}
