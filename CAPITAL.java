import java.util.*;
public class CAPITAL
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,a=0,k=0;
        String st;
        String m[]=new String[10];
        String n[]=new String[10];
        for(i=0;i<10;i++)
        {
            System.out.println("ENTER THE NAME OF THE STATES:");
            m[i]=sc.nextLine();
            System.out.println("ENTER THE NAME OF THE STATE CAPITALS:");
            n[i]=sc.nextLine();
        }
        System.out.println("ENTER THE STATE WHOSE CAPITAL IS TO BE SEARCHED:");
        st=sc.nextLine();
        for(i=0;i<10;i++)
        {
            if(m[i].equals(st))
            {
                k=1;
                a=i;
            }
        }
        if(k==1)
        {
            System.out.println("THE CAPITAL IS"+n[a]);
        }
        else
        {
            System.out.println("THE STATE"+st+"IS NOT FOUND AT ANY LOCATION");
        }
    }
}
            
            
        