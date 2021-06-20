/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */
package oop.assignment3.ex46.base;

import java.util.*;

public class HashMapFunctions {
    //create hashmap to store frequency counter
    private Map<String,Integer> wordFreqMap = new TreeMap<>();

    //getter to return wordFreqMap
    public Map<String,Integer> getWordFreqMap(){
        return wordFreqMap;
    }

    public void setKeys(String [] arr) {
        //add to hashmap by frequency: keys are words, value is frequency
        for (String s : arr) {
            //word is already a key, increase count
            if (wordFreqMap.containsKey(s)) {
                wordFreqMap.put(s, wordFreqMap.get(s) + 1);
            } else {
                //word is not a key, make new key
                wordFreqMap.put(s, 1);
            }
        }
    }

    public void sortMap(){
        //sort hashmap by value: descending
        List<Map.Entry<String, Integer>> list = new LinkedList<>(wordFreqMap.entrySet());
        list.sort((o1, o2) -> -(o1.getValue()).compareTo(o2.getValue()));
        wordFreqMap = swapMaps(list);
        //return isMapSorted();
    }


    private Map<String,Integer> swapMaps( List<Map.Entry<String, Integer>> list){
        //set temp map to equal wordFreq map
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> aa : list){
            temp.put(aa.getKey(),aa.getValue());
        }
        return temp;
    }
}
