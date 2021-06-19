

package oop.assignment3.ex43.base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileFunctions {

    private File html;
    private final String siteName;
    private final String author;

    public FileFunctions(String siteName, String author){
        this.siteName = siteName;
        this.author = author;
    }

    public boolean createHTML(){
        //add file to directory
        String pathHtml = String.format("%s/index.html", siteName);
        this.html = new File(pathHtml);
        return html.exists();
    }

    public void writeToHTML(){
        //write to file
        String htmlSkeleton = formatHTML();
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(html));
            bw.write(htmlSkeleton);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String formatHTML(){
        //format html tags and skeleton
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\"\n>" +
                "<head>\n" +
                String.format("<meta name =\"author\" content =\"%s\">%n",author) +
                String.format("<title>%s</title>%n",siteName) +
                "</head>\n" +
                "</html>";
    }

}
