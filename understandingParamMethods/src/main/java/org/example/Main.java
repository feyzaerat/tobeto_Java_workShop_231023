package org.example;

public class Main {
    public static void main(String[] args) {
        String message    = "Today is a wonderful day !";
        String newMessage = message.substring(6,12);
        System.out.println(newMessage);
        System.out.println(sum(5,7));
        System.out.println(sum2(1,5,6,9,25,54));
        System.out.println(giveCountry("KOCAELİ"));

    }
    public static void insert(){
        System.out.println("Insert successful !");
    }
    public static void update(){
        System.out.println("Update successful !");
    }
    public static void delete(){
        System.out.println("Delete successful !");
    }
    public static int sum(int num1, int num2){
        return num1+num2;
    }

    public static int sum2(int... numbers){
        int sum =0;
        for (int number:numbers){
            sum += number;
        }
        return sum;

    }
    public static String giveCountry(String giveCountry){
        return giveCountry;
    }
}