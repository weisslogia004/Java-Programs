import java.util.*;
public class sample_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int m[][]=new int[3][4];
        System.out.println("ENTER NUMBERS ONE BY ONE:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println("THE ELEMENTS IN THE CELL:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
            
        