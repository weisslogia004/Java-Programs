import java.util.*;
public class ASS_9_2020
{
    int sumDigit(int n)
    {
        int s=0;
        while(n>0)
        {
            s=s+n%10;
            n=n/10;
        }
        return s;
    }
int sumPrimeFact(int n)
{
        int i=2,sum=0;
        while(n>1)
        {
        if(n%i==0)
        {
             sum=sum+sumDigit(i);
             n=n/i;
        }
        else
        {
            do
            {
                i++;
            }
            while(!IsPrime(i));
        }
    }
    return sum;
}
boolean IsPrime(int k)
{
    boolean b=true;
    int d=2;
    while(d<Math.sqrt(k))
    {
        if(k%d==0)
        {
            b=false;
        }
        d++;
    }
    return b;
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    ASS_9_2020 obj=new ASS_9_2020();
    System.out.print("ENTER A NUMBER:");
    int n=sc.nextInt();
    int a=obj.sumDigit(n);
    int b=obj.sumPrimeFact(n);
    System.out.println("SUM OF DIGIT="+a);
    System.out.println("SUM OF PRIME FACTOR="+b);
    if(a==b)
    {
        System.out.println("THIS IS A SMITH NUMBER.");
    }
    else
    {
        System.out.println("THIS IS NOT A SMITH NUMBER");
    }
}
}

    
    
    
        
   