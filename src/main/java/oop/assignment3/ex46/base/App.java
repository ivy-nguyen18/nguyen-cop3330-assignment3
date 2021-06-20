/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */
package oop.assignment3.ex46.base;

import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        Map<String,Integer> newWordMap = new TreeMap<>();

        //read file
        FileFunctions input = new FileFunctions();
        String content = input.readFile();

        //parse the content by words
        Content newContent = new Content();
        String [] arr = newContent.parseContent(content);

        //create a hashmap
        HashMapFunctions wordFreqMap = new HashMapFunctions(newWordMap);
        wordFreqMap.setKeys(arr);

        //sort hashmap
        wordFreqMap.sortMap();

        //print histogram of hashmap
        newContent.printFrequencyDescending(wordFreqMap.getWordFreqMap());
    }
}
