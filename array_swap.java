import java.util.*;
public class array_swap
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of the range:");
        int a[][]=new int[4][4];
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(j=0;j<4;j++)
        {
            int t=a[0][j];
            a[0][j]=a[3][j];
            a[3][j]=t;
        }
        System.out.println("Swapped Array");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
    }
}
