import java.util.*;
public class prime_fibonacci
{
    public static void main(String args[])
    {
        int i=1;
        int j=1;
        int k=i+j;
        int n;
        int c=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        prime_fibonacci obj=new prime_fibonacci();
        obj.isPrime(c);
        System.out.print(k);
        while(c<=n)
        {
            i=j;
            j=k;
            k=i+j;
            int f=obj.isPrime(k);
            if(f==0)
            {
                System.out.print(k+",");
            }
            c++;
        }
    }
    public int isPrime(int n)
    {
        int f=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                f=1;
            }
        }
        return(f);
    }
}
