/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex44.base;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonFunctions {
    private Inventory inventory;
    public Inventory readJSON(){
        try{
            Gson gson = new Gson();
            Path path = Paths.get("src/main/resources/ex44/exercise44_input.json");
            Reader reader = Files.newBufferedReader(path);
            this.inventory = gson.fromJson(reader, Inventory.class);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inventory;
    }
}
