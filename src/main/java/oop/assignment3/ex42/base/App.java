package oop.assignment3.ex42.base;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args){
        //make an employee list to put inputs
        List<Employee> employeeList = new ArrayList<>();

        //read from csv
        FileFunctions input = new FileFunctions();
        employeeList = input.readFiles(employeeList);

        //print list of employees in table format
        ListFunctions list = new ListFunctions();
        list.printList(employeeList);

    }
}
