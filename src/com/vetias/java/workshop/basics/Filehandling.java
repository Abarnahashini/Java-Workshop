package com.vetias.java.workshop.basics;

import java.awt.SystemTray;
import java.io.File;

public class Filehandling {
    public static void main(String[] args) {
        File file = new File("src");
        if(file.exists()){
            System.out.println("the file is exists"+file.getAbsolutePath());
        }
        else{
            System.out.println("the file doesnt exits");
        }
        if(file.isDirectory()){
            System.out.println("it is directory");
            File[] files= file.listFiles();
            if(files!=null){
                System.out.println("fles in the directory");
                for (File f:files){
                    System.out.println(f.getName());

                }
            else {
                    System.out.println("the directory is empty");
                }
            }
         }
    }}
    

