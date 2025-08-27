import java.util.*;
public class array_ascending
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k,a[][];
        System.out.println("Enter the numbers of the range:");
        int ax[]=new int[4];
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                ax[j]=a[i][j];
                sort(ax);
                for(k=0;k<4;k++)
                {
                    a[i][k]=ax[k];
                }
            }
        }
    }
    void sort(int ax[])
    {
        int i,j,t;
        for(i=0;i<3;i++)
        {
            for(j=i+1;j<4;j++)
            {
                if(ax[i]>ax[j])
                {
                    t=ax[i];
                    ax[i]=ax[j];
                    ax[j]=t;
                }
            }
        }
    }
}