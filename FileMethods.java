package com.dump;

import java.io.File;
import java.util.Scanner;

public class FileMethods {
    public static void main(String[] args) {
        File file = new File("intro.txt");

        if(file.exists()){
            System.out.println("file name is :"+file.getName());
            System.out.println("file path is: "+file.getAbsolutePath());
            System.out.println("file can writable: "+file.canWrite());
            System.out.println("file can readble: "+file.canRead());
            System.out.println("length of file in bytes: "+file.length());
        }else {
            System.out.println("file not found");
        }
    }
}
