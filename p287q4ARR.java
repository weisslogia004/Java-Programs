import java.util.*;
public class p287q4ARR
{
    public static void main(String args[])
    {
        int max=0,i;
        String name="";
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME OF ELEVEN PLAYERS:");
        String n[]=new String[11];
        System.out.println("ENTER THE RUNS OF THE ELEVEN PLAYERS:");
        int r[]=new int[11];
        for(i=0;i<11;i++)
        {
            n[i]=sc.nextLine();
            r[i]=sc.nextInt();
        }
        for(i=0;i<11;i++)
        {
            if(r[i]>max)
            {
                max=r[i];
                name=n[i];
            }
        }
        System.out.println("HIGHEST RUN:"+max);
        System.out.println("NAME OF THE HIGHES RUN SCORER:"+name);
    }
}
        
        