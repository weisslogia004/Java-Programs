import java.util.*;
public class factor
{
    public static void main(String args[])
    {
        int i,n;
        Scanner sc=new Scanner(System.in); 
        System.out.println("ENTER A NUMBER");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("THE FACTORS ARE "+i);
            }
        }
    }
}
              