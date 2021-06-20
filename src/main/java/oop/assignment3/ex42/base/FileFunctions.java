/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Ivy Nguyen
 *
 */
package oop.assignment3.ex42.base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileFunctions {

    public List<Employee> readFiles(List<Employee> employeeList){
        try{
            //read from csv using BufferedReader
            String path = "src/main/java/oop/assignment3/ex42/base/exercise42_input.txt";
            BufferedReader in = new BufferedReader(new FileReader(path));

            //ignore the commas
            String commaDelimiter = ",";
            String line;

            //read each line
            while((line = in.readLine()) != null){

                //each comma separation should be a category in string array
                String[] employeeInfo = line.split(commaDelimiter);

                //Add employee to employeeList
                if(employeeInfo.length > 0){
                    Employee employee = parseEmployeeInfo(employeeInfo);
                    employeeList.add(employee);
                }
            }
        }catch(IOException e){
            //catch any exceptions when doing File IO
            e.printStackTrace();
        }
        return employeeList;
    }

    private Employee parseEmployeeInfo(String [] employeeInfo){
        //parse the String array into categories for the employee object
        String lastName = employeeInfo[0];
        String firstName = employeeInfo[1];
        int salary = Integer.parseInt(employeeInfo[2]);

        return new Employee(firstName, lastName, salary);
    }
}
