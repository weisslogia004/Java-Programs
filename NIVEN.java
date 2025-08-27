import java.util.*;
public class NIVEN
{
    public static void main(int n)
    {
        int s=0,R;
        int c=n;
        while(n!=0)
        {
            R=n%10;
            s=s+R;
            n=n/10;
        }
        if(c%s==0)
        {
            System.out.println("IT IS NIVEN NUMBER.");
        }
        else
        {
            System.out.println("IT IS NOT A NIVEN NUMBER.");
        }
    }
}
            
            