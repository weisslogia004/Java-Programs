import java.util.*;
public class n_number
{
    public static void main(String args[])
    {
        int n=0;
        int no=n;
        int c=0;
        int num=n;
        int m=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range:");
        n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            n=i;
            no=n;
            num=n;
            while(n>0)
            {
                int r=n%10;
                c++;
                int q=n/10;
                n=q;
            }
            int s=0;
            while(no>0)
            {
                int r=no%10;
                s=s+(int)Math.pow(r,c);
                int q=no/10;
                no=q;
            }
            if(s==num)
            {
                System.out.print(num);
            }
        }
    }
}
            
        