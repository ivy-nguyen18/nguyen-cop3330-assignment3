package oop.assignment3.ex45.base;

public class FindWord {
    public String findAndReplace(String content){
        //replace the words
        return content.replaceAll("utilize", "use").replaceAll("utilizes", "uses");
    }
}
