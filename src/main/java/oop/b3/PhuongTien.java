package oop.b3;

public class PhuongTien {
    private String ma;
    private String ten;
    private int dungTichXiLanh;
    private int giaXe;

    public PhuongTien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public PhuongTien(String ma, String ten, int dungTichXiLanh, int giaXe) {
        this.ma = ma;
        this.ten = ten;
        this.dungTichXiLanh = dungTichXiLanh;
        this.giaXe = giaXe;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getDungTichXiLanh() {
        return dungTichXiLanh;
    }

    public void setDungTichXiLanh(int dungTichXiLanh) {
        if (dungTichXiLanh <= 0) {
            throw new RuntimeException("Dung tích không âm!");
        }
        this.dungTichXiLanh = dungTichXiLanh;
    }

    public int getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(int giaXe) {
        if (giaXe <= 0) {
            throw new RuntimeException("Giá xe không hợp lệ!");
        }
        this.giaXe = giaXe;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", dungTichXiLanh=" + dungTichXiLanh +
                ", giaXe=" + giaXe +
                '}';
    }

    // Thue truoc ba
    public double thueTruocBa() {
        if (dungTichXiLanh < 100) {
            return giaXe * 0.01;
        } else if (dungTichXiLanh <= 200) {
            return giaXe * 0.03;
        } else {
            return giaXe * 0.05;
        }
    }
}
