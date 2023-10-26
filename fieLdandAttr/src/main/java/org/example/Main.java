package org.example;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop", "Asus", 5000, 3);


        /*****
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus");
        product.setPrice(5000);
        product.stockAmount = 3;
        System.out.println(product.name);
         **********/

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}