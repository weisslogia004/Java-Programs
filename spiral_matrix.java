import java.util.*;
public class spiral_matrix
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a range:");
        n=sc.nextInt();
        int a[][]=new int[n][n];
        int k=1,r1=0,c1=0,r2=n-1,c2=n-1,i,j;
        while(k<=n*n)
        {
            for(i=c1;i<=c2;i++)
            {
                a[r1][i]=k;
                k++;
            }
            for(j=r1+1;j<=r2;j++)
            {
                a[j][c2]=k;
                k++;
            }
            for(i=c2-1;i>=c1;i--)
            {
                a[r2][i]=k;
                k++;
            }
            for(j=r2-1;j>=r1+1;j--)
            {
                a[j][c1]=k;
                k++;
            }
            c1++;
            c2--;
            r1++;
            r2--;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
           
        
        
        

        