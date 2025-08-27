import java.util.*;
public class ASS_7_2020
{
    public static void main(String args[])
    {
        int d,s;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int n=sc.nextInt();
        s=n;
        while(s>9)
        {
            n=s;s=0;
            while(n>0)
            {
                d=n%10;
                s=s+d;
                n=n/10;
            }
        }
        if(s==1)
         System.out.println("THE NUMBER YOU HAVE ENTERED IS A MAGIC NUMBER.");
        else
         System.out.println("THE NUMBER YOU HAVE ENTERED IS NOT A MAGIC NUMBER.");
    }
}
