package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        //initialize a scanner
        Scanner scanner = new Scanner(System.in);

        //prompt user for the size of sandwich they want
        System.out.printf("Which sandwich size do you want (1 or 2) : ");
        int sandwichSize = scanner.nextInt();

        //prompt the user for their age
        System.out.printf("How old are you ? : ");
        int age = scanner.nextInt();

        //initialized discound and cost of sandwich
        int discount;
        int costOfSandwich;

        //if statement to check for the age and discount
        if( age <= 17 ){
            discount = 10;
            System.out.println("You received a 10% discount");

        }
        else if(age >= 65){
            discount = 20;
            System.out.println("You received a 20% discound");
        }
        else{
            System.out.println("You won't receive a discount");
        }


    }
}
