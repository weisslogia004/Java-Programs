import java.util.*;
public class fibo_prime
{
    public static void main(String args[])
    {
        int i=1,j=1,k=i+j,f=0;
        fibo_prime obj=new fibo_prime();
        while(k<=100)
        {
            f=obj.isPrime(k);
            if(f==0)
            {
                System.out.println(k);
            }
            i=j;
            j=k;
            k=i+j;
        }
    }
    int isPrime(int no)
    {
        int i,f=0;
        for(i=2;i<no;i++)
        {
            if(no%2==0)
            {
                f=1;
                break;
            }
        }
        return(f);
    }
}
