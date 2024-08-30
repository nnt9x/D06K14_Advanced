package oop.b2;

public class SinhVien {
    private int maSinhVien;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public SinhVien() {
    }

    public SinhVien(int maSinhVien, String hoTen, float diemLT, float diemTH) {
        if(this.diemTH < 0 || this.diemTH >  10){
           throw new RuntimeException("Điểm không hợp lệ!");
        }
        if(this.diemLT < 0 || this.diemLT >  10){
            throw new RuntimeException("Điểm không hợp lệ!");
        }
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        if(this.diemLT < 0 || this.diemLT >  10){
            throw new RuntimeException("Điểm không hợp lệ!");
        }
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        if(this.diemTH < 0 || this.diemTH >  10){
            throw new RuntimeException("Điểm không hợp lệ!");
        }
        this.diemTH = diemTH;
    }

    public float diemTB(){
        return (this.diemLT + this.diemTH)/2;
    }

    @Override
    public String toString() {
        return "SinhVien[" +
                "maSinhVien=" + maSinhVien +
                ", hoTen='" + hoTen + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                ']';
    }
}
