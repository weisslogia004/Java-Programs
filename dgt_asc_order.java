import java.util.*;
public class dgt_asc_order
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int n=sc.nextInt();
        int i,p,r;
        System.out.println("THE DIGITS OF THE NUMBER IN ASCENDING ORDER:");
        for(i=0;i<10;i++)
        {
            p=n;
            while(p!=0)
            {
                r=p%10;
                if(r==i)
                {
                    System.out.print(r+",");
                }
                p=p/10;
            }
        }
        System.out.println();
    }
}