import java.util.*;
public class bin_search
{
    public static void main(String args[])
    {
        int i,f,l,m,n,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER "+n+" INTEGERS:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("ENTER THE VALUE TO BE SEARCHED:");
        s=sc.nextInt();
        f=0;
        l=n-1;
        m=(f+l)/2;
        while(f<=l)
        {
            if(a[m]==s)
            {
                System.out.println(s+" FOUND AT LOCATION "+(m+1)+".");
                break;
            }
            else if(a[m]<s)
            {
                f=m+1;
            }
            m=(f+l)/2;
        }
        if(f>l)
        {
            System.out.println(s+" IS NOT PRESENT IN THE LIST.\n");
        }
    }
}
            
           
