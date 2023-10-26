package org.example;

public class Product {
    public Product(int id, String name, String description, double price, int stockAmount){
        System.out.println("Constructor method worked..");
        this.id           = id;
        this.name         = name;
        this.description  = description;
        this.price        = price;
        this.stockAmount  = stockAmount;
    }
    public Product(){

    }
    int id;
    String name;
    String description;
    double price;
    int stockAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.description = description;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

}
