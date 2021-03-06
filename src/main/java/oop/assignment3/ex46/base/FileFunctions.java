/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */
package oop.assignment3.ex46.base;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileFunctions {

    public String readFile(){
        //read file into string
        String content = "";
        try{
            //read file
            Path file = Paths.get("src/main/resources/ex46/exercise46_input.txt");
            content = Files.readString(file);

        }catch(IOException e){
            e.printStackTrace();
        }
        return content;
    }
}
