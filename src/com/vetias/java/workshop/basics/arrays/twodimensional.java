package src.com.vetias.java.workshop.basics.arrays;

import java.util.Arrays;

public class twodimensional {
    public static void main(String[] args){
        String employeedetails[][]=new String [5][2];
        employeedetails[0][0]="1001";
        employeedetails[0][1]="50,000";
        employeedetails[1][0]="1002";
        employeedetails[1][1]="55,000";
        employeedetails[2][0]="1003";
        employeedetails[2][1]="50,000";
        employeedetails[3][0]="1004";
        employeedetails[3][1]="60,000";
        employeedetails[4][0]="1005";
        employeedetails[4][1]="70,000";
        for(String[]employee:employeedetails){
            System.out.println(Arrays.toString(employee));

        }





    }
    
}
