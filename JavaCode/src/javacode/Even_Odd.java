 package javacode;
 
import java.util.Scanner;

public class Even_Odd {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        int num;
        System.out.print("Enter an Number: ");
        num=input.nextInt();
        if(num%2==0)
        {
            System.out.println("Even number");
        }
        else 
            System.out.println("Odd Number");
    }
}
