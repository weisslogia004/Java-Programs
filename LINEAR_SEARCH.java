import java.util.*;
public class LINEAR_SEARCH
{
    public static void main(String args[])
    {
        int i,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TEN CITIES ALONG WITH THEIR S.T.D. CODES:");
        String city[]=new String[10];
        int std[]=new int[10];
        for(i=0;i<10;i++)
        {
            city[i]=sc.nextLine();
            std[i]=sc.nextInt();
        }
        System.out.print("ENTER THE NAME OF THE CITY TO BE SEARCHED");
        String ct=sc.nextLine();
        for(i=0;i<10;i++)
        {
            if(city[i].equals(ct))
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.print("THE SEARCH IS SUCCESSFULL!!! :) :)");
            System.out.print("THE S.T.D. CODE OF THE CITY YOU HAVE ENTERED IS:"+std[i]);
        }
        else
        {
            System.out.print("THE CITY YOU HAVE ENTERED IS NOT FOUND!!! :( :(");
        }
    }
}
            

        