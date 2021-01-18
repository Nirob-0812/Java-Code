package javacode;
 
public class Increment_Decrement {
    public static void main(String[] args) {
        
        int y, x=25;
        y=--x; //x=24
        System.out.println("Postfix incrrement: "+y);
        y=x++; //x=24
        System.out.println("Prefix increment: "+y);
        y=x--;//x=25
        System.out.println("Postfix Decrement: "+y);
        y=--x;//x=23
        System.out.println("Prefix Decrement: "+y);
    }
}
