package buoi1;

public class Main {
    public static void main(String[] args) {
        // Tao 2 doi tuong
        Nguoi n1 = new Nguoi();
        n1.setHoTen("Nguyễn Văn A");
        n1.setCccd("12345678");
        n1.setDiaChi("HN");
        n1.setGioiTinh("Nam");

        Nguoi n2 = new Nguoi("23456789","Nguyen Thi B","Nu","HN");

        // In ra thong tin cua 2 nguoi
        System.out.println(n1.thongTin());
        System.out.println(n2.thongTin());
    }
}

