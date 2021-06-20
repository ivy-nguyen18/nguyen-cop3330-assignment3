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

    public boolean makeDirectory(){
        boolean exists = false;
        //make the directory
        Path path = Paths.get(String.format("%s", this.siteName));
        try{
            Files.createDirectories(path);
            System.out.printf("Created ./%s%n", this.siteName);
            exists = true;
        } catch (IOException e){
            e.printStackTrace();
        }
        return exists;
    }

    public boolean makeJavascriptFolder(){
        boolean exists = false;
        Path pathJS = Paths.get(String.format("%s/js", siteName));
        try{
            Files.createDirectories(pathJS);
            System.out.printf("Created ./%s/js/%n", siteName);
            exists = true;
        }catch (IOException e){
            e.printStackTrace();
        }
        return exists;
    }

    public boolean makeCSSFolder(){
        boolean exists = false;
        Path pathCSS = Paths.get(String.format("%s/css", siteName));
        try{
            Files.createDirectories(pathCSS);
            System.out.printf("Created ./%s/css/%n", siteName);
            exists = true;
        }catch (IOException e){
            e.printStackTrace();
        }
        return exists;
    }
}
