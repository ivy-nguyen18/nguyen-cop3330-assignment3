/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex43.base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileFunctions {

    private File html;
    private final String siteName;
    private final String author;

    public FileFunctions(String siteName, String author){
        this.siteName = siteName;
        this.author = author;
    }

    public File getHtml(){
        return html;
    }

    public String createHTML(){
        //add file to directory
        String pathHtml = String.format("%s/index.html", siteName);
        this.html = new File(pathHtml);
        try{
            html.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
        return String.format("Created ./website/%s/index.html%n", siteName);
    }

    public void writeToHTML(){
        //write to file
        String htmlSkeleton = formatHTML();
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(html));
            bw.write(htmlSkeleton);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String formatHTML(){
        //format html tags and skeleton
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                String.format("<meta name =\"author\" content =\"%s\">%n",author) +
                String.format("<title>%s</title>%n",siteName) +
                "</head>\n" +
                "</html>";
    }

}
