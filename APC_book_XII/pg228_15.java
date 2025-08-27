import java.util.*;
public class pg228_15
{
    public static void main(String args[])
    {
        long p,c;
        int f1=1,f2=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        System.out.print("Enter value of r:");
        int r=sc.nextInt();
        int d=n-r;
        pg228_15 obj=new pg228_15(); 
        int x=obj.facto(n);
        int y=obj.facto(d);
        int z=obj.facto(r);
        p=x/y;
        c=x/(y*z);
        System.out.println("Permutations(nPr) is:"+p);
        System.out.println("Combinations(nCr) is:"+c);
    }
    int facto(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            
            {
                f=f*i;
            }
        }
        return(f);
    }
}