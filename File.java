package com.dump;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class File {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        try{

            java.io.File file = new java.io.File("C:\\Users\\RajeevRanjanPrasad\\Desktop\\gitgithub\\java dump learning\\src\\main\\java\\com\\ibm\\hero.txt");

            if(file.createNewFile()){
                System.out.println(file.getName()+" file created successfully");
            }else{
                System.out.println(file.getName()+" file already created");
            }
        } catch (Exception e) {

            throw new RuntimeException(e.getMessage());
        }
    }
}