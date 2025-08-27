import java.util.*;
public class DDA_even_odd
{
    public static void main(String args[])
    {
        int i,j,e=0,o=0;
        int n[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUES:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                n[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(n[i][j]%2==0)
                {
                    e++;
                }
                else
                {
                    o++;
                }
            }
        }
        System.out.println("THE NUMBER OF EVEN NUMBERS PRESENT IN THE DOUBLE DIMENTIONAL MATRIX ARE:"+e);
        System.out.println("THE NUMBER OF ODD NUMBERS PRESENT IN THE DOUBLE DIMENTIONAL MATRIX ARE:"+o);            
    }
}
                
            
        