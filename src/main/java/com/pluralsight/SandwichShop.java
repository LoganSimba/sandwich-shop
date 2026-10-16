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


    }
}
