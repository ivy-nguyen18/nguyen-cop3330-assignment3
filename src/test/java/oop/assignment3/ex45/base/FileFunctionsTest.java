/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex45.base;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class FileFunctionsTest {

    @RepeatedTest(10)
    void readFile_returns_correct_string() {
        FileFunctions newFile = new FileFunctions();

        String actual = newFile.readFile();
        String expected = """
                One should never utilize the word "utilize" in writing. Use "use" instead.\r
                For example, "She uses an IDE to write her Java programs" instead of "She\r
                utilizes an IDE to write her Java programs".""";

        assertEquals(expected, actual);
    }

    @Test
    void writeFile_creates_file() {
        String content = "Theodore is the best chipmunk";
        FileFunctions newFile = new FileFunctions();

        boolean expected = true;
        boolean actual = newFile.writeFile(content, "exercise45_output");

        assertEquals(expected, actual);
    }

}