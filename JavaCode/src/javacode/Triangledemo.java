 package javacode;
 import java.util.Scanner;
public class Triangledemo {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        double base,height;
        System.out.print("Enter Base: ");
        base=input.nextDouble();
        System.out.print("Enter Height: ");
        height=input.nextDouble();
        double result=0.5*base*height;
        System.out.println("Triangle: "+result);
    }
    
}
