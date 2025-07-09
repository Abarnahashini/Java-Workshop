package com.vetias.java.workshop.basics;
import java.io.File;

public class Filehandling {
    public static void main(String[] args) {
        File file = new File("src");
        if(file.exists()){
            System.out.println("the file is exists"+file.getAbsolutePath());
        if(file.isDirectory()){
            System.out.println("it is directory");
            File[] files= file.listFiles();
            if(files!=null){
                System.out.println("fles in the directory");
                for (File f:files){
                    System.out.println(f.getName());
                }
            }else{
                    System.out.println("the directory is empty");
                }
            }else{
                System.out.println("it is a file");
            }

        }else{
            System.out.println("the file does not exist.");
        }
    }
}
    

