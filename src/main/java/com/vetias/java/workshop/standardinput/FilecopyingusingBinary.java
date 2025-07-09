package com.vetias.java.workshop.standardinput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilecopyingusingBinary {
    public static void main(String[] args) {
        
    
try(FileInputStream inputStream = new FileInputStream("input.jpg");
    FileOutputStream outputstream= new FileOutputStream("output.jpg"))
    {
        byte[] chunk= new byte[1024];
        int byteread;
        while((byteread= inputStream.read(chunk))!=-1){
            outputstream.write(chunk,0,byteread);

        }
    }  catch(IOException e){
        System.out.println("error in reading or writing file");
    }

    
}
    }

