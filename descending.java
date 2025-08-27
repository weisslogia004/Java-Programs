import java.util.*;
public class descending
{
    public static void main(String args[])
    {
        String s=" ";
        int no=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for(int i=9;i>=0;i--)
        {
            n=no;
            while(no>0)
            {
                int r=no%10;
                if(i==r)
                {
                    s=s+Integer.toString(r);
                }
                no=no/10;
            }
            no=n;
        }
        System.out.print(s);
    }
}