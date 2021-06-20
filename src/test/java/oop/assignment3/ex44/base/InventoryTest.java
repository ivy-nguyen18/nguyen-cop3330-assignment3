/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex44.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    @DisplayName("Thing Product Info")
    @Test
    void searchInventory_returns_information1() {
        HashMap<String, Product> productMap = new HashMap<>();
        JsonFunctions newJson = new JsonFunctions();
        Inventory inventory = newJson.readJSON();
        inventory.setInventoryMap(productMap);

        String expected = String.format("Name: Thing%nPrice: 15.00%nQuantity: 5");
        String actual = inventory.searchInventory("Thing");

        assertEquals(expected,actual);
    }

    @DisplayName("Widget Product Info")
    @Test
    void searchInventory_returns_information2() {
        HashMap<String, Product> productMap = new HashMap<>();
        JsonFunctions newJson = new JsonFunctions();
        Inventory inventory = newJson.readJSON();
        inventory.setInventoryMap(productMap);

        String expected = String.format("Name: Widget%nPrice: 25.00%nQuantity: 5");
        String actual = inventory.searchInventory("Widget");

        assertEquals(expected,actual);
    }

    @DisplayName("Doodad Product Info")
    @Test
    void searchInventory_returns_information3() {
        HashMap<String, Product> productMap = new HashMap<>();
        JsonFunctions newJson = new JsonFunctions();
        Inventory inventory = newJson.readJSON();
        inventory.setInventoryMap(productMap);

        String expected = String.format("Name: Doodad%nPrice: 5.00%nQuantity: 10");
        String actual = inventory.searchInventory("Doodad");

        assertEquals(expected,actual);
    }

    @DisplayName("Ipad present?")
    @Test
    void productPresent_displays_false_for_not_in_inventory1() {
        HashMap<String, Product> productMap = new HashMap<>();
        JsonFunctions newJson = new JsonFunctions();
        Inventory inventory = newJson.readJSON();
        inventory.setInventoryMap(productMap);

        boolean expected = false;
        boolean actual = inventory.productPresent("iPad");

        assertEquals(expected, actual);
    }

    @DisplayName("Galaxy present?")
    @Test
    void productPresent_displays_false_for_not_in_inventory2() {
        HashMap<String, Product> productMap = new HashMap<>();
        JsonFunctions newJson = new JsonFunctions();
        Inventory inventory = newJson.readJSON();
        inventory.setInventoryMap(productMap);

        boolean expected = false;
        boolean actual = inventory.productPresent("Galaxy");

        assertEquals(expected, actual);
    }

    @DisplayName("Thing present?")
    @Test
    void productPresent_displays_true_for_in_inventory1() {
        HashMap<String, Product> productMap = new HashMap<>();
        JsonFunctions newJson = new JsonFunctions();
        Inventory inventory = newJson.readJSON();
        inventory.setInventoryMap(productMap);

        boolean expected = true;
        boolean actual = inventory.productPresent("Thing");

        assertEquals(expected, actual);
    }

    @DisplayName("Widget present?")
    @Test
    void productPresent_displays_true_for_in_inventory2() {
        HashMap<String, Product> productMap = new HashMap<>();
        JsonFunctions newJson = new JsonFunctions();
        Inventory inventory = newJson.readJSON();
        inventory.setInventoryMap(productMap);

        boolean expected = true;
        boolean actual = inventory.productPresent("Widget");

        assertEquals(expected, actual);
    }

    @DisplayName("Doodad present?")
    @Test
    void productPresent_displays_true_for_in_inventory3() {
        HashMap<String, Product> productMap = new HashMap<>();
        JsonFunctions newJson = new JsonFunctions();
        Inventory inventory = newJson.readJSON();
        inventory.setInventoryMap(productMap);

        boolean expected = true;
        boolean actual = inventory.productPresent("Doodad");

        assertEquals(expected, actual);
    }
}