package oop.b3;

public class Main {


    public static void main(String[] args) {
        PhuongTien pt1 = new PhuongTien("WaveHD","Wave Honda",110, 20000000);
        PhuongTien pt2 = new PhuongTien("Cup","Cup Honda",50, 15000000);
        PhuongTien pt3 = new PhuongTien("Yamaha","Yamaha 1",250, 80000000);

        PhuongTien[] arr = {pt1, pt2, pt3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Thuế trước bạ: ");
            System.out.println(arr[i]);
            System.out.println(arr[i].thueTruocBa());
        }
    }
}
