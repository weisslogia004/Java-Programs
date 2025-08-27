import java.util.*;
public class MIN_MAX
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,max,min;
        int m[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("ENTER THE NUMBER IN THE CELL:");
            m[i]=sc.nextInt();
        }
        max=m[0];
        min=m[0];
        for(i=0;i<10;i++)
        {
            if(m[i]>max)
            {
            max=m[i];
        }
            if(m[i]<min)
            min=m[i];
        }
        System.out.println("THE GREATEST OF THE ARRAY ELEMENTS:"+max);
        System.out.println("THE SMALLEST OF THE ARRAY ELEMENTS:"+min);
    }
}
        
    