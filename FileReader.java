package com.dump;

import java.io.FileNotFoundException;
import java.util.Scanner;
import  java.io.File;
public class FileReader {

    public static void main(String[] args)  {

        File file = new File("intro.txt");

       try( Scanner sc = new Scanner(file)){
           while(sc.hasNextLine()){

               String data = sc.nextLine();
               System.out.println(data);
           }

       } catch (FileNotFoundException e) {
           System.out.println("file not found");
           e.printStackTrace();
       }
    }
}
