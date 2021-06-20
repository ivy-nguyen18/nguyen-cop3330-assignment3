/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex42.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileFunctionsTest {

    @DisplayName("No commas")
    @RepeatedTest(10)
    void readFiles_should_return_a_list_without_any_commas() {
        List<Employee> employeeList = new ArrayList<>();
        FileFunctions input = new FileFunctions();
        employeeList = input.readFiles(employeeList);

        boolean expected = true;
        boolean actual = true;
        for(Employee e: employeeList){
            if(e.getFirstName().contains(",") || e.getLastName().contains(",")){
                actual = false;
                break;
            }
        }
        assertEquals(expected, actual);
    }

    @DisplayName("Employee List size = 7")
    @RepeatedTest(10)
    void readFiles_should_return_a_list_of_Employee() {
        List<Employee> employeeList = new ArrayList<>();
        FileFunctions input = new FileFunctions();
        employeeList = input.readFiles(employeeList);

        int expected = 7;
        int actual = employeeList.size();

        assertEquals(expected, actual);
    }
}