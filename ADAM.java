import java.util.*;
public class ADAM
{
    public static void main(String args[])
    {
        int rev=0,rev2=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int sq=n*n;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        while(sq>0)
        {
            int r2=sq%10;
            rev2=rev2*10+r2;
            sq=sq/10;
        }
        int sq2=rev*rev;
        if(sq2==rev2)
        {
            System.out.println("This is an ADAM number!!!");
        }
        else
        {
            System.out.println("This is an not ADAM number!!!");
        }
    }
}
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            