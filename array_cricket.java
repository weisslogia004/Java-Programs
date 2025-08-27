import java.util.*;
public class array_cricket
{
    public static void main(String args[])
    {
        int i,max=0;
        String name="";
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NAMES OF ELEVEN PLAYERS:");
        String n[]=new String[11];
        System.out.println("ENTER THE RUNS OF ELEVEN PLAYERS:");
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
        System.out.println("THE PLAYER WITH THE HIGHEST SCORE:"+max);
        System.out.println("THE NAME OF THE PLAYER WITH THE HIGHEST SCORE:"+name);
    }
}
