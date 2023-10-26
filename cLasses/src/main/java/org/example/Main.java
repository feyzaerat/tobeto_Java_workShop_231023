package org.example;

public class Main {
    public static void main(String[] args) {
        //reference type
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Update();
        customerManager.Update();

        /*****    Stack => customerManager     ******************/
        /*****    Heap  => {customerManager's content}     *****/
    }
}
