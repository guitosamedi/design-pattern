package fr.diginamic.adapter;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg squarePeg;
    public SquarePegAdapter(SquarePeg squarePeg) {
        super((int) ((squarePeg.getWidth() * Math.sqrt(2)) / 2));
        this.squarePeg = squarePeg;
    }
    @Override
    public int getRadius() {
        return super.getRadius();
    }
}
