import java.util.*;
public class array_2D
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a[][]=new int[3][3];
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("ARRAY:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
