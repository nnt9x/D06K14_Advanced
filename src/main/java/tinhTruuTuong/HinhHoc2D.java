package tinhTruuTuong;

public abstract class HinhHoc2D {
    protected String tenHinh = "Hình học 2D";

    public HinhHoc2D() {
    }

    public HinhHoc2D(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    // Tinh chu vi, dien tich
    public abstract double chuVi();

    // Dien tich
    public abstract double dienTich();

    @Override
    public String toString() {
        return tenHinh + "[ diện tích = " + dienTich() + ", chu vi = " + chuVi() + " ]";
    }
}
