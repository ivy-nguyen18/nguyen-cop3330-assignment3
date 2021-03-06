/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */
package oop.assignment3.ex41.base;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args){
        //create a List for Employee
        List<String> list = new ArrayList<>();

        //read the file
        FileFunctions input = new FileFunctions(list);

        //create a class that can manipulate the lists
        ListFunctions nameList = new ListFunctions(input.readFile());

        //sort list in ListFunctions class
        nameList.sortList();

        //print sorted list in ListFunctions class
        StringBuilder output = new StringBuilder();
        output = nameList.printList(output);
        input.writeFile(output);

    }
}
