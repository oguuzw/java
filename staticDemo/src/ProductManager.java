public class ProductManager {
    public void add(Product product){

        //ProductValidator productValidator = new ProductValidator();

        if(ProductValidator.isValid(product)){
            System.out.println("urun bilgileri eklendi");
        }else{
            System.out.println("urun bilgileri gecersizdir.");
        }
    }
}
