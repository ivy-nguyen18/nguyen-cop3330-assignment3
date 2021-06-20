/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */
package oop.assignment3.ex43.base;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryFunctions {
    private final String siteName;

    public DirectoryFunctions(String siteName){
        this.siteName = siteName;
    }

    public String makeDirectory(){
        //make the directory
        Path path = Paths.get(String.format("%s", this.siteName));
        try{
            Files.createDirectories(path);
        } catch (IOException e){
            e.printStackTrace();
        }
        return String.format("Created ./website/%s%n", this.siteName);
    }

    public String makeJavascriptFolder(){
        //make Javascript folder
        Path pathJS = Paths.get(String.format("%s/js", siteName));
        try{
            Files.createDirectories(pathJS);
        }catch (IOException e){
            e.printStackTrace();
        }
        return String.format("Created ./website/%s/js/%n", siteName);
    }

    public String makeCSSFolder(){
        //make CSS folder
        Path pathCSS = Paths.get(String.format("%s/css", siteName));
        try{
            Files.createDirectories(pathCSS);
        }catch (IOException e){
            e.printStackTrace();
        }
        return String.format("Created ./website/%s/css/%n", siteName);
    }
}
