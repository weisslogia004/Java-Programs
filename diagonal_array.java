import java.util.*;
public class diagonal_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER ROWS AND COLUMNS:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("ENTER THE VALUES:");
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<10;i++)
        {
            if(i==j||i+j==3)
            {
                System.out.print(a[i][j]);
            }
            else
            {
                System.out.println("");
            }
        }
        System.out.print();
    }
}
                
                
        
        
        
        