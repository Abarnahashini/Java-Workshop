package com.vetias.java.workshop.basics;



public class Wordscount {
    
     public static void main(String[] args) {
        String sentence="this program show how can we split a string into muliple strings.we need to find sentance,word,and letter count in a string";
        String sen[]=sentence.split("\\.");
        int line=sen.length;
         System.out.println("no of lines"+line);

        String words[]=sentence.split(" ");
        int wordcount=words.length;
        System.out.println("no of words:"+wordcount);
        String letter[]=sentence.split("");
        int Letters=letter.length;
         System.out.println("no of letters:"+Letters);




    
}
}