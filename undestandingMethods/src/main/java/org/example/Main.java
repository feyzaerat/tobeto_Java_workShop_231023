package org.example;

public class Main {
    public static void main(String[] args) {
        findingNumber();
    }
    public static void findingNumber(){
        int[] numbers = new int[]{1,2,5,7,9,0};
        int willBeSearch = 6;
        boolean isThere = false;

        for (int number : numbers ){
            if(number == willBeSearch){
                isThere = true;
                break;
            }
        }
        if(isThere){
            giveMessagePos("The number "+ willBeSearch + " you are looking for is available in this series." );
         }else {

            giveMessageNeg("The number "+ willBeSearch + " you are looking for is not available in this series." );
        }
    }
    public static void giveMessagePos(String message){
        System.out.println(message);
    }
    public static void giveMessageNeg(String message){
        System.out.println(message);
    }
}