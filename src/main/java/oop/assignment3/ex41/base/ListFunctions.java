/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */
package oop.assignment3.ex41.base;

import java.util.Collections;
import java.util.List;

public class ListFunctions {
    private final List<String> list;

    public ListFunctions(List<String> list){
        //instantiate list
        this.list = list;
    }

    public void sortList(){
        //sort List in alphabetical order using Java's sort function
        Collections.sort(list);
    }

    public List<String> getList(){
        return list;
    }

    public StringBuilder printList(StringBuilder output){
        formatTable(output);
        //write List to output using Java List's foreach
        for(String s: list){
            output.append('\n').append(s);
        }
        return output;
    }

    private StringBuilder formatTable(StringBuilder output){
        //create the table with the size of list
        output.append(String.format("Total of %s names%n", list.size()));
        String dash = "-";
        output.append(dash.repeat(20));
        return output;
    }
}
