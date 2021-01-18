 
package Codeforces_Plm;
 
import java.util.Scanner;

public class George_Accommodation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t,c=0,p,q;
        t=input.nextInt();
        for(int i=0;i<t;i++)
        {
            p=input.nextInt();
            q=input.nextInt();
            p=p+2;
            if(p<=q)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
