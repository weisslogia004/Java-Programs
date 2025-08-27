import java.util.*;
public class number2
{
    public static void main(String args[])
    {
        int no,i,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        no=sc.nextInt();
        number2 obj=new number2();
        for(i=1;i<no;i++)
        {
            if(no%i==0)
            {
                f=obj.isPrime(i);
                if(f==0)
                {
                    System.out.println(i);
                }
            }
        }
    }
    int isPrime(int no)
    {
        int i,flag=0;
        for(i=2;i<no;i++)
        {
            if(no%i==0)
            {
                flag=1;
                break;
            }
        }
        return(flag);
    }
}