package buoi4.bt1;

public class Main {
    public static void main(String[] args) {
        HinhTron h1 = new HinhTron(5,"Đỏ");
        HinhVuong h2 = new HinhVuong(4);
        Drawable drawable = new Drawable();
        drawable.draw(h1);
        drawable.draw(h2);
    }
}
