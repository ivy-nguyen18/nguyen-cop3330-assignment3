package oop.assignment3.ex41.base;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
        nameList.printList();

    }
}
