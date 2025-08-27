import java.util.*;
public class series_factorial
{
    public static void main()
    {
        System.out.print("Enter the value of n : ");
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        double S=0,f=0;
        for(i=1;i<n;i++)
        {
            f=fact(i);
            S=S+(1/f);
        }
        System.out.println("The sum ="+S);
    }
   
    public static double fact(int num)
    {
        int f=1,j;
        for(j=1;j<=num;j++)
        {
            f=f*j;
        }
        return(f);
    }
}

