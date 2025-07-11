package com.vetias.java.workshop.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class orderedlist {
    public static void main(String[] args){
        List<Integer> marks=new ArrayList<>();
        marks.add(56);
        marks.add(90);
        marks.add(67);
        marks.add(90);
        marks.add(89);
        System.out.println("mark list"+marks);
        marks.sort(Comparator.naturalOrder());
        System.out.println("sorted list"+marks);
         marks.sort(Comparator.reverseOrder());
        System.out.println("descending order list"+marks);
        System.out.println("maximum value of the list:"+marks.getFirst());
    
    }
    
}
