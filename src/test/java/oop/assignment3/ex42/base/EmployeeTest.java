/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */

package oop.assignment3.ex42.base;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @RepeatedTest(10)
    void getFirstName_returns_set_first_name() {
        Employee employee = new Employee("Alvin", "Chipmunk", 1000000);

        String expected = "Alvin";
        String actual = employee.getFirstName();

        assertEquals(expected, actual);
    }

    @RepeatedTest(10)
    void getLastName_returns_set_last_name() {
        Employee employee = new Employee("Alvin", "Chipmunk", 1000000);

        String expected = "Chipmunk";
        String actual = employee.getLastName();

        assertEquals(expected, actual);
    }

    @RepeatedTest(10)
    void getSalary_set_get_salary() {
        Employee employee = new Employee("Alvin", "Chipmunk", 1000000);

        int expected = 1000000;
        int actual = employee.getSalary();

        assertEquals(expected,actual);
    }
}