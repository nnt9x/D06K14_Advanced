package oop.b4;

public class Main {
    public static void main(String[] args) {
        TaiKhoan tk1 = new TaiKhoan(123, "Nguyen Van A");
        tk1.napTien(1000000);
        TaiKhoan tk2 = new TaiKhoan(456, "Nguyen Van B");
        tk2.napTien(5000000);

        // In ra thong tin cua 2 tai khoan
        System.out.println(tk1);
        System.out.println(tk2);

        // Thanh toan tu tk1
        tk1.rutTien(500000);
        System.out.println(tk1);
        tk1.napTien(300000);
        System.out.println(tk1);
        // Chuyen tien tu tk2 sang tk1
        tk2.chuyenKhoan(tk1, 2000000);

        // In ra
        System.out.println(tk1);
        System.out.println(tk2);

    }
}
