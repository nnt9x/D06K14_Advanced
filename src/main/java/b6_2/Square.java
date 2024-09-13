package b6_2;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new RuntimeException("Error");
        }
        this.width = this.length = side;
    }

    @Override
    public String toString() {
        return "Square[" +
                super.toString()
                +
                "]";
    }
}
