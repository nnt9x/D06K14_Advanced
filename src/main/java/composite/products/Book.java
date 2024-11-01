package composite.products;

public class Book implements Product {
    private String title;
    private String author;
    private int buyPrice;

    public Book() {
    }

    public Book(String title, String author, int buyPrice) {
        this.title = title;
        this.author = author;
        this.buyPrice = buyPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    @Override
    public int getPrice() {
        return buyPrice;
    }
}
