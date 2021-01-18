 package javacode;
 import java.util.Scanner;
 public class CircleDemo {
     public static void main(String[] args) {
         
         Scanner input=new Scanner(System.in);
         double radius;
         System.out.print("Enter Radius of circle: ");
         radius =input.nextDouble();
         double result=3.1416*radius*radius;
         System.out.println("Circle : "+result);
     }
}
