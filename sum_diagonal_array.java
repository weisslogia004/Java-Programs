import java.util.*;
public class sum_diagonal_array
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
        System.out.print("The Elements are:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j)
                {
                    System.out.print(a[i][j]);
                }
                else if((i+j)==2)
                {
                    System.out.print(a[i][j]);
                }
                else
                {
                    System.out.print(a[i][j]);
                }
            }
        }
    }
}
                    
           