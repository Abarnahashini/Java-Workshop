package com.vetias.java.workshop.basics;
import java.time.LocalDate;
import java.util.Scanner;

public class Agecalculator {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
         System.out.println("enter your date of birth:");
        String dob=sc.nextLine();
        LocalDate birthday=LocalDate.parse(dob);
        int year=birthday.getYear();
        int currentyear=LocalDate.now().getYear();
        int age=currentyear-year;
        System.out.println("Your Age is:"+age);
        
    

    }
    
}
