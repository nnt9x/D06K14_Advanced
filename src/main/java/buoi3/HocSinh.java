package buoi3;

public class HocSinh extends Nguoi {
    private String lopHoc;
    private double diemTongKet;

    public HocSinh(String lopHoc, double diemTongKet) {
        this.lopHoc = lopHoc;
        this.diemTongKet = diemTongKet;
    }

    public HocSinh(String ma, String hoTen, String email, String soDienThoai, String lopHoc, double diemTongKet) {
        super(ma, hoTen, email, soDienThoai);
        this.lopHoc = lopHoc;
        this.diemTongKet = diemTongKet;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public double getDiemTongKet() {
        return diemTongKet;
    }

    public void setDiemTongKet(double diemTongKet) {
        this.diemTongKet = diemTongKet;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                super.toString() +
                "lopHoc='" + lopHoc + '\'' +
                ", diemTongKet=" + diemTongKet +
                '}';
    }
}
