import java.util.*;
public class digits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r=1,c=0;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            c++;
            System.out.println("Digits:"+r);
        }
        System.out.println("Number of digits:"+c);
    }
}