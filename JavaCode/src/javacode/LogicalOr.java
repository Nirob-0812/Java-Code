 
package javacode;
 
import java.util.Scanner;

public class LogicalOr {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num;
        System.out.println("Enter an number: ");
        num=input.nextInt();
        if(num==1 || num==2 || num==3 || num==4 || num==5)
        {
            System.out.println("Number Between one to five");
        }
        else
        {
            System.out.println("less or greater then out of one to five");
        }
    }
}
