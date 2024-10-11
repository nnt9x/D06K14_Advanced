package adapter;

import adapter.exits_system.RoundPeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public int getRadius() {
        return (int) (Math.sqrt(2) / 2 * peg.getWidth());
    }
}
