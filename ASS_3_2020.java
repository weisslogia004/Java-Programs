import java.util.*;
public class ASS_3_2020
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
            r=n%8;
            d=Integer.toString(r)+d;
            n=n/8;
        }
        System.out.println("THE OCTAL EQUIVALENT OF THE DECIMAL NUMBER YOU HAVE ENTERED IS:"+d);
    }
}