import java.util.*;
public class Special
{
    public static void main(String args[])
    {
        int no,a,b,i,f=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First value of the range");
        a=sc.nextInt();
        System.out.print("Enter the Second value of the range");
        b=sc.nextInt();
        Special obj=new Special();
        for(i=a;i<=b;i++)
        {
            no=i;
            f=obj.isSpecial(no);
            if(f==1)
            {
                System.out.print(no);
            }
        }
    }
    int isSpecial(int no)
    {
        int s=0,i,r,num,f;
        num=no;
        while(no>0)
        {
            r=no%10;
            f=1;
            for(i=1;i<=r;i++)
            {
                f=f*i;
            }
            s=s+f;
            no=no/10;
        }
        if(s==num)
        {
            f=1;
        }
        else
        {
            f=0;
        }
        return(f);
    }
}
        