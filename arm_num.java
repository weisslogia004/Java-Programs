import java.util.*;
public class arm_num
{
    int n,s;
    arm_num(int nn)
    {
        n=nn;
        int l=0;
    }
    void countDigit()
    {
        int l=0;
        while(n>0)
        {
            int r=n%10;
            l++;
            n=n/10;
        }
    }
    int sum_pow(int l)
    {
        int s=0,r;
        while(n>0)
        {
            r=n%10;
            s=s+(int)Math.pow(r,l);
            n=n/10;
        }
        return(s);
    }
    void isArmstrong()
    {
        int x;
        x=sum_pow();
        if(n==x)
        {
            System.out.print("Armstrong");
        }
        else
        {
            System.out.print("NOT Armstrong");
        }
    }
    public static void main(String args[])
    {
        arm_num obj=new arm_num(n);
        obj.count();
        obj.isArmstrong();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    }
}