/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex43.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileFunctionsTest {

    @DisplayName("Site: awesomeco, Author: ivy")
    @Test
    void createHTML_returns_true_if_a_index_html_is_created_in_directory1() {
        String siteName = "awesomeco";
        String author = "ivy";
        DirectoryFunctions newDir = new DirectoryFunctions(siteName);
        newDir.makeDirectory();
        FileFunctions newFile = new FileFunctions(siteName, author);
        String created = newFile.createHTML();

        boolean actual = newFile.getHtml().getAbsoluteFile().exists();
        boolean expected = true;

        assertEquals(expected,actual);
    }

    @DisplayName("Site: chipmunks, Author: alvin")
    @Test
    void createHTML_returns_true_index_html_is_created_in_directory_2() {
        String siteName = "chipmunks";
        String author = "alvin";
        DirectoryFunctions newDir = new DirectoryFunctions(siteName);
        newDir.makeDirectory();
        FileFunctions newFile = new FileFunctions(siteName, author);
        String created = newFile.createHTML();

        boolean actual = newFile.getHtml().getAbsoluteFile().exists();
        boolean expected = true;

        assertEquals(expected,actual);
    }

}