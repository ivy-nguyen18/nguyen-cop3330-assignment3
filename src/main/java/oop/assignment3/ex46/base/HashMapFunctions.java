/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */
package oop.assignment3.ex46.base;

import java.util.*;

public class HashMapFunctions {
    //create hashmap to store frequency counter
    private Map<String,Integer> wordFreqMap;

    
    public Map<String,Integer> getWordFreqMap(){
        //getter to return wordFreqMap
        return wordFreqMap;
    }


    public HashMapFunctions(Map<String, Integer> wordFreqMap) {
        //instantiate wordFreqMap
        this.wordFreqMap = wordFreqMap;
    }

    public boolean setKeys(String [] arr) {
        //add to hashmap by frequency: key is word, value is frequency
        for (String s : arr) {
            //word is already a key, increase value/frequency by 1
            if (wordFreqMap.containsKey(s)) {
                wordFreqMap.put(s, wordFreqMap.get(s) + 1);
            } else {
                //word is not a key, make new key and set frequency/value to 1
                wordFreqMap.put(s, 1);
            }
        }
        return areKeysUnique();
    }

    private boolean areKeysUnique(){
        //check if there are no repeated keys (aka words)
        boolean unique = true;
        ArrayList<String> uniqueKey = new ArrayList<>(wordFreqMap.keySet());
        for(int i = 0; i < uniqueKey.size(); i++){
            for (int j = i + 1; j < uniqueKey.size(); j++){
                //if there is a repeated key, unique = false
                if (uniqueKey.get(i).equals(uniqueKey.get(j))) {
                    unique = false;
                    break;
                }
            }
        }
        return unique;
    }

    public boolean sortMap(){
        //sort hashmap by value: descending
        List<Map.Entry<String, Integer>> list = new LinkedList<>(wordFreqMap.entrySet());
        list.sort((o1, o2) -> -(o1.getValue()).compareTo(o2.getValue()));
        wordFreqMap = swapMaps(list);
        return isMapSorted();
    }

    private boolean isMapSorted(){
        //check if values in map are sorted in descending order
        boolean isSorted = true;
        ArrayList<Integer> sortedValues = new ArrayList<>(wordFreqMap.values());
        for(int i = 0; i < sortedValues.size(); i++){
            for (int j = i + 1; j < sortedValues.size(); j++){
                //if map is not sorted in descending order, isSorted = false
                if (sortedValues.get(i) < sortedValues.get(j)) {
                    isSorted = false;
                    break;
                }
            }
        }
        return isSorted;
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
