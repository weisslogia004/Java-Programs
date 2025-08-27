import java.util.*;
public class ArrP228Q5
{
    public static void main(String args[])
    {
        int se=0,so=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 20 NUMBERS:");
        int a[]=new int[20];
        for(i=0;i<20;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<20;i++)
        {
            if(a[i]%2==0)
            {
                se=se+a[i];
            }
            else
            {
                so=so+a[i];
            }
        }
        System.out.println("THE SUM OF THE EVEN NUMBERS IN THE ARRAY IS:"+se);
        System.out.println("THE SUM OF THE ODD NUMBERS IN THE ARRAY IS:"+so);
    }
}
            
        