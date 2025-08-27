import java.util.*;
public class twin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int n=sc.nextInt();
        int no=sc.nextInt();
        twin obj=new twin();
        int a=obj.isPrime(n);
        int b=obj.isPrime(no);
        if((n-no==2||no-n==2)&&(a==b&&b==2))
        {
            System.out.println("Twin prime");
        }
        else
        {
            System.out.println("NOT Twin Prime");
        }
    }
    int isPrime(int n)
    {
        int i,flag=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
            return(flag);
        }
    }
}
        