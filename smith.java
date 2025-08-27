import java.util.*;
public class smith
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int n=sc.nextInt();
        smith obj=new smith();
        int w=obj.sumdig(n);
        int x=obj.sumPrime(n);
        System.out.println("SUM OF THE DIGITS:"+w);
        System.out.println("SUM OF THE PRIME FACTORS:"+x);
        if(w==x)
        {
            System.out.println(n+" IS A SMITH NUMBER.");
        }
        else
        {
            System.out.println(n+" IS NOT A SMITH NUMBER.");
        }
    }
    public int sumdig(int n)
    {
        int r,s=0;
        while(n!=0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        return s;
    }
    public int sumPrime(int n)
    {
        int i=2,s1=0;
        while(n>1)
        {
            if(n%i==0)
            {
                s1=s1+sumdig(i);
                n=n/i;
            }
            else
            {
                i++;
            }
        }
        return s1;
    }
}
        
    