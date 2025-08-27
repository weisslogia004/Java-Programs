import java.util.*;
public class prime_palin
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.print("ENTER THE STARTING NUMBER OF THE RANGE:"); 
         int a=sc.nextInt();
         System.out.print("ENTER THE ENDING NUMBER OF THE RANGE:");
         int b=sc.nextInt();
         for(int i=a;i<b;i++)
         {
             int rev=0;
             int n=i;
             while(n!=0) 
             {
                  int r=n%10;
                  rev=rev*10+r;
                  n=n/10;

             }
             if(i==rev)
             {
                  int flag=0;
                  for(int j=2;j<=i/2;++j)
                  {
                      if(i%j==0)
                      {
                          flag=1;
                          break;
                      }
                  }
                  if(flag==1)
                  {
                      System.out.print(i+",");
                  }
             }
         }
    }
}