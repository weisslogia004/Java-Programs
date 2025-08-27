import java.util.*;
public class perfect_no
{
    public static void main(String args[])
    {
        int i,n,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==n)
        {
            System.out.println("PERFECT NUMBER");
        }
        else
        {
            System.out.println("NOT A PERFECT NUMBER");
        }   
    }
}
        