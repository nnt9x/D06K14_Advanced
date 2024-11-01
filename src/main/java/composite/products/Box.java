package composite.products;

import java.util.LinkedList;
import java.util.List;

public class Box implements Product {
    private List<Product> items;

    public Box() {
        items = new LinkedList<>();
    }

    public void add(Product p) {
        items.add(p);
    }

    public void remove(Product p) {
        items.remove(p);
    }

    public List<Product> getItems() {
        return items;
    }

    @Override
    public int getPrice() {
        int total = 0;
        for (int i = 0; i < items.size(); i++) {
            total = total + items.get(i).getPrice();
        }
        return total;
    }
}
