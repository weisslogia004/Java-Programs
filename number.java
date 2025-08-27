import java.util.*;
public class number
{
    public static void main(String args[])
    {
        int no,i,j,k=1,s;
        String x;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        no=sc.nextInt();
        for(i=1;i<no;i++)
        {
            s=0;
            j=i;
            x="";
            for(;;)
            {
                s+=j;
                x=x+Integer.toString(j);
                if(s==no||s>no)
                    break;
                j++;
            }
            if(s==no)
            {
                System.out.println(x+" ");
            }
        }
    }
}
                
        