/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex44.base;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    @RepeatedTest(10)
    void getName_returns_set_name() {
        Product product = new Product("Alvin", 3.00, 1);

        String expected = "Alvin";
        String actual = product.getName();

        assertEquals(expected,actual);
    }

    @RepeatedTest(10)
    void getPrice_returns_set_price() {
        Product product = new Product("Alvin", 3.00, 1);

        double expected = 3.00;
        double actual = product.getPrice();

        assertEquals(expected,actual);
    }

    @RepeatedTest(10)
    void getQuantity_returns_set_quantity() {
        Product product = new Product("Alvin", 3.00, 1);

        int expected = 1;
        int actual = product.getQuantity();

        assertEquals(expected,actual);
    }
}