package tinhTruuTuong;

public class HinhTron extends HinhHoc2D{

    private double banKinh = 1.0;

    public HinhTron() {
        this.tenHinh = "Hình Tròn";
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
        this.tenHinh = "Hình Tròn";
    }

    @Override
    public double chuVi() {
        return 2*Math.PI * banKinh;
    }

    @Override
    public double dienTich() {
        return banKinh*banKinh*Math.PI;
    }

}
