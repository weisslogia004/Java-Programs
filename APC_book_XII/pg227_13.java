import java.util.*;
public class pg227_13
{
    public static void main(String args[])
    {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int p=i*(i+1);
            if(p==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Pronic Number.");
        }
        else
        {
            System.out.println("Not Pronic Number.");
        }
    }
}
 
            
        