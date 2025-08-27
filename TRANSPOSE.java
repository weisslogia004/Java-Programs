import java.util.*;
public class TRANSPOSE
{
    public static void main(String args[])
    {
        int i,j;
        int m[][]=new int[4][4];
        int n[][]=new int[4][4];
        System.out.println("ENTER THE NUMBER OF THE DOUBLE DIMENSIONAL ARRAY:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.println(m[i][j]+"");
            }
            System.out.println();
        }
        for(i=0;i<4;i++);
        {
            for(j=0;j<4;j++)
            {
               n[4][4]=m[4][4];
            }
        }
        System.out.println("THE TRANSPOSE OF THE DOUBLR DIMENSIONAL ARRAY IS:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(n[i][j]+"");
            }
            System.out.println();
        }
    }
}
        
        
        
        
