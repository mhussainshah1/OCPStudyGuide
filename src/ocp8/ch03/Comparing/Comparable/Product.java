package ocp8.ch03.Comparing.Comparable;

public class Product implements Comparable<Product> {

    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) {
            return false;
        }
        Product other = (Product) obj;
        return this.id == other.id;
    }

    @Override
    public int compareTo(Product obj) {
        return this.name.compareTo(obj.name);
    }
    
    public static void main(String[] args) {
        Product product1 = new Product(1,"Banana 1");
        Product product2 = new Product(1,"Banana 2");
        System.out.println(product1.compareTo(product2));//same product gives -1
        System.out.println(product1.equals(product2));
    }
}