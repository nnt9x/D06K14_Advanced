package oop.b1;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0) {
            throw new RuntimeException("Canh khong hop le");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai <= 0) {
            throw new RuntimeException("Canh khong hop le");
        }
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if (chieuDai <= 0) {
            throw new RuntimeException("Canh khong hop le");
        }
        this.chieuRong = chieuRong;
    }

    public double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double dienTich() {
        return chieuDai * chieuRong;
    }
}
