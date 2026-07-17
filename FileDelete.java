package com.dump;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {

//        File file = new File("C:\\Users\\RajeevRanjanPrasad\\Desktop\\gitgithub\\java dump learning\\src\\main\\java\\com\\ibm\\hero.txt");

        File file = new File("C:\\Users\\RajeevRanjanPrasad\\Desktop\\gitgithub\\java dump learning\\src\\main\\java\\com\\ibm");

        if(file.delete()){
            System.out.println(file.getName()+"file deleted successfully ");
        }else{
            System.out.println("not able to delete the file "+ file.getName());
        }
    }
}
