import java.util.*;
class pg226_9
{
    int isComposite(int n)
    {
        int c=0,flag1=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c>2)
            flag1=1;
        return flag1;
    }
    int sumofdgt(int n)
    {
        int s=0,r;
        while(n>0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        return s;
    }
    int isMagic(int n)
    {
        int flag2=0;
        int a=sumofdgt(n);
        while(a>9)
        {
            a=sumofdgt(a);
        }
                     
        if(a == 1)
            flag2=1;
        return flag2;
    }
    public static void main(String args[])
    {
        pg226_9 obj=new pg226_9();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lower limit(m):");
        int m=sc.nextInt();
        System.out.print("Enter the upper limit(n):");
        int n=sc.nextInt();
        int c=0;
        if (m<n)
        {
            System.out.println("The Composite Magic Integers are:");
            for(int i=m; i<=n; i++)
            {
                int x=obj.isComposite(i);
                int y=obj.isMagic(i);
                if(x==1 && y==1)
                {
                    if (c==0)
                        System.out.println(i);
                    else
                        System.out.println(i);
                    c++;
                }
            }
            System.out.println("The frequency of Composite Magic Integers is:"+c);
        }
        else
            System.out.println("Invalid Input!!!");
    }
}

