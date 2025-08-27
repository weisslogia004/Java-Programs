import java.util.*;
public class Captain_Jack_Sparrow
{
    public static void main(String args[])
    {
        int n,c=0,no,r,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        n=sc.nextInt();
        no=n;
        while(n>0)
        {
            r=n%10;
            c++;
            n=n/10;
        }
        while(no>0)
        {
            r=no%10;
            if(c%2!=0)
            {
                count++;
            }
            no=no/10;
        }
        no=no/10;
        System.out.print(count);
    }
}
 