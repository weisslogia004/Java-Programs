import java.util.*;
public class DDA_1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int a[][]=new int[3][4];
        System.out.println("ENTER ALL THE NUMBERS AT A TIME:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("THE NUMBERS IN THE DOUBLE DIMENSIONAL ARRAY(DDA) ARE:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
                
        
        
            
        