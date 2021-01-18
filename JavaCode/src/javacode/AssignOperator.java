 package javacode;

 public class AssignOperator {
    
     public static void main(String[] args) {
         
         int x,y;
         x=10;
         y=3;
         x+=y;//10+3=10 x=13
         System.out.println("Addition: "+x);
         x-=y;//13-3=10 x=10
         System.out.println("Substruction: "+x);
         x*=y;//10*3=30 x=30
         System.out.println("Multiplication: "+x);
         x/=y;//30/3=10 x=10
         System.out.println("Division: "+x);
         x%=y;//10%3=1
         System.out.println("Remember: "+x);
     }
}
