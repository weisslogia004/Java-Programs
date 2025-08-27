import java.util.*;
public class array_swap_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers:");
        int a[][]=new int[5][5];
        int temp[]=new int[5];
        for(int i=0;i<5;i++)
        {
            int temp[i]=a[3][i];
        }
        for(i=2;i>=0;i--)
        {
            for(int j=0;j<5;j++)
            {
                a[i+1][j]=a[i][j];
            }
        }
        for(i=0;i<4;i++)
        {
            a[0][i]=temp[i];
        }
    }
}