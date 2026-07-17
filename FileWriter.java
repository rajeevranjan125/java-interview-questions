package com.dump;

public class FileWriter {

    public static void main(String[] args) {

        try( java.io.FileWriter writer = new java.io.FileWriter("intro.txt", true)){

            writer.write("\ni have passed out from GU");
            System.out.println("written in file ");

        } catch (Exception e) {
            System.out.println("file creation failed");
            e.printStackTrace();
        }
    }
}
