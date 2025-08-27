import java.util.*;
public class PRONIC
{
    public static void main(String args[])
    {
        int i,flag=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int p=i*(i+1);
            if(p==n)
            {
                flag=1;
                break;
            }
            if(flag==1)
            {
                System.out.println("PRONIC NUMBER!!!");
            }
            else
            {
                System.out.println("NOT PRONIC NUMBER!!!");
            }
        }
    }
}
        
