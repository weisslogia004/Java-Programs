import java.util.*;
public class sum_array
{
    public static void main(String args[])
    {
        int i,se=0,so=0,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 20 NUMBERS");
        int a[]=new int[20];
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
        if(c==0)
        {
            System.out.println("THE numbers are"+se);
        }
    }
 }
}
        
