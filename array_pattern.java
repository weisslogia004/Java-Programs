import java.util.*;
public class array_pattern
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
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
                if(j>i)
                {
                    System.out.print(a[i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print();
        }
    }
}