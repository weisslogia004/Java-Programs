import java.util.*;
public class pg227_11
{
    public static void main(String args[])
    {
        int n,r,c=0,flag=0;
        String d=" ";
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A DECIMAL(NUMBER WITH BASE 10)NUMBER:");
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%2;
            d=Integer.toString(r)+d;
            n=n/2;
        }
        System.out.println("THE BINARY EQUIVALENT OF THE DECIMAL NUMBER YOU HAVE ENTERED IS:"+d);
        int l=d.length();
        for(int i=0;i<l;i++)
        {
            char ch=d.charAt(i);
            if(ch=='1')
            {
                c++;
            }
        }
        if(c%2==0)
        {
            flag=1;
        }
        if(flag==1)
        {
            System.out.println("Evil Number.");
        
        }
        else
        {
            System.out.println("Not an Evil Number.");
        }
    }
}
                    