package oop.assignment3.ex41.base;

import java.util.Collections;
import java.util.List;

public class ListFunctions {
    private final List<String> list;

    public ListFunctions(List<String> list){
        //instantiate list
        this.list = list;
    }

    public void sortList(){
        //sort List in alphabetical order using Java's sort function
        Collections.sort(list);
    }

    public void printList(){
        formatTable();
        //print List using Java List's foreach
        list.forEach(System.out::println);
    }

    private void formatTable(){
        //create the table with the size of list
        System.out.printf("Total of %s names%n", list.size());
        String dash = "-";
        System.out.println(dash.repeat(20));
    }
}
