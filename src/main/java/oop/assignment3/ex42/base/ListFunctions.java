package oop.assignment3.ex42.base;

import java.util.List;

public class ListFunctions {
    public void printList(List<Employee> employeeList){
        createTableHeaders();
        //print the employee information by iterating through list
        for(Employee e: employeeList){
            System.out.printf("%-10s%-10s%-10d%n", e.getLastName(),e.getFirstName(), e.getSalary());
        }
    }

    private void createTableHeaders(){
        //create table headers
        String dash = "-";
        System.out.printf("%-10s%-10s%-10s%n", "Last", "First", "Salary");
        System.out.println(dash.repeat(26));

    }
}
