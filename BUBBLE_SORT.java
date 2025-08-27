import java.util.*;
public class BUBBLE_SORT
{
    public static void main(String args[])
    {
        int temp=0,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER THE VALUES:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<(n-i-1);j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
                
        