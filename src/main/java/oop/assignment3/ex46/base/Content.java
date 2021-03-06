/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */
package oop.assignment3.ex46.base;

import java.util.Map;

public class Content {

    public String[] parseContent(String content){
        //iterate through string
        content = content.replaceAll("\n"," ").replaceAll("\r", " ");
        return content.trim().split("\\s+");
    }


    public void printFrequencyDescending(Map<String,Integer> wordFreqMap){
        //print hashmap
        for(Map.Entry<String, Integer> entry: wordFreqMap.entrySet()){
            System.out.printf("%s: %s%n", entry.getKey(), createHistogram(entry.getValue()));
        }
    }

    public String createHistogram(int nStars){
        //create histogram by value
        String star = "*";
        return star.repeat(nStars);
    }
}
