import java.util.*;
public class diagonal_add_array
{
    public static void main(String args[])
    {
        int i,j;
        int s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ROWS AND COLUMNS:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("ENTER THE VALUES:");
        int a[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(i==j)
                {
                    s=s+a[i][j];
                }
            }
        }
        System.out.print("SUM OF THE DIAGONALS IS:"+s);
    }
}
        