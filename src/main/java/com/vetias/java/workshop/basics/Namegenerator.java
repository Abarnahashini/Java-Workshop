package com.vetias.java.workshop.basics;

import java.util.Scanner;
import javax.management.BadAttributeValueExpException;

public class Namegenerator {
    public static void main(String[]args) throws BadAttributeValueExpException{
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name:");
        String name=sc.next();
        System.out.println("enter your gender:");
        String gender=sc.next();
        System.out.println("enter your qualification:");
        String qualify=sc.next();
        String title=null;
        if("male".equalsIgnoreCase(gender)){
            title="Mr.";


        }else if("female".equalsIgnoreCase(gender)){
            title="Ms. ";
        }
        else{
            throw new BadAttributeValueExpException("invalid gender");
        }
        StringBuilder finalname=new StringBuilder();
        finalname.append(title).append(name).append(", ").append(qualify);
        System.out.println(finalname);



        

        
    

    }
}
