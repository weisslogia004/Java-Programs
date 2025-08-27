import java.util.*;
public class pathfinder_q5
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER:");
        int n1=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER:");
        int n2=sc.nextInt();
        int s1=0,s2=0;
        for(i=1;i<n1;i++)
        {
            if(n1%i==0)
            {
                s1+=i;
            }
        }
        for(i=1;i<n2;i++)
        {
            if(n2%i==0)
            {
                s2+=i;
            }
        }
        if((s1==n2) && (s2==n1))
        {
            System.out.println("THESE NUMBERS ARE AMICABLE!!!");
        }
        else
        {
            System.out.println("THESE NUMBERS ARE NOT AMICABLE!!!");
        }
    }
}
            