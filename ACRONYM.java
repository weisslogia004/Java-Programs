import java.util.*;
public class ACRONYM
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NAME");
        String str=sc.nextLine();
        str=" "+str;
        int l=str.length();
        for(i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                char ch1=str.charAt(i+1);
                System.out.print(ch1);
            }
        }
    }
}
                