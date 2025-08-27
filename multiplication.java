import java.util.*;
public class multiplication
{
    public static void main(String args[])
    {
        int i,n,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE");
        n=sc.nextInt();
        for(i=1; i<=10; i++)
        {
            t=n*i;
            System.out.println(n+"x"+i+"="+t);
        }
    }
}
        
        

