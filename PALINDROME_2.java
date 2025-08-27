import java.util.*;
public class PALINDROME_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A WORD:");
        String str=sc.next();
        PALINDROME_2 obj=new PALINDROME_2();
        obj.check(str);
    }
    void check(String str)
    {
        int l;
        String s="";
        l=str.length();
        for(int i=l-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            s=str+s;
        }
        if(s.equals(str))
        {
            System.out.println("PALINDROME!!!");
        }
        else
        {
            System.out.println("NOT PALINDROME!!!");
        }
    }
}
            
