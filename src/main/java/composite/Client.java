package composite;

import composite.products.Book;
import composite.products.Box;
import composite.products.MotorbikeToy;

public class Client {
    public static void main(String[] args) {
        // Dong hop qua: 1 xe do choi
        // 2 cuon sach
        MotorbikeToy motorbikeToy = new MotorbikeToy(100, "red", null);
        Book book1 = new Book("Book 1", "BKACAD", 200);
        Book book2 = new Book("Book 2", "BKACAD", 500);

        // Dong hop: 3 hop
        // Hop 1 > hop 2 (xe) + hop 3 (2 cuon sach)
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        // Box1 chua 2 va 3
        box1.add(box2);
        box1.add(box3);

        box2.add(motorbikeToy);
        box3.add(book1);
        box3.add(book2);
        // Thanh toan
        System.out.println(box1.getPrice());
    }
}
