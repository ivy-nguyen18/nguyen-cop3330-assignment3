/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex46.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class HashMapFunctionsTest {

    @DisplayName("Unique Keys")
    @RepeatedTest(10)
    void setKeys_no_two_keys_are_same1() {
        Map<String, Integer> map = new TreeMap<>();
        HashMapFunctions newMap = new HashMapFunctions(map);

        String[] arr = {"alvin", "alvin", "theodore", "theodore", "simon", "chipmunks", "chubsters"};

        boolean expected = true;
        boolean actual = newMap.setKeys(arr);

        assertEquals(expected, actual);

    }

    @DisplayName("Unique Keys: Mixed Cap")
    @RepeatedTest(10)
    void setKeys_no_two_keys_are_same2() {
        Map<String, Integer> map = new TreeMap<>();
        HashMapFunctions newMap = new HashMapFunctions(map);

        String[] arr = {"alvin", "ALVIN", "Theodore", "theOdore", "simon", "chipmunks", "chubsters"};

        boolean expected = true;
        boolean actual = newMap.setKeys(arr);

        assertEquals(expected, actual);

    }

    @DisplayName("Key Iteration 1")
    @RepeatedTest(10)
    void setKeys_iterate_if_same_key1() {
        Map<String, Integer> map = new TreeMap<>();
        HashMapFunctions newMap = new HashMapFunctions(map);

        String[] arr = {"alvin", "alvin", "theodore", "theodore", "simon", "chipmunks", "chubsters"};
        newMap.setKeys(arr);

        int actual = 0;
        int expected = 2;

        for(Map.Entry<String, Integer> entry: newMap.getWordFreqMap().entrySet()){
            if(entry.getKey().equals("alvin")){
                actual = entry.getValue();
            }
        }

        assertEquals(expected, actual);
    }

    @DisplayName("Key Iteration 2")
    @RepeatedTest(10)
    void setKeys_iterate_if_same_key2() {
        Map<String, Integer> map = new TreeMap<>();
        HashMapFunctions newMap = new HashMapFunctions(map);

        String[] arr = {"alvin", "alvin", "theodore", "theodore", "theodore", "chipmunks", "chubsters"};
        newMap.setKeys(arr);

        int actual = 0;
        int expected = 3;

        for(Map.Entry<String, Integer> entry: newMap.getWordFreqMap().entrySet()){
            if(entry.getKey().equals("theodore")){
                actual = entry.getValue();
            }
        }

        assertEquals(expected, actual);
    }

    @DisplayName("Value sorted in Descending Order 1")
    @RepeatedTest(10)
    void sortMap_sorts_values_in_descending_order1() {
        Map<String, Integer> map = new TreeMap<>();
        HashMapFunctions newMap = new HashMapFunctions(map);

        map.put("chipmunks", 7);
        map.put("alvin", 8);
        map.put("simon",2);
        map.put("theodore", 100);

        boolean expected = true;
        boolean actual = newMap.sortMap();

        assertEquals(expected, actual);
    }

    @DisplayName("Value sorted in Descending Order 2")
    @RepeatedTest(10)
    void sortMap_sorts_values_in_descending_order2() {
        Map<String, Integer> map = new TreeMap<>();
        HashMapFunctions newMap = new HashMapFunctions(map);

        map.put("chipmunks", 1);
        map.put("alvin", 2);
        map.put("simon",3);
        map.put("theodore", 4);

        boolean expected = true;
        boolean actual = newMap.sortMap();

        assertEquals(expected, actual);
    }
}