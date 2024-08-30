package oop.b4;

public class TaiKhoan {
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soDu = 0;
    // Hang so lai suat
    final private double laiSuat = 0.035;

    public TaiKhoan() {
    }

    public TaiKhoan(long soTaiKhoan, String tenTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soDu = soDu;
    }

    public TaiKhoan(long soTaiKhoan, String tenTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soDu = 50;
    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    // Phuong Thuc Nap Tien
    public double napTien(double soTien) {
        if (soTien <= 0) {
            throw new RuntimeException("Số tiền nạp không hợp lệ!");
        }
        this.soDu = this.soDu + soTien;
        return this.soDu;
    }

    // Rut tien
    public double rutTien(double soTien) {
        // Fix: phi rut = 3000d
        if (soTien + 3000 > this.soDu) {
            throw new RuntimeException("Số dư không đủ");
        }
        this.soDu = this.soDu - soTien - 3000;
        return this.soDu;
    }

    // Dao han
    public double daoHan() {
        this.soDu = this.soDu * (1 + laiSuat);
        return this.soDu;
    }
    // Chuyen tien tu tai khoan A -> B (phi 3000)

    public boolean chuyenKhoan(TaiKhoan taiKhoanKhac, double soTien) {
        // Tu tai khoan hien tai -> tai khoan khac
        if (this.soDu < soTien + 3000) {
            return false;
        }
        // Tru so tien tai khoan hien tai
        this.soDu = this.soDu - soTien - 3000;
        // Cong tien vao tai khoan con lai
        taiKhoanKhac.soDu += soTien;
        return true;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "soTaiKhoan=" + soTaiKhoan +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", soDu=" + soDu +
                '}';
    }
}
