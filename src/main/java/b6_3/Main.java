package b6_3;

public class Main {
    public static void main(String[] args) {
        Movable point = new MovablePoint(3, 4, 3, 5);
        System.out.println(point);
        point.moveRight();
        System.out.println(point);
        point.moveDown();
        System.out.println(point);
        point.moveLeft();
        System.out.println(point);
        point.moveUp();
        System.out.println(point);
    }
}
