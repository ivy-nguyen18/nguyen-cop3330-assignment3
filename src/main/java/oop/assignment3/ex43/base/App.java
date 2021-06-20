/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */
package oop.assignment3.ex43.base;

import java.util.Scanner;

public class App {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        //prompt for input
        String siteName = takeInput("Site name: ");
        String author = takeInput("Author: ");
        boolean wantJavascript = parseBoolean(takeInput("Do you want a folder for JavaScript? "));
        boolean wantCSS = parseBoolean(takeInput("Do you want a folder for CSS? "));

        //make the directory
        DirectoryFunctions newDir = new DirectoryFunctions(siteName);
        newDir.makeDirectory();

        //make html
        FileFunctions newHtml = new FileFunctions(siteName, author);
        newHtml.createHTML();

        //write to html
        newHtml.writeToHTML();

        //check if want Javascript
        checkJavascript(wantJavascript, newDir);

        //check if want CSS
        checkCSS(wantCSS, newDir);
    }

    private static String takeInput(String prompt){
        System.out.print(prompt);
        return input.nextLine();
    }

    private static boolean parseBoolean(String answer){
        return "y".equalsIgnoreCase(answer);
    }

    public static void checkJavascript(Boolean wantJavascript, DirectoryFunctions newDir){
        //wantJavascript = true
        if(wantJavascript){
            //make javascript folder
            newDir.makeJavascriptFolder();
        }
    }

    public static void checkCSS(Boolean wantCSS, DirectoryFunctions newDir){
        //wantCSS = true
        if(wantCSS){
            //make CSS folder
            newDir.makeCSSFolder();
        }
    }

}
