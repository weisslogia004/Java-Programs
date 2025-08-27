import java.util.*;
public class DDA_square_root
{
    public static void main(String args[])
    {
        int i,j,s=0;
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
               s=s+a[i][j];
               System.out.println("THE SUM OF THE DOUBLE DIMENSIONAL ARRAY IS:"+s);
            }
        }
    }
}