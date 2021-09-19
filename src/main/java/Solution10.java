/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */

import java.util.Scanner;

public class Solution10 {

    public static void main(String[] agrs) {

        double item1, item2, item3;
        double price1, price2, price3, subtotal, total, tax;
        final double t = 0.055;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of item 1");
        price1 = input.nextDouble();
        System.out.println("Enter the quantity of item 1");
        item1 = input.nextDouble();

        System.out.println("Enter the price of item 2");
        price2 = input.nextDouble();
        System.out.println("Enter the quantity of item 2");
        item2 = input.nextDouble();

        System.out.println("Enter the price of item 3");
        price3 = input.nextDouble();
        System.out.println("Enter the quantity of item 3");
        item3 = input.nextDouble();

        subtotal = (item1 * price1) + (item2 * price2) + (item3 * price3);
        tax = subtotal * t;
        total = tax + subtotal;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);

    }
}
