import java.util.*;
public class pascal_triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,k,p=5;
        int m[]=new int[20];
        System.out.println("ENTER NUMBER OF ROWS OF THE PASCAL'S TRIANGLE:");
        n=sc.nextInt();
        m[0]=1;
        for(i=0;i<n;i++)
        {
            for(k=p;k>=1;k--)
            System.out.print(" ");
            for(j=0;j<=i;j++)
            System.out.print(m[j]+" ");
            System.out.println();
            p--;
            for(j=i+1;j>0;j--)
            m[j]=m[j]+m[j-1];
        }
    }
}
            
              