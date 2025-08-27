import java.util.*;
public class ARRAY
{
    public static void main(String args[])
    {
        int noe,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS:");
        noe=sc.nextInt();
        int a[]=new int[noe];
        System.out.println("ENTER "+noe+" NUMBERS:");
        for(i=0;i<noe;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("THE VALUES ARE:");
        for(i=0;i<noe;i++)
        {
            System.out.println(a[i]);
        }
    }
}
        