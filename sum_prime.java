import java.util.*;
public class sum_prime
{
    public static void main(String args[])
    {
        int i,x=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number of range:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number of range:");
        int b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
          int no=i;
          f1=obj.isPrime(no);
          if(f1==0)
          {
           while(no>0)
           {
              r=no%10;
              s=s+r;
              no=no/10;
           }
           if(flag==1)
           { 
              System.out.println(i);
           }
           else
           {
             System.out.println("None Found!!!");
           }
        }
        }
    }
    int isPrime(no)
    {
        int i,flag=0;
        for(i=0;i<=no;i++)
        {
            if(no%i==0)
            {
                flag=1;
            }
        }
        return(flag);
    }
}























 

    
            
    
    
            
        