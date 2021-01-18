package javacode;

import java.util.Scanner;

public class Vowel_Consonent {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch;
         while(true)
         {
             System.out.print("Enter an Letter: ");
        ch = input.next().charAt(0);
        if (ch == 'a' || ch == 'A') {
            System.out.println("Vowel");
        } else if (ch == 'e' || ch == 'E') {
            System.out.println("Vowel");
        } else if (ch == 'o' || ch == 'O') {
        } else if (ch == 'i' || ch == 'I') {
            System.out.println("Vowel");
        } else if (ch == 'o' || ch == 'O') {
            System.out.println("Vowel");
        } else if (ch == 'u' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonent");
        }
         }
    }

}
