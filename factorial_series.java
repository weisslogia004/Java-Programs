import java.util.*;
public class factorial_series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        double s=0;
        System.out.print("ENTER THE VALUE:");
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            int f=1;
            for(j=1;j<=i;j++)
            {
                f=f*j;
            }
            s=s+(double)1/f;
        }
        System.out.println("THE SUM OF THE SERIES IS:"+s);
    }
}

        
        
        

