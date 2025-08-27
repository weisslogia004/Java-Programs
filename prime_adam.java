import java.util.*;
public class prime_adam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,a,p,sq,r1;
        System.out.print("Enter a string:");
        String str=sc.nextLine();
        System.out.print("Enter a Range:");
        m=sc.nextInt();
        n=sc.nextInt();
        prime_adam obj=new prime_adam();
        for(i=n;i<=n;i++)
        {
            a=i;
            f=obj.isPrime(a);
            if(p==0)
            {
                sq=a*a;
                r1=obj.reverse(a);
                r2=obj.reverse(sq);
                sq=r1*r1;
                if(sq2==r2)
                {
                    System.out.println(a);
                }
            }
            int isPrime(int x);
            {
                int i,flag=0;
                for(i=2;i<n;i++)
                {
                    if(n%i==0)
                    {
                        flag=1;
                    }
                    return(flag);
                }
            }
            int reverse(int no);
            {
                int r,rev=0;
                while(no>0)
                {
                    r=no%10;
                    rev=rev*10+r;
                    no=no/10;
                }
                return(rev);
            }
        }
    }
        