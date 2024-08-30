package buoi2.tinhdonggoi;

public class Main {
    public static void main(String[] args) {
        Demo demo1 = new Demo();
        // Do name public
        System.out.println(demo1.name);
        // Do phone default: cung 1 package -> truy cap
        System.out.println(demo1.phone);
        // Do de procted;
        System.out.println(demo1.address);
        demo1.setMark(100);
    }
}
