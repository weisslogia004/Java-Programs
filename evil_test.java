import java.util.*;
public class evil_test
{
    public static void main(String args[])
    {
        int n,r,d=0;
        String i=" ";
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A DECIMAL(NUMBER WITH BASE 10)NUMBER:");
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%2;
            i=Integer.toString(r)+i;
            n=n/2;
            d=Integer.parseInt(i);
        }
        System.out.println("THE BINARY EQUIVALENT OF THE DECIMAL NUMBER YOU HAVE ENTERED IS:"+d);
        while(d>0)
        {
            int c=0;
            r=d%10;
            if(r==1)
            {
                c++;
                d=d/10;
                if(c%2==0)
                {
                    System.out.println("Evil Number.");
                }
                else
                {
                    System.out.println("NOT.");
                }
            }
        }
    }
}
                
