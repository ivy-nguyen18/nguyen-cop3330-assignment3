/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex41.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileFunctionsTest {

    @RepeatedTest(10)
    @DisplayName("List size = input file list size")
    void readFile_should_return_a_list_of_employees_equivalent_to_size_of_list_in_file() {
        List<String> list = new ArrayList<>();
        FileFunctions newFile = new FileFunctions(list);

        int expected = 7;
        int actual = newFile.readFile().size();

        assertEquals(expected, actual);
    }

    @DisplayName("Output File Created in Root Directory")
    @Test
    void writeFile_file_is_created_in_directory() {
        List<String> list = new ArrayList<>();
        FileFunctions newFile = new FileFunctions(list);
        StringBuilder output = new StringBuilder();
        output.append("Alvin and the Chipmunks");

        boolean expected = true;
        boolean actual = newFile.writeFile(output);

        assertEquals(expected, actual);
    }
}