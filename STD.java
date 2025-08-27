import java.util.*;
public class STD
{
    public static void main(String args[])
    {
        int flag=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE 10 CITY NAMES & THEIR S.T.D. CODES:");
        String ct[]=new String[10];
        int std[]=new int[10];
        for(i=0;i<10;i++)
        {
            ct[i]=sc.nextLine();
            std[i]=sc.nextInt();
        }
        System.out.println("ENTER THE NAME OF THE CITY TO BE SEARCHED:");          
        String city=sc.nextLine();
        for(i=0;i<10;i++) 
        {
            if(ct[i].equals(city))
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.print("SEARCH SUCCESSFULL!!!");
            System.out.print("S.T.D. CODE:"+std[i]);
        }
        else
        {
            System.out.print("NOT FOUND!!!");
        }
    }
}
        
        
        