import java.util.*;
public class array2
{
    public static void main(String args[])
    {
        int i,c=0,no;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 20 NUMBERS:");
        int a[]=new int[20];
        for(i=0;i<20;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<20;i++)
        {
            no=a[i];
            for(i=2;i<no;i++)
            {
                if(no%i==0)
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.print(no);
            }
            c=0;
        }
    }
}
        