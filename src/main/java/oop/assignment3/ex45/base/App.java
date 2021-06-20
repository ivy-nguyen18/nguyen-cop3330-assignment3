/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */
package oop.assignment3.ex45.base;


import java.util.Scanner;

public class App {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //read the input file
        FileFunctions newFile = new FileFunctions();
        String content = newFile.readFile();

        //replace the words utilize and utilizes with use and uses
        FindWord newContent = new FindWord();
        content = newContent.findAndReplace(content, "utilize", "use");
        content = newContent.findAndReplace(content, "utilizes","uses");

        //write to output file
        System.out.print("Enter name of output file: ");
        String nameFile = input.nextLine();
        newFile.writeFile(content, nameFile);
    }
}
