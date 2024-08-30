package buoi1;

public class Nguoi {
    // Thuoc tinh
    private String cccd;
    private String hoTen;
    private String gioiTinh;
    private String diaChi;

    // Phuong thuc khoi tao - constructor
    public Nguoi() {
    }

    public Nguoi(String cccd, String hoTen, String gioiTinh, String diaChi) {
        this.cccd = cccd;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    // Set- getter
    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    // thongTin
    public String thongTin() {
        return "Nguoi[" +
                "cccd='" + cccd + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ']';
    }
}
