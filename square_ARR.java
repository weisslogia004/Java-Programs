import java.util.*;
public class square_ARR
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 20 NUMBERS:");
        int no[]=new int[20];
        for(i=0;i<20;i++)
        {
            no[i]=sc.nextInt();
        }
        for(i=0;i<20;i++)
        {
            double d=Math.sqrt(no[i]);
            int d1=(int)d;
            if(d==d1)
            {
                System.out.print(no[i]);
            }
        }
    }
}
            