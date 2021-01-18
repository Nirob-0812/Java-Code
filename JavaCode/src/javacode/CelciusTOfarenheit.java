 package javacode;
 import java.util.Scanner;
 
public class CelciusTOfarenheit {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        double cels;
        System.out.print("Enter Celcius value: ");
        cels=input.nextDouble();
        double Farn=1.8*cels+32;
        System.out.println("Farenheit Value : "+Farn);
    }
   
}
