package javacode;
import java.util.Scanner;
public class InputDemo2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String character;
        System.out.print("Enter Your Name: ");
        character=input.nextLine();
        System.out.println("Character:"+character);
        double num1;
        System.out.print("Enter Double Type Value: ");
        num1=input.nextDouble();
        System.out.println(num1);
    }
    
}
