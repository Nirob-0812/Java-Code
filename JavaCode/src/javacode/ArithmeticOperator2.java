 package javacode;
 import java.util.Scanner;
 public class ArithmeticOperator2 {
     public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         int num1,num2,result;
         System.out.print("Enter First Number: ");
          num1= input.nextInt();
          System.out.print("Enter Second Number: ");
          num2= input.nextInt();
         result=num1+num2;
         System.out.println("Addition: "+result);
         result=num1-num2;
         System.out.println("Substruction: "+result);
         result=num1*num2;
         System.out.println("Multiplication: "+result);
         double result1=(double)num1/num2;
         System.out.printf("Divition: %.2f\n",result1);
         result=num1%num2;
         System.out.println("Remember: "+result);
     }
    
}
