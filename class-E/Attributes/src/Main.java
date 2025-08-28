//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"laptop","MSI laptop",3000,3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getId());

        System.out.println(product.getKod());

    }
}