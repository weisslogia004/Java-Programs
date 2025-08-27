import java.util.*;
public class array_sum_avg
{
    public static void main(String args[])
    {
        int i,s=0;
        double avg=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 10 NUMBERS:");
        int a[]=new int[10];
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
            s=s+a[i];
            System.out.println("THE SUM IS:"+s);
        }
        avg=s/10;
        System.out.println("THE AVERAGE IS:"+avg);
    }
}
        
        
