package org.example;

public class Main {
    public static void main(String[] args) {
        String mesaj          = "Vade Oradnı";

        Product product1      = new Product();
        product1.name         = "Delonghi Kahve Makinesi";
        product1.unitPrice    = 7500;
        product1.discount     = 7;
        product1.unitsInStock = 3;
        product1.imageUrl     = "unknown1.jpeg";


        Product product2      = new Product();
        product2.name         = "Smeg Kahve Makinesi";
        product2.unitPrice    = 6500;
        product2.discount     = 8;
        product2.unitsInStock = 4;
        product2.imageUrl     = "unknown2.jpeg";

        Product product3      = new Product();
        product3.name         = "Kitchen Aid Kahve Makinesi";
        product3.unitPrice    = 4500;
        product3.discount     = 9;
        product3.unitsInStock = 2;
        product3.imageUrl     = "unknown3.jpeg";


    }
}