package org.example;

public class Main {
    public static void main(String[] args) {

        String mesaj          = "Vade Oradnı";

        Product product1      = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("unknown1.jpeg");

        Product product2      = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitsInStock(4);
        product2.setImageUrl("unknown2.jpeg");

        Product product3      = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(2);
        product3.setImageUrl("unknown3.jpeg");

        Product[] products = {product1,product2,product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05245682254");
        individualCustomer.setCustomerNumber("125478");
        individualCustomer.setFirstName("Feyza");
        individualCustomer.setLastName("Erat");

        CorporateCustomer corporateCustomer    = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhone("05246897541");
        corporateCustomer.setCustomerNumber("258644");
        corporateCustomer.setCompanyName("Avez Elektronik İletişim Eğitim Danışmanlığı Ticaret Anonim Şirketi");
        corporateCustomer.setTaxNumber("2586463658");

        Customer[] customers = {individualCustomer,corporateCustomer};

    }
}