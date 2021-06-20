/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex41.base;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListFunctionsTest {

    @RepeatedTest(10)
    void sortList_returns_a_sorted_list() {
        List<String> list = new ArrayList<>();
        FileFunctions input = new FileFunctions(list);
        list = input.readFile();
        List<String> temp = list;
        ListFunctions nameList = new ListFunctions(list);
        List<String> sortedList = nameList.getList();

        boolean expected = true;
        boolean actual = temp.equals(sortedList);

        assertEquals(expected, actual);
    }

}