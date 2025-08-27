import java.util.*;
public class overload_characters
{
    void check(String str,char ch)
    {
        int cnt=0;
        char c;
        for(int i=0;i<str.length();i++)
        {
            c=str.charAt(i);
            if(c==ch)
            {
                cnt++;
            }
            System.out.println("NUMBER OF"+ch+"PRESENT IS"+cnt);
        }
    }
    void check(String s1)
    {
        char c;
        s1=s1.toLowerCase();
        for(int i=0;i<s1.length();i++)
        {
             c=s1.charAt(i);
             if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
             {
                 System.out.println(c);
             }
        }
    }
}        
        