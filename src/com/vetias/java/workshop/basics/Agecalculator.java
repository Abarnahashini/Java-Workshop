
import java.time.LocalDate;
import java.util.Scanner;

public class Agecalculator {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
         System.out.println("enter your date of birth:");
          int dob=sc.nextInt();
        int currentyear=LocalDate.now().getYear();
        int age=currentyear-dob;
        System.out.println("Your Age is:"+age);

    }
    
}
