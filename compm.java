import java.util.*;
public class compm
{
    public static void main(String args[])
    {
        int i,no,x,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a range between m and n:"); 
        int m=sc.nextInt();
        int n=sc.nextInt();
        compm obj=new compm();
        for(i=m;i<=n;i++)
        {
            no=i;
            f=obj.isPrime(i);
            if(f==1)
            {
                while(i>9)
                {
                    x=obj.sumofdgt(i);
                    i=x;
                }
                if(i==1)
                {
                    System.out.print("The number is:"+no);
                }
            }
        }
    }
    public int isPrime(int n)
    {
        int i;
        int f=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
            }
        }
        return(f);
    }
    public int sumofdgt(int n)
    {
        int s=0,r;
        while(n>0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        return(s);
    }
}
                
            
            