package composite.products;

public class MotorbikeToy implements Product {
    private int buyPrice;
    private String color;
    private String description;

    public MotorbikeToy() {
    }

    public MotorbikeToy(int buyPrice, String color, String description) {
        this.buyPrice = buyPrice;
        this.color = color;
        this.description = description;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getPrice() {
        return buyPrice;
    }
}
