import java.util.*;
public class diagonal_sum
{
    public static void main(String args[])
    {
        int i,j;
        int a[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                if((i==j) && ((i+j)==3))
                {
                    System.out.println(a[i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }
    }
}