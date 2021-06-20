/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex45.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindWordTest {

    @DisplayName("Replace Chonky with Thick")
    @Test
    void findAndReplace_replaces_word_in_string1() {
        FindWord newString = new FindWord();

        String content = "the chipmunks are getting chonky and chonky is cute, but not alvin";
        String actual = newString.findAndReplace(content, "chonky", "thick");
        String expected = "the chipmunks are getting thick and thick is cute, but not alvin";

        assertEquals(expected, actual);
    }

    @DisplayName("Replace ' ' with * ")
    @Test
    void findAndReplace_replaces_word_in_string2() {
        FindWord newString = new FindWord();

        String content = "the chipmunks are getting chonky and chonky is cute, but not alvin";
        String actual = newString.findAndReplace(content, " ", "*");
        String expected = "the*chipmunks*are*getting*chonky*and*chonky*is*cute,*but*not*alvin";

        assertEquals(expected, actual);
    }

    @DisplayName("Replace frog with prince and Frog with Prince")
    @Test
    void findAndReplace_replaces_word_in_string_twice() {
        FindWord newString = new FindWord();

        String content = "frog frog frog Frog frog Frog Frog Frog";
        String actual = newString.findAndReplace(content, "frog", "prince");
        actual = newString.findAndReplace(actual, "Frog", "Prince");
        String expected = "prince prince prince Prince prince Prince Prince Prince";

        assertEquals(expected, actual);
    }
}