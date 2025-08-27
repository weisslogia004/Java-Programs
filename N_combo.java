import java.util.*;
class N_combo
{
      public static void main(String args[])
      {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number:"); 
            int n=sc.nextInt();
            combi(n);
      }
      static void combi(int n)
      {
            int s=0,c=0,j=0;
            for(int i=1;i<n;i++)
            {
                s=i;
                j=i+1;
                while(s<n)
                {
                    s=s+j;
                    j++;
                }
                if(s==n)
                {
                    for(int k=i;k<j;k++)
                    {
                         if(k==i)
                         System.out.print(k);
                         else
                         System.out.print("+"+k);
                    }
                    System.out.println();
                }
            }
      }
}

