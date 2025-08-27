import java.util.*;
public class DDA_sum
{
    public static void main(String args[])
    {
        int i,j,s=0;
        int m[][]={{3,0,5,6},{7,8,9,10},{11,12,13,14}};
        for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
                s=s+m[i][j];
            }
        }
        System.out.println("THE SUM OF THE ELEMENTS IN THE DOUBLE DIMENSIONAL ARRAY(DDA) IS:"+s);
    }
}

      
            