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
        StringBuilder output = new StringBuilder();

        //prompt for input
        String siteName = takeInput("Site name: ");
        String author = takeInput("Author: ");
        boolean wantJavascript = parseBoolean(takeInput("Do you want a folder for JavaScript? "));
        boolean wantCSS = parseBoolean(takeInput("Do you want a folder for CSS? "));

        //make the directory
        DirectoryFunctions newDir = new DirectoryFunctions(siteName);
        output.append(newDir.makeDirectory());

        //make html
        FileFunctions newHtml = new FileFunctions(siteName, author);
        output.append(newHtml.createHTML());

        //write to html
        newHtml.writeToHTML();

        //check if want Javascript
        output.append(checkJavascript(wantJavascript, newDir));

        //check if want CSS
        output.append(checkCSS(wantCSS, newDir));

        System.out.println(output);
    }

    private static String takeInput(String prompt){
        System.out.print(prompt);
        return input.nextLine();
    }

    private static boolean parseBoolean(String answer){
        return "y".equalsIgnoreCase(answer);
    }

    private static String checkJavascript(Boolean wantJavascript, DirectoryFunctions newDir){
        String output = "";
        //if wantJavascript is y = true
        if(wantJavascript){
            //make javascript folder
            output = newDir.makeJavascriptFolder();
        }
        return output;
    }

    private static String checkCSS(Boolean wantCSS, DirectoryFunctions newDir){
        String output = "";
        //if wantCSS is y = true
        if(wantCSS){
            //make CSS folder
            output = newDir.makeCSSFolder();
        }
        return output;
    }

}
