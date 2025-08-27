import java.util.*;
public class CONVERT
{
    public static void main(String args[])
    {
        int i;
        String str1="";
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A STRING:");
        String str=sc.nextLine();
        str=' '+str;
        int l=str.length();
        for(i=0;i<l;i++)
        {
            char chr=str.charAt(i);
            if(chr==' ')
            {
                char ch1=str.charAt(i+1);
                str1=str1+' '+Character.toUpperCase(ch1);
                i=i+1;
            }
            else
            {
                  str1=str1+chr;
            }
            System.out.println("THE NEW STRING AFTER CHANGING THE FIRST LETTER OF THE WORD:");
            System.out.println(str1);
        }
    }
}
        