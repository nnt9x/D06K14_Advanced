package b6_3;

public class MovablePoint implements Movable {
    // Thuoc tinh
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y = y + ySpeed;
    }

    @Override
    public void moveDown() {
        y = y - ySpeed;
    }

    @Override
    public void moveLeft() {
        x = x - xSpeed;
    }

    @Override
    public void moveRight() {
        x = x + xSpeed;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d) speed=(%d,%d)", x, y, xSpeed, ySpeed);
    }
}
