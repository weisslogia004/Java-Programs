import java.util.*;
public class sel_sort
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int temp=0;
        System.out.println("ENTER THE VALUES:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            int min=i;;
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}