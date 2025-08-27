import java.util.*;
public class auto
{
    public static void main(String args[])
    {
        int n,c=1,i;
        String s1,c1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a range:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            int sq=c*c;
            s1=Integer.toString(sq);
            c1=Integer.toString(c);
            if(s1.endsWith(c1))
            {
                System.out.print(c+",");
            }
            c++;
        }
    }
}