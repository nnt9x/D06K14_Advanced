package tinhTruuTuong;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cho phep nhap nhieu loai hinh khac nhau
        List<HinhHoc2D> hinhHoc2DList = new ArrayList<>();
        hinhHoc2DList.add(new HinhChuNhat(3, 4));
        hinhHoc2DList.add(new HinhTron(4.5));
        hinhHoc2DList.add(new HinhChuNhat(10, 20));
        hinhHoc2DList.add(new TamGiacDeu(6));
        // In ra thong tin hinh co dien tich lon nhat
        double max = 0;
        HinhHoc2D maxHinh = null;
        for (int i = 0; i < hinhHoc2DList.size(); i++) {
            if (max < hinhHoc2DList.get(i).dienTich()) {
                max = hinhHoc2DList.get(i).dienTich();
                maxHinh = hinhHoc2DList.get(i);
            }
        }
        System.out.println("Thông tin hình có diện tích lớn nhất là: " + maxHinh.toString());

    }
}
