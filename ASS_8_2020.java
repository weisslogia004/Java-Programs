import java.util.*;
public class ASS_8_2020
{
    public static void main(String args[])
    {
        int i,k;
        int sum=0,j=0,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=i;
            j=i+1;
            while(sum<n)
            {
                sum=sum+j;
                j++;
            }
            if(sum==n)
            {
                for(k=i;k<j;k++)
                {
                    if(k==i)
                    System.out.print(k);
                    else
                    System.out.println("+"+k);
                }
             System.out.println();
            }
        }
    }
}



                    
                  
                