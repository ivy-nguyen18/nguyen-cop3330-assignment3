/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */
package oop.assignment3.ex45.base;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileFunctions {

    public String readFile(){
        //read file
        String content = "";
        try{
            Path file = Paths.get("src/main/resources/ex45/exercise45_input.txt");
            content = Files.readString(file);
        }catch(IOException e){
            e.printStackTrace();
        }
        return content;
    }

    public boolean writeFile(String content, String outputFile){
        boolean exists = false;
        //write to a file
        try{
            String newFilePath = String.format("%s.txt", outputFile);
            BufferedWriter newFile = new BufferedWriter(new FileWriter(newFilePath));
            newFile.write(content);
            newFile.close();
            exists = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return exists;
    }
}
