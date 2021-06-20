/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex46.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileFunctionsTest {

    @DisplayName("Content from File")
    @Test
    void readFile() {
        FileFunctions file = new FileFunctions();
        String expected = """
                badger badger badger\r
                badger mushroom\r
                mushroom snake badger badger\r
                badger""";
        String actual = file.readFile();
        assertEquals(expected, actual);
    }
}