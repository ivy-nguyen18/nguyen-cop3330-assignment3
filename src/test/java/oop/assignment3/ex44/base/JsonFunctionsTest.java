/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex44.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonFunctionsTest {
    @DisplayName("Read JSON into Inventory List")
    @RepeatedTest(10)
    void readJSON_reads_file_into_inventory_list() {
        JsonFunctions newJson = new JsonFunctions();
        Inventory inventory = newJson.readJSON();

        String actual = "";
        for(Product product: inventory.getProductList()){
            actual += product.getName();
        }

        String expected = "WidgetThingDoodad";

        assertEquals(expected, actual);
    }
}