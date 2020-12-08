package ocp11.ch14.sortedData.Comparable;

public class Product implements Comparable<Product> {

    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public int hashCode() {
        return id;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) {
            return false;
        }
        var other = (Product) obj;
        return this.id == other.id;
    }    

    @Override
    public int compareTo(Product obj) {
        return name.compareTo(obj.name);
    }
    
    public static void main(String[] args) {
        Product product1 = new Product(1,"Banana 1");
        Product product2 = new Product(1,"Banana 2");
        System.out.println(product1.compareTo(product2));
        System.out.println(product1.equals(product2));
    }
}