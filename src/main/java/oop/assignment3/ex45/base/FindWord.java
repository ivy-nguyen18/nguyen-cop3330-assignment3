/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */
package oop.assignment3.ex45.base;

public class FindWord {
    public String findAndReplace(String content){
        //replace the words
        return content.replaceAll("utilize", "use").replaceAll("utilizes", "uses");
    }
}
