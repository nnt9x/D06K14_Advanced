package oop.b8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLy {
    public static void main(String[] args) {
        List<TaiLieu> taiLieus = new ArrayList<>();
        taiLieus.add(new Bao("Bao1","ThanhNien",100,"2024-10-10"));
        taiLieus.add(new Sach("Sach1","Nhi Dong",1000,"BKACAD",200));
        taiLieus.add(new Bao("Bao2","ThanhNien",200,"2024-09-10"));
        taiLieus.add(new Sach("Sach2","Nhi Dong",300,"BKACAD",180));
        taiLieus.add(new TapChi("TapChi1","KimDong",4000,100,8));

        // In ra thong tin cac tai lieu
//        for (int i = 0; i < taiLieus.size(); i++) {
//            System.out.println(taiLieus.get(i));
//        }
        // Tim kiem theo loai: tim kiem tuan tu
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập loại cần tìm: ");
        String type = scanner.nextLine().toUpperCase();
        for (int i = 0; i < taiLieus.size() ; i++) {
            if(taiLieus.get(i).getClass().getSimpleName().toUpperCase().equals(type)){
                System.out.println(taiLieus.get(i));
            }
        }
    }
}
