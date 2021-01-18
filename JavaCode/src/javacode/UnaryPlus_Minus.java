 package javacode;
 
import java.util.Scanner;

public class UnaryPlus_Minus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x;
        System.out.print("Enter an Number: ");
        x=input.nextInt();
        x= +x;
        System.out.println("Unary Plus: "+x);
        x= -x;
        System.out.println("Unary Minus: "+x);
    }
}
