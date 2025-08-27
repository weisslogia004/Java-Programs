import java.util.*;
public class encode
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A STRING:");
        String str=sc.nextLine();
        str=str.toUpperCase();
        int l=str.length();
        for(i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            int chn=(int)ch+2;
            char str2=(char)chn;
            System.out.print(str2);
        }
    }
}
            
            
            
        
        
        
    