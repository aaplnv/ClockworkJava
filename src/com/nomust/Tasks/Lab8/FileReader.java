package com.nomust.Tasks.Lab8;

import java.io.*;
import java.util.Scanner;

public class FileReader {

    private static String path = "note.txt";

    public static void main(String[] args) {
        File f = new File(path);
        if(!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                System.out.println("Can't create file");
            }
        }
        try(FileWriter writer = new FileWriter(path, false))
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("What do you want to record?");
            String text = keyboard.nextLine();
            writer.write(text);
            writer.flush();
            System.out.println("Done!");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
