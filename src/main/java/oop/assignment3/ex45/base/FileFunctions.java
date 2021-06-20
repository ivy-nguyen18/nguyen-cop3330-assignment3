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
    private String outputFile;

    public void setOutputFile(String outputFile){
        this.outputFile = outputFile;
    }

    public String readFile(){
        String content = "";
        try{
            //read file
            Path file = Paths.get("src/main/java/oop/assignment3/ex45/base/exercise45_input.txt");
            content = Files.readString(file);
        }catch(IOException e){
            e.printStackTrace();
        }
        return content;
    }

    public void writeFile(String content){
        //write to a file
        try{
            //put the file path in the same package for convenience -> otherwise it's in global
            //String newFilePath = String.format("src/main/java/oop/assignment3/ex45/base/%s", outputFile);
            String newFilePath = String.format("%s.txt", outputFile);
            BufferedWriter newFile = new BufferedWriter(new FileWriter(newFilePath));
            newFile.write(content);
            newFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
