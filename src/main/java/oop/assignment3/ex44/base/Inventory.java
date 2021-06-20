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

    private HashMap<String, Product> productMap;

    public Inventory(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void setInventoryMap(HashMap<String, Product> productMap){
        this.productMap = productMap;
        for(Product product: productList){
            this.productMap.put(product.getName(), product);
        }
    }

    public String searchInventory(String query){
        String output = "";
        for(String key: productMap.keySet() ){
            if(findProduct(key, query)){
                output = formatProductString(key);
            }
        }
        return output;
    }

    private String formatProductString(String key){
        return (String.format("Name: %s%n", productMap.get(key).getName()) +
                String.format("Price: %.2f%n", productMap.get(key).getPrice()) +
                String.format("Quantity: %d", productMap.get(key).getQuantity()));
    }

    public boolean productPresent(String query){
        return productMap.containsKey(query);
    }

    private boolean findProduct(String key, String query){
        return productMap.get(key).getName().equalsIgnoreCase(query);
    }

    public ArrayList<Product> getProductList(){
        return productList;
    }

}
