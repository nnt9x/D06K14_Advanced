package buoi3;

public class GiaoVien extends Nguoi {
    private String chuyenMon;
    private String ngayCongTac;

    public GiaoVien(String chuyenMon, String ngayCongTac) {
        this.chuyenMon = chuyenMon;
        this.ngayCongTac = ngayCongTac;
    }

    public GiaoVien(String ma, String hoTen, String email, String soDienThoai, String chuyenMon, String ngayCongTac) {
        super(ma, hoTen, email, soDienThoai);
        this.chuyenMon = chuyenMon;
        this.ngayCongTac = ngayCongTac;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public String getNgayCongTac() {
        return ngayCongTac;
    }

    public void setNgayCongTac(String ngayCongTac) {
        this.ngayCongTac = ngayCongTac;
    }

    @Override
    public String toString() {
        return "GiaoVien{" +
                super.toString() +
                "chuyenMon='" + chuyenMon + '\'' +
                ", ngayCongTac='" + ngayCongTac + '\'' +
                '}';
    }
}
