public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product(1,"a",2);
        manager.add(product);
    }
}