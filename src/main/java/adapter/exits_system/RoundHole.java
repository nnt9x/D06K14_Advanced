package adapter.exits_system;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        if (roundPeg.getRadius() < this.radius) {
            return true;
        }
        return false;
    }


}
