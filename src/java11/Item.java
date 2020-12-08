package java11;

public class Item {

    /*
    public var price;   

    public var getPrice() {
        return price;
    }

    public void setPrice(var price) {
        this.price = price;
    }
     */
    public double price;

    public Item() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String value(double price) {
        return Double.toString(price);
    }
}