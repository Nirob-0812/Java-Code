 
package javacode;
 
public class Bitwise_Operator1 {
    public static void main(String[] args) {
        
        int c, num1=32,num2=12;
        c=num1&num2;
        System.out.println("num1 & num2: "+c);
        c=num1|num2;
        System.out.println("num1 | num2: "+c);
        c=num1^num2;
        System.out.println("num1 ^ num2: "+c);
        c=num1>>3; //1:32/2=16 2:16/2=8 3:8/2=4
        System.out.println("num1 ^ num2: "+c);
        c=num1<<3; //1:32*2=64 2:64*2=128 3:128*2=256
        System.out.println("num1 ^ num2: "+c);
        
    }
    
}
