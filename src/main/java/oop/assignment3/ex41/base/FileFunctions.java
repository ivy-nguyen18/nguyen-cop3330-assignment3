package oop.assignment3.ex41.base;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileFunctions {
    private List<String> input;

    public FileFunctions(List<String> input){
        //instantiate lists
        this.input = input;
    }

    public List<String> readFile(){

        //create a List for Employee and return list back to main
        try{
            input = Files.readAllLines(Paths.get("src/main/java/oop/assignment3/ex41/base/exercise41_input.txt"), Charset.defaultCharset());
        }catch(IOException e){
            e.printStackTrace();
        }
        return input;
    }
}
