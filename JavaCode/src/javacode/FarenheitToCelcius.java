 package javacode;
 
import java.util.Scanner;

public class FarenheitToCelcius {
 
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        double farn;
        System.out.print("Enter Farenheit value: ");
        farn=input.nextDouble();
        double result=0.5555555556*(farn-32);
        System.out.println("Celcius Value: "+result);
        
    }
}
