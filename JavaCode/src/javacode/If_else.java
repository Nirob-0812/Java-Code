 package javacode;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        int num;
        System.out.print("Enter an Number: ");
        num=input.nextInt();
        if(num>0)
        {
            System.out.println("Positive");
        }
        else if(num==0)
            System.out.println("Zero");
        else 
            System.out.println("Negative");
    }
}
