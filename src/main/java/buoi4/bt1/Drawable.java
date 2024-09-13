package buoi4.bt1;

public class Drawable  {
    public <T extends IHinhHoc>  void draw(T t) {
        System.out.println("Vẽ ra hình " + t.toString());
    }
}
