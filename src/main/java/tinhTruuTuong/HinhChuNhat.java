package tinhTruuTuong;

public class HinhChuNhat extends HinhHoc2D {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.tenHinh = "Hình chữ nhật";
    }

    @Override
    public double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public double dienTich() {
        return chieuDai * chieuRong;
    }
}
