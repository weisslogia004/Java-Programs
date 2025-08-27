import java.util.*;
public class prime
{
    public static void main(String args[])
    {
        int i,n,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
            flag=1;
            break;
            }
        }
        if(flag==1)
        {
            System.out.println("NOT A PRIME NUMBER");
        }
        else
        {
            System.out.println("A PRIME NUMBER");
        }
    }
}
            
            
        