/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */
package oop.assignment3.ex41.base;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileFunctions {
    private List<String> input;

    public FileFunctions(List<String> input){
        //instantiate lists
        this.input = input;
    }

    public List<String> readFile(){

        //create a List for Employee and return list back to main
        try{
            Path file = Paths.get("src/main/resources/ex41/exercise41_input.txt");
            input = Files.readAllLines(file, Charset.defaultCharset());
        }catch(IOException e){
            e.printStackTrace();
        }
        return input;
    }

    public boolean writeFile(StringBuilder content){
        boolean exists = false;
        //write to a file
        try{
            BufferedWriter newFile = new BufferedWriter(new FileWriter("exercise41_output.txt"));
            newFile.write(String.valueOf(content));
            newFile.close();
            exists = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return exists;
    }
}
