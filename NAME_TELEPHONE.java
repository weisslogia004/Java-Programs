import java.util.*;
public class NAME_TELEPHONE
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,a=0,k=0;
        String name,b="";
        String m[]=new String[20];
        long n[]=new long[20];
        for(i=0;i<5;i++)
        {
            System.out.println("ENTER NAME ONE BY ONE:");
            m[i]=sc.nextLine();
            System.out.println("ENTER CORRESPONDING TELEPHONE NUMBER ONE BY ONE:");
            n[i]=sc.nextLong();
        }
        System.out.println("ENTER THE NAME TO BE SEARCHED:");
        name=sc.nextLine();
        for(i=0;i<=5;i++)
        {
            if(m[i].equals(name))
            {
                k=1;
                a=i;
                b=m[i];
            }
        }
        if(k==1)
        {
            System.out.println("THE NAME IS "+b+" AND THE TELEPHONE NUMBER NUMBER IS "+n[a]);
        }
        else
        {
            System.out.println(name+" IS NOT FOUND AT ANY LOCATION!!!");
        }
    }
}
        
            