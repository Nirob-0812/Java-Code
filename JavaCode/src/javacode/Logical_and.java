 package javacode;
 
import java.util.Scanner;

public class Logical_and {
  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter an Letter: ");
        ch=input.next().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println("Small Letter");
        }
        if(ch>='A' && ch<='Z')
        {
            System.out.println("Capital Letter");
        }
    }
}
