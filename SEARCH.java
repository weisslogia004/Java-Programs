import java.util.*;
public class SEARCH
{
    public static void main(String args[])
    {
        int i,pos=-1,search;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS OF ELEMENTS:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER "+n+" INTEGERS");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("ENTER THE VALUE TO BE SEARCHED:");
        search=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==search)
            {
                pos=i+1;
                break;
            }
        }
        if(pos==-1)
        {
            System.out.println(search+" is not present in this array!!!");
        }
        else
        {
            System.out.println(search+" is present at location "+pos+".");
        }
    }
}

