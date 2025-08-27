import java.util.*;
public class PRONIC_NUMBER
{
    public static void main(String args[])
    {
        int t,i,p=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            t=i*(i+1);
            if(t==n)
            {
                p=1;
                System.out.println(n+" IS A PRONIC NUMBER");
                break;
            }
        }
        if(p==0)
        {
            System.out.println(n+" IS NOT A PRONIC NUMBER");
        }
    }
}
        
            