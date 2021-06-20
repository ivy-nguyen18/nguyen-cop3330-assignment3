/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex44.base;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {

    @SerializedName("products")
    private final ArrayList<Product> productList;

    private HashMap<String, Product> inventoryMap;

    public Inventory(ArrayList<Product> productList) {
        //instantiate productList
        this.productList = productList;
    }

    public void setInventoryMap(HashMap<String, Product> productMap){
        //create an Inventory map from Product List
        this.inventoryMap = productMap;
        for(Product product: productList){
            this.inventoryMap.put(product.getName(), product);
        }
    }

    public String searchInventory(String query){
        //Search InventoryMap for query
        String output = "";
        for(String key: inventoryMap.keySet() ){
            //when query found, return product information string
            if(findProduct(key, query)){
                output = formatProductString(key);
            }
        }
        return output;
    }

    private String formatProductString(String key){
        //format product information string
        return (String.format("Name: %s%n", inventoryMap.get(key).getName()) +
                String.format("Price: %.2f%n", inventoryMap.get(key).getPrice()) +
                String.format("Quantity: %d", inventoryMap.get(key).getQuantity()));
    }

    public boolean productPresent(String query){
        //check if the query is in the productMap
        return inventoryMap.containsKey(query);
    }

    private boolean findProduct(String key, String query){
        //look in inventoryMap for key
        return inventoryMap.get(key).getName().equalsIgnoreCase(query);
    }

    public ArrayList<Product> getProductList(){
        return productList;
    }

}
