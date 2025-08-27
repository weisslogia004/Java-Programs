import java.util.*;
public class trnsps
{
    public static void main(String args[])
    {
        int
        int m[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n[][]=new int[4][4];
        System.out.println("The numbers of the Matrix are:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.print();
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<=4;j++)
            {
                n[i][j]=m[i][j];
            }
        }
        System.out.println("The transpose of the Matrix is:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(n[i][j]+"");
            }
            System.out.print(
            
                
        
        