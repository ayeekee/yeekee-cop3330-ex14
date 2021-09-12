package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        String key = "WI";

        System.out.print("What is the order amount? ");
        String orderAmt = se.nextLine();
        double order = Double.parseDouble(orderAmt);

        System.out.print("What is the state? ");
        String state = se.nextLine();

        double tax = 0;
        double total = order;

        if (state.equalsIgnoreCase(key)){
            tax = order * 0.055;
            total += tax;

            System.out.println("The subtotal is $" + String.format("%.2f", order) + ".\nThe tax is $" + String.format("%.2f", tax) + ".");
        }

        System.out.println("The total is $" + String.format("%.2f", total));
    }
}
