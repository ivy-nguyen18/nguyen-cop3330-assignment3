/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex43.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectoryFunctionsTest {

    @Test
    void makeDirectory_returns_string_of_working_directory_of_file() {
        String siteName = "awesomeco";
        DirectoryFunctions newDir = new DirectoryFunctions(siteName);

        String expected = String.format("Created ./website/%s%n", siteName);
        String actual = newDir.makeDirectory();

        assertEquals(expected, actual);
    }

    @Test
    void makeJavascriptFolder_returns_string_of_working_directory_of_file() {
        String siteName = "awesomeco";
        DirectoryFunctions newDir = new DirectoryFunctions(siteName);
        String dir = newDir.makeDirectory();

        String expected = String.format("Created ./website/%s/js/%n", siteName);
        String actual = newDir.makeJavascriptFolder();

        assertEquals(expected, actual);
    }

    @Test
    void makeCSSFolder_returns_string_of_working_directory_of_file() {
        String siteName = "awesomeco";
        DirectoryFunctions newDir = new DirectoryFunctions(siteName);
        String dir = newDir.makeDirectory();

        String expected = String.format("Created ./website/%s/css/%n", siteName);
        String actual = newDir.makeCSSFolder();

        assertEquals(expected, actual);
    }
}