import java.util.*;
public class C_Prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int l = s.length();
        int flag = 0;
        C_Prime obj=new C_Prime();
        int x=obj.isPrime(n);
        for(int i = 1; i <= l; i++)
        {
            if(x==0)
                flag=1;
            System.out.println(n);
            char ch=s.charAt(0);
            s = s.substring(1) + ch;
            n = Integer.parseInt(s);
        }
        if(flag==1)
            System.out.println(n + " IS A CIRCULAR PRIME.");
        else
            System.out.println(n + " IS NOT A CIRCULAR PRIME.");
    }
    public static int isPrime(int n)
    {
        int i;
        int f=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
            }
        }
        return(f);
    }
}