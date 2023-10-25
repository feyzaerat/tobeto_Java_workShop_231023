package org.example;

public class Main {
    public static void main(String[] args) {
        int number    = 25;
        int remainder = number % 2;
        boolean isPrime = true;

        if(number == 1){
            System.out.println(number+"  is not a Prime Number");
            return;
        }
        if(number < 1){
            System.out.println(number+"  is an Invalid Number");
            return;
        }

        System.out.println("________________________________________________________________");
        System.out.println("The remainder of dividing "+number+" by 2 is " +remainder + " .");

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        System.out.println("________________________________________________________________");
        if(isPrime){
            System.out.println(number+"  is a Prime Number");
        }
        else{
            System.out.println(number+"  is not a Prime Number");
        }
        System.out.println("________________________________________________________________");
    }
}