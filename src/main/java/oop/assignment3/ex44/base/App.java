/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex44.base;

import java.util.HashMap;
import java.util.Scanner;

public class App {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //read the JSON file using GSON
        JsonFunctions newFile = new JsonFunctions();
        Inventory inventory = newFile.readJSON();

        //create a Hashmap to search product names and print values
        HashMap<String, Product> productMap = new HashMap<>();
        inventory.setInventoryMap(productMap);

        //take input until valid product is found
        while(true){
            //take input
            String query = takeInput("What is the product name? ");

            //check if query of product exists
            if(inventory.productPresent(query)){

                //product exists: print out values associated with product
                System.out.println(inventory.searchInventory(query));
                break;
            }
            //product does not exist: keep asking
            System.out.println("Sorry, that product was not found in our inventory");
        }
    }

    private static String takeInput (String prompt){
        System.out.println(prompt);
        return input.nextLine();
    }
}
