/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex46.base;

import jdk.jfr.Label;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContentTest {

    @DisplayName("Removes New Line")
    @Test
    void parseContent_takes_out_all_newLines_and_replaces_with_space_to_split_string_at_space_into_array() {
        Content content = new Content();
        String[] expected = new String [] {"Chubby", "Chipmunks", "Live", "Forever"};
        String[] actual = content.parseContent("Chubby\nChipmunks\nLive\nForever\n");
        assertArrayEquals(expected, actual);
    }

    @DisplayName("Removes single spaces")
    @Test
    void parseContent_takes_out_all_white_space_to_convert_to_String_array1() {
        Content content = new Content();
        String[] expected = new String [] {"Chubby", "Chipmunks", "Live", "Forever"};
        String[] actual = content.parseContent("Chubby Chipmunks Live Forever ");
        assertArrayEquals(expected, actual);
    }

    @DisplayName("Removes multiple spaces")
    @Test
    void parseContent_takes_out_all_white_space_to_convert_to_String_array2() {
        Content content = new Content();
        String[] expected = new String [] {"Chubby", "Chipmunks", "Live", "Forever"};
        String[] actual = content.parseContent("Chubby          Chipmunks Live Forever ");
        assertArrayEquals(expected, actual);
    }

    @DisplayName("Removes multiple spaces and newlines")
    @Test
    void parseContent_takes_out_all_white_space_and_new_line_to_convert_to_String_array() {
        Content content = new Content();
        String[] expected = new String [] {"Chubby", "Chipmunks", "Live", "Forever"};
        String[] actual = content.parseContent("Chubby          Chipmunks\n Live\n\t Forever ");
        assertArrayEquals(expected, actual);
    }
}