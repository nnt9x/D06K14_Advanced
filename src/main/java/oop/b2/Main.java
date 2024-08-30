package oop.b2;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.setHoTen("Nguyen Van A");
        sv1.setMaSinhVien(1);
        sv1.setDiemLT(10);
        sv1.setDiemTH(8);

        SinhVien sv2 = new SinhVien(2, "Sinh vien 2",8, 9);

        SinhVien sv3 = new SinhVien(3, "Sinh vien 3",5, 6);

        SinhVien[] arr = {sv1, sv2, sv3};
        for (int i = 0; i < arr.length; i++){
            System.out.printf("MSSV: %d, Ho ten: %s, Diem LT: %.2f, Diem TH: %.2f, Diem TB: %.2f \n",
                   arr[i].getMaSinhVien(), arr[i].getHoTen(), arr[i].getDiemLT(), arr[i].getDiemTH(), arr[i].diemTB());
        }

    }
}
