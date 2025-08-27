import java.util.*;
public class dectobin
{
    public static void main(String args[])
    {
        int n,r;
        String d=" ";
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A DECIMAL(NUMBER WITH BASE 10)NUMBER:");
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%2;
            d=Integer.toString(r)+d;
            n=n/2;
        }
        System.out.println("THE BINARY EQUIVALENT OF THE DECIMAL NUMBER YOU HAVE ENTERED IS:"+d);
    }
}