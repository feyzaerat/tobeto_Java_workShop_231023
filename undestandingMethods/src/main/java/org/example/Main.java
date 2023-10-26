package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,9,0};
        int willBeSearch = 5;
        boolean isThere = false;

        for (int number : numbers ){
            if(number == willBeSearch){
                isThere = true;
                break;
            }
        }
        if(isThere){
            System.out.println("The number "+ willBeSearch + " you are looking for is available in this series." );
        }else {

            System.out.println("The number "+ willBeSearch + " you are looking for is not available in this series." );
        }
    }
}