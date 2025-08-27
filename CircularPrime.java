import java.util.Scanner;
public class CircularPrime
{
    public static void main(String args[])
    {
        int flag=0;
        int n,no,r,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        n=sc.nextInt();
        no=n;
        CircularPrime obj=new CircularPrime();
        int x=obj.isPrime(n);
        while(no > 0)
        {
            r=no%10;
            c++;
            no=no/10;
        }
        no=n;
        for (int i=1;i<=c;i++)
        {
            r=no%10;
            no=no/10;
            no=(r*(int)Math.pow(10,c-1))+no;
            if(x==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Circular Prime");
        }
        else
        {
            System.out.println("Not Circular Prime");
        }
    }
    public int isPrime(int n)
    {
        int i = 2;
        int flag=0;
        while (n>i)
        {
            if (n%2==0)
            {
                flag=1;
                break;
            }
            i++;
        }
        return(flag);
    }
}