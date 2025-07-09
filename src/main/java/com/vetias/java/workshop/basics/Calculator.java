package com.vetias.java.workshop.basics;

public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
       public int sub(int a,int b){
        return a-b;
    }
       public int divide(int a,int b){
                
            if(b!=0){
                throw new ArithmeticException("division by zero is not allowed");

            }else{
                return a/b;

            }
            
        
    
    }
    public static void main(String[]args){

        Calculator calc=new Calculator();
        System.out.println("Division:"+ calc.divide(15,0));
        System.out.println("Addtion"+calc.add(5,3));
        System.out.println("Addtion"+calc.sub(5,3));

    
            
        
        
    }
    
}
