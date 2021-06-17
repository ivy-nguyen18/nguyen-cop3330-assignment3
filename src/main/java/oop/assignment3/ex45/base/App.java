package oop.assignment3.ex45.base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //read the input file
        FileFunctions newFile = new FileFunctions();
        String content = newFile.readFile();

        //replace the words utilize and utilizes with use and uses
        FindWord newContent = new FindWord();
        content = newContent.findAndReplace(content);

        //create output file
        System.out.print("Enter name of output file <filename>.txt: ");
        String nameFile = input.nextLine();
        newFile.setOutputFile(nameFile);

        //write to output file
        newFile.writeFile(content);
    }
}
