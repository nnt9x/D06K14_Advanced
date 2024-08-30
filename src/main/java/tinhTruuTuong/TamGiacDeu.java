package tinhTruuTuong;

public class TamGiacDeu extends HinhHoc2D {
    private double canh = 1.0;

    public TamGiacDeu(double canh) {
        this.canh = canh;
        this.tenHinh = "Tam Giác Đều";
    }

    @Override
    public double chuVi() {
        return canh * 3;
    }

    @Override
    public double dienTich() {
        return Math.sqrt(3.0) * canh * canh / 4;
    }
}
