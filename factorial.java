import java.util.*;
public class factorial
{
    public static void main(String args[])
    {
        int i,n,f=1;
        Scanner sc=new Scanner(System.in); 
        System.out.println("ENTER A NUMBER");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            
            {
                f=f*i;
            }
            System.out.println("THE FACTORIAL IS"+f);
        }
    }
}
