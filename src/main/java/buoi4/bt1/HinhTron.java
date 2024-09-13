package buoi4.bt1;

public class HinhTron implements IHinhHoc {
    private double banKinh = 1.0;
    private String mauSac = "Đỏ";


    public HinhTron() {
    }

    public HinhTron(double banKinh, String mauSac) {
        if (banKinh <= 0) {
            throw new RuntimeException("Bán kính phải dương!");
        }
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if (banKinh <= 0) {
            throw new RuntimeException("Bán kính phải dương!");
        }
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                ", mauSac='" + mauSac + '\'' +
                ",dienTich=" + tinhDienTich() +
                ",chuVi=" + tinhChuVi() +
                '}';
    }
}
