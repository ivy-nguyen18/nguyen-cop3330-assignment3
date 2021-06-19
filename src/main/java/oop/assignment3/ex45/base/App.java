package oop.assignment3.ex45.base;


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
        System.out.print("Enter name of output file: ");
        String nameFile = input.nextLine();
        newFile.setOutputFile(nameFile);

        //write to output file
        newFile.writeFile(content);
    }
}
