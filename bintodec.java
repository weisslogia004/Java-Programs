import java.util.*;
public class bintodec
{
    public static void main(String args[])
    {
        int c=0;
        double d=0,r;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A BINARY(NUMBER WITH BASE 2)NUMBER:");
        int n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            d=d+r*Math.pow(2,c);
            n=n/10;
            c++;
        }
        System.out.println("THE DECIMAL EQUIVALENT OF THE NUMBER YOU HAVE ENTERED IS:"+(int)d);
    }
}
        
        